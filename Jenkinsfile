@Library('Checkout-Lib@main')_
node
{
  stage('Gitcheckout')
  {
     sourcecheckout('https://github.com/MandeepKaur915/shared-lib.git','main')
  }
  stage('Build war file')
  {
     pipeline('Build')
  }
}
