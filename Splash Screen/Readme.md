```java
 Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(SplashScreen.this, LoginPage.class);
                    startActivity(intent);
                    finish();
                }
            }
        }; thread.start();
```