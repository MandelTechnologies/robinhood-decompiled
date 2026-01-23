package com.robinhood.android.isa.isatransferfunds.microgram;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.identi.AddressStore;
import com.robinhood.librobinhood.data.store.identi.FullNinStore;
import com.robinhood.librobinhood.data.store.identi.ProfileInfoStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RealIsaTransferFundsPersonalInfoService_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/isa/isatransferfunds/microgram/RealIsaTransferFundsPersonalInfoService_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/isa/isatransferfunds/microgram/RealIsaTransferFundsPersonalInfoService;", "fullNinStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/identi/FullNinStore;", "profileInfoStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "addressStore", "Lcom/robinhood/librobinhood/data/store/identi/AddressStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-isa-transfer-funds_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class RealIsaTransferFundsPersonalInfoService_Factory implements Factory<RealIsaTransferFundsPersonalInfoService> {
    private final Provider<AddressStore> addressStore;
    private final Provider<FullNinStore> fullNinStore;
    private final Provider<ProfileInfoStore> profileInfoStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RealIsaTransferFundsPersonalInfoService_Factory create(Provider<FullNinStore> provider, Provider<ProfileInfoStore> provider2, Provider<AddressStore> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final RealIsaTransferFundsPersonalInfoService newInstance(FullNinStore fullNinStore, ProfileInfoStore profileInfoStore, AddressStore addressStore) {
        return INSTANCE.newInstance(fullNinStore, profileInfoStore, addressStore);
    }

    public RealIsaTransferFundsPersonalInfoService_Factory(Provider<FullNinStore> fullNinStore, Provider<ProfileInfoStore> profileInfoStore, Provider<AddressStore> addressStore) {
        Intrinsics.checkNotNullParameter(fullNinStore, "fullNinStore");
        Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
        Intrinsics.checkNotNullParameter(addressStore, "addressStore");
        this.fullNinStore = fullNinStore;
        this.profileInfoStore = profileInfoStore;
        this.addressStore = addressStore;
    }

    @Override // javax.inject.Provider
    public RealIsaTransferFundsPersonalInfoService get() {
        Companion companion = INSTANCE;
        FullNinStore fullNinStore = this.fullNinStore.get();
        Intrinsics.checkNotNullExpressionValue(fullNinStore, "get(...)");
        ProfileInfoStore profileInfoStore = this.profileInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(profileInfoStore, "get(...)");
        AddressStore addressStore = this.addressStore.get();
        Intrinsics.checkNotNullExpressionValue(addressStore, "get(...)");
        return companion.newInstance(fullNinStore, profileInfoStore, addressStore);
    }

    /* compiled from: RealIsaTransferFundsPersonalInfoService_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/isa/isatransferfunds/microgram/RealIsaTransferFundsPersonalInfoService_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/isa/isatransferfunds/microgram/RealIsaTransferFundsPersonalInfoService_Factory;", "fullNinStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/identi/FullNinStore;", "profileInfoStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "addressStore", "Lcom/robinhood/librobinhood/data/store/identi/AddressStore;", "newInstance", "Lcom/robinhood/android/isa/isatransferfunds/microgram/RealIsaTransferFundsPersonalInfoService;", "feature-isa-transfer-funds_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RealIsaTransferFundsPersonalInfoService_Factory create(Provider<FullNinStore> fullNinStore, Provider<ProfileInfoStore> profileInfoStore, Provider<AddressStore> addressStore) {
            Intrinsics.checkNotNullParameter(fullNinStore, "fullNinStore");
            Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
            Intrinsics.checkNotNullParameter(addressStore, "addressStore");
            return new RealIsaTransferFundsPersonalInfoService_Factory(fullNinStore, profileInfoStore, addressStore);
        }

        @JvmStatic
        public final RealIsaTransferFundsPersonalInfoService newInstance(FullNinStore fullNinStore, ProfileInfoStore profileInfoStore, AddressStore addressStore) {
            Intrinsics.checkNotNullParameter(fullNinStore, "fullNinStore");
            Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
            Intrinsics.checkNotNullParameter(addressStore, "addressStore");
            return new RealIsaTransferFundsPersonalInfoService(fullNinStore, profileInfoStore, addressStore);
        }
    }
}
