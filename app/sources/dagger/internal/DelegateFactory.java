package dagger.internal;

/* loaded from: classes21.dex */
public final class DelegateFactory<T> implements Factory<T> {
    private Provider<T> delegate;

    @Override // javax.inject.Provider
    public T get() {
        Provider<T> provider = this.delegate;
        if (provider == null) {
            throw new IllegalStateException();
        }
        return provider.get();
    }

    public static <T> void setDelegate(Provider<T> delegateFactory, Provider<T> delegate) {
        setDelegateInternal((DelegateFactory) delegateFactory, delegate);
    }

    private static <T> void setDelegateInternal(DelegateFactory<T> delegateFactory, Provider<T> delegate) {
        Preconditions.checkNotNull(delegate);
        if (((DelegateFactory) delegateFactory).delegate != null) {
            throw new IllegalStateException();
        }
        ((DelegateFactory) delegateFactory).delegate = delegate;
    }
}
