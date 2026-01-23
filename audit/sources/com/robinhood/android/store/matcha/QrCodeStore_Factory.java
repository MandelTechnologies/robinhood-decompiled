package com.robinhood.android.store.matcha;

import android.content.Context;
import com.robinhood.android.bitmap.BitmapStore;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QrCodeStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/QrCodeStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/store/matcha/QrCodeStore;", "context", "Ljavax/inject/Provider;", "Landroid/content/Context;", "encryptedUserIdStore", "Lcom/robinhood/android/store/matcha/EncryptedUserIdStore;", "bitmapStore", "Lcom/robinhood/android/bitmap/BitmapStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class QrCodeStore_Factory implements Factory<QrCodeStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<BitmapStore> bitmapStore;
    private final Provider<Context> context;
    private final Provider<EncryptedUserIdStore> encryptedUserIdStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final QrCodeStore_Factory create(Provider<Context> provider, Provider<EncryptedUserIdStore> provider2, Provider<BitmapStore> provider3, Provider<StoreBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final QrCodeStore newInstance(Context context, EncryptedUserIdStore encryptedUserIdStore, BitmapStore bitmapStore, StoreBundle storeBundle) {
        return INSTANCE.newInstance(context, encryptedUserIdStore, bitmapStore, storeBundle);
    }

    public QrCodeStore_Factory(Provider<Context> context, Provider<EncryptedUserIdStore> encryptedUserIdStore, Provider<BitmapStore> bitmapStore, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(encryptedUserIdStore, "encryptedUserIdStore");
        Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.context = context;
        this.encryptedUserIdStore = encryptedUserIdStore;
        this.bitmapStore = bitmapStore;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public QrCodeStore get() {
        Companion companion = INSTANCE;
        Context context = this.context.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        EncryptedUserIdStore encryptedUserIdStore = this.encryptedUserIdStore.get();
        Intrinsics.checkNotNullExpressionValue(encryptedUserIdStore, "get(...)");
        BitmapStore bitmapStore = this.bitmapStore.get();
        Intrinsics.checkNotNullExpressionValue(bitmapStore, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(context, encryptedUserIdStore, bitmapStore, storeBundle);
    }

    /* compiled from: QrCodeStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/QrCodeStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/store/matcha/QrCodeStore_Factory;", "context", "Ljavax/inject/Provider;", "Landroid/content/Context;", "encryptedUserIdStore", "Lcom/robinhood/android/store/matcha/EncryptedUserIdStore;", "bitmapStore", "Lcom/robinhood/android/bitmap/BitmapStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/android/store/matcha/QrCodeStore;", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final QrCodeStore_Factory create(Provider<Context> context, Provider<EncryptedUserIdStore> encryptedUserIdStore, Provider<BitmapStore> bitmapStore, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(encryptedUserIdStore, "encryptedUserIdStore");
            Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new QrCodeStore_Factory(context, encryptedUserIdStore, bitmapStore, storeBundle);
        }

        @JvmStatic
        public final QrCodeStore newInstance(Context context, EncryptedUserIdStore encryptedUserIdStore, BitmapStore bitmapStore, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(encryptedUserIdStore, "encryptedUserIdStore");
            Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new QrCodeStore(context, encryptedUserIdStore, bitmapStore, storeBundle);
        }
    }
}
