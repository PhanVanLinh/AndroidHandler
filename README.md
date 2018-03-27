### AndroidHandler

####  Public constructors
1)  Handler()
> Default constructor associates this handler with the [Looper](https://developer.android.com/reference/android/os/Looper.html) for the current thread.
2) Handler(Looper looper)
> example: new Handler(Looper.getMainLooper());
> Use the provided [Looper](https://developer.android.com/reference/android/os/Looper.html) instead of the default one.

#### Two main uses for a Handler
(1) to schedule messages and runnables to be executed as some point in the future; and (2) to enqueue an action to be performed on a different thread than your own.

1) to schedule messages and runables to be execute as some point in future
2) to enque
