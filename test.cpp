
#include "stdafx.h"

#include <iostream>

#include <fstream>

using namespace std;



const int max_n = 100;//����֧�ֵ��������

const int max_people = 10000;//����֧�ֵ��������



int n;//�����

int peopleTotal;//���������ڽ��ӵ�����

int peopleNeed[max_n];//ÿ�������Ҫ������

int gold[max_n];//ÿ������ܹ��ڳ����Ľ�����

int maxGold[max_people][max_n];//maxGold[i][j]������i������ǰj������ܹ��õ�����������������-1ʱ��ʾδ֪



//��ʼ������ 

void init()

{

    ifstream inputFile("beibao.in");

    inputFile>>peopleTotal>>n;

    for(int i=0; i<n; i++)

        inputFile>>peopleNeed[i]>>gold[i];

    inputFile.close();

            

    for(int i=0; i<=peopleTotal; i++)

        for(int j=0; j<n; j++)

            maxGold[i][j] = -1;//����-1ʱ��ʾδ֪ [��Ӧ��̬�滮�еġ�������¼��]

        

}



//����ڽ���people���˺�ǰmineNum�����ʱ�ܹ��õ�������������ע�⡰ǰ���ٸ���Ҳ�Ǵ�0��ʼ��ŵ�

int GetMaxGold(int people, int mineNum)

{

    //�������ص���������

    int retMaxGold;



    //�������������������  [��Ӧ��̬�滮�еġ�������¼��]

    if(maxGold[people][mineNum] != -1)

    {

        //��ñ���������ֵ

        retMaxGold = maxGold[people][mineNum];

    }

    else if(mineNum == 0)//�������һ�����ʱ [��Ӧ��̬�滮�еġ��߽硱]

    {

        //�������������㹻�����������

        if(people >= peopleNeed[mineNum])

        {    

            //�õ������ֵ�����������Ľ�����

            retMaxGold = gold[mineNum];

        }

        else//������Ψһ��һ�����Ҳ���ܿ���

        {

            //�õ������ֵΪ0������

            retMaxGold = 0;

        }

    }

    else if(people >= peopleNeed[mineNum])//����������˹������������ [��Ӧ��̬�滮�еġ������ӽṹ��]

    {

        //���ǿ����벻�������������ȡ���ֵ

        retMaxGold = max(GetMaxGold(people - peopleNeed[mineNum],mineNum -1) + gold[mineNum],

                                        GetMaxGold(people,mineNum - 1));

    }

    else//����������˲�������������� [��Ӧ��̬�滮�еġ������ӽṹ��]

    {

        //�����ǲ����ɵ����

        retMaxGold  = GetMaxGold(people,mineNum - 1);

    }

    

    //������¼    

    maxGold[people][mineNum] = retMaxGold;

    return retMaxGold;

}



int _tmain(int argc, _TCHAR* argv[])

{

    //��ʼ������

    init();

    //�������peopleTotal���˺�n������ܹ���õ������������ٴ����ѱ�Ŵ�0��ʼ���������һ�������Ϊn-1

    cout<<GetMaxGold(peopleTotal,n-1);

    system("pause");

    return 0;

}