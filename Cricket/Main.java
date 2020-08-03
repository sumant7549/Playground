#include<iostream>
#include <iomanip>
using namespace std;
int main()
{
  int total_balls,total_run,run_scored, balls_bowled;
  cin>>total_balls>>total_run>>run_scored>>balls_bowled;
  float total_over = total_balls/6;
  cout<<total_over<<"\n";
  int balls = balls_bowled %6;
  float ball2 = balls*0.1;
  float total_over_thrown = balls_bowled/6+ball2;
  cout<<total_over_thrown<<"\n";
  float currentrunn_rate = run_scored/total_over_thrown;
  cout<< fixed << setprecision(1) <<currentrunn_rate<<"\n";
  float run_rate = total_run/total_over;
   cout<<fixed << setprecision(1) <<run_rate<<"\n";
    if(currentrunn_rate>run_rate)
    {
      cout<<"Eligible to Win";
    }
  else
  {
    cout<<"Not Eligible to Win";
  }
}