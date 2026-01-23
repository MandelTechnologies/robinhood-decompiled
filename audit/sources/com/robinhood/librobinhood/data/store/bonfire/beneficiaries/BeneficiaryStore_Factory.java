package com.robinhood.librobinhood.data.store.bonfire.beneficiaries;

import bonfire.proto.idl.beneficiaries.p031v1.BeneficiariesService;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.bonfire.beneficiaries.mapper.BeneficiaryCreateFlowRequestMapper;
import com.robinhood.librobinhood.data.store.bonfire.beneficiaries.mapper.BeneficiaryCreateRequestMapper;
import com.robinhood.librobinhood.data.store.bonfire.beneficiaries.mapper.BeneficiaryIntroFlowRequestMapper;
import com.robinhood.librobinhood.data.store.bonfire.beneficiaries.mapper.BeneficiaryUpdateRequestMapper;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryStore_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryStore;", "beneficiariesService", "Ljavax/inject/Provider;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiariesService;", "beneficiaryIntroFlowRequestMapper", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryIntroFlowRequestMapper;", "beneficiaryCreateFlowRequestMapper", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryCreateFlowRequestMapper;", "beneficiaryCreateBeneficiaryRequestMapper", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryCreateRequestMapper;", "beneficiaryUpdateRequestMapper", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryUpdateRequestMapper;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class BeneficiaryStore_Factory implements Factory<BeneficiaryStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<BeneficiariesService> beneficiariesService;
    private final Provider<BeneficiaryCreateRequestMapper> beneficiaryCreateBeneficiaryRequestMapper;
    private final Provider<BeneficiaryCreateFlowRequestMapper> beneficiaryCreateFlowRequestMapper;
    private final Provider<BeneficiaryIntroFlowRequestMapper> beneficiaryIntroFlowRequestMapper;
    private final Provider<BeneficiaryUpdateRequestMapper> beneficiaryUpdateRequestMapper;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final BeneficiaryStore_Factory create(Provider<BeneficiariesService> provider, Provider<BeneficiaryIntroFlowRequestMapper> provider2, Provider<BeneficiaryCreateFlowRequestMapper> provider3, Provider<BeneficiaryCreateRequestMapper> provider4, Provider<BeneficiaryUpdateRequestMapper> provider5, Provider<StoreBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final BeneficiaryStore newInstance(BeneficiariesService beneficiariesService, BeneficiaryIntroFlowRequestMapper beneficiaryIntroFlowRequestMapper, BeneficiaryCreateFlowRequestMapper beneficiaryCreateFlowRequestMapper, BeneficiaryCreateRequestMapper beneficiaryCreateRequestMapper, BeneficiaryUpdateRequestMapper beneficiaryUpdateRequestMapper, StoreBundle storeBundle) {
        return INSTANCE.newInstance(beneficiariesService, beneficiaryIntroFlowRequestMapper, beneficiaryCreateFlowRequestMapper, beneficiaryCreateRequestMapper, beneficiaryUpdateRequestMapper, storeBundle);
    }

    public BeneficiaryStore_Factory(Provider<BeneficiariesService> beneficiariesService, Provider<BeneficiaryIntroFlowRequestMapper> beneficiaryIntroFlowRequestMapper, Provider<BeneficiaryCreateFlowRequestMapper> beneficiaryCreateFlowRequestMapper, Provider<BeneficiaryCreateRequestMapper> beneficiaryCreateBeneficiaryRequestMapper, Provider<BeneficiaryUpdateRequestMapper> beneficiaryUpdateRequestMapper, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(beneficiariesService, "beneficiariesService");
        Intrinsics.checkNotNullParameter(beneficiaryIntroFlowRequestMapper, "beneficiaryIntroFlowRequestMapper");
        Intrinsics.checkNotNullParameter(beneficiaryCreateFlowRequestMapper, "beneficiaryCreateFlowRequestMapper");
        Intrinsics.checkNotNullParameter(beneficiaryCreateBeneficiaryRequestMapper, "beneficiaryCreateBeneficiaryRequestMapper");
        Intrinsics.checkNotNullParameter(beneficiaryUpdateRequestMapper, "beneficiaryUpdateRequestMapper");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.beneficiariesService = beneficiariesService;
        this.beneficiaryIntroFlowRequestMapper = beneficiaryIntroFlowRequestMapper;
        this.beneficiaryCreateFlowRequestMapper = beneficiaryCreateFlowRequestMapper;
        this.beneficiaryCreateBeneficiaryRequestMapper = beneficiaryCreateBeneficiaryRequestMapper;
        this.beneficiaryUpdateRequestMapper = beneficiaryUpdateRequestMapper;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public BeneficiaryStore get() {
        Companion companion = INSTANCE;
        BeneficiariesService beneficiariesService = this.beneficiariesService.get();
        Intrinsics.checkNotNullExpressionValue(beneficiariesService, "get(...)");
        BeneficiaryIntroFlowRequestMapper beneficiaryIntroFlowRequestMapper = this.beneficiaryIntroFlowRequestMapper.get();
        Intrinsics.checkNotNullExpressionValue(beneficiaryIntroFlowRequestMapper, "get(...)");
        BeneficiaryCreateFlowRequestMapper beneficiaryCreateFlowRequestMapper = this.beneficiaryCreateFlowRequestMapper.get();
        Intrinsics.checkNotNullExpressionValue(beneficiaryCreateFlowRequestMapper, "get(...)");
        BeneficiaryCreateRequestMapper beneficiaryCreateRequestMapper = this.beneficiaryCreateBeneficiaryRequestMapper.get();
        Intrinsics.checkNotNullExpressionValue(beneficiaryCreateRequestMapper, "get(...)");
        BeneficiaryUpdateRequestMapper beneficiaryUpdateRequestMapper = this.beneficiaryUpdateRequestMapper.get();
        Intrinsics.checkNotNullExpressionValue(beneficiaryUpdateRequestMapper, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(beneficiariesService, beneficiaryIntroFlowRequestMapper, beneficiaryCreateFlowRequestMapper, beneficiaryCreateRequestMapper, beneficiaryUpdateRequestMapper, storeBundle);
    }

    /* compiled from: BeneficiaryStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryStore_Factory;", "beneficiariesService", "Ljavax/inject/Provider;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiariesService;", "beneficiaryIntroFlowRequestMapper", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryIntroFlowRequestMapper;", "beneficiaryCreateFlowRequestMapper", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryCreateFlowRequestMapper;", "beneficiaryCreateBeneficiaryRequestMapper", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryCreateRequestMapper;", "beneficiaryUpdateRequestMapper", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryUpdateRequestMapper;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryStore;", "lib-store-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BeneficiaryStore_Factory create(Provider<BeneficiariesService> beneficiariesService, Provider<BeneficiaryIntroFlowRequestMapper> beneficiaryIntroFlowRequestMapper, Provider<BeneficiaryCreateFlowRequestMapper> beneficiaryCreateFlowRequestMapper, Provider<BeneficiaryCreateRequestMapper> beneficiaryCreateBeneficiaryRequestMapper, Provider<BeneficiaryUpdateRequestMapper> beneficiaryUpdateRequestMapper, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(beneficiariesService, "beneficiariesService");
            Intrinsics.checkNotNullParameter(beneficiaryIntroFlowRequestMapper, "beneficiaryIntroFlowRequestMapper");
            Intrinsics.checkNotNullParameter(beneficiaryCreateFlowRequestMapper, "beneficiaryCreateFlowRequestMapper");
            Intrinsics.checkNotNullParameter(beneficiaryCreateBeneficiaryRequestMapper, "beneficiaryCreateBeneficiaryRequestMapper");
            Intrinsics.checkNotNullParameter(beneficiaryUpdateRequestMapper, "beneficiaryUpdateRequestMapper");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new BeneficiaryStore_Factory(beneficiariesService, beneficiaryIntroFlowRequestMapper, beneficiaryCreateFlowRequestMapper, beneficiaryCreateBeneficiaryRequestMapper, beneficiaryUpdateRequestMapper, storeBundle);
        }

        @JvmStatic
        public final BeneficiaryStore newInstance(BeneficiariesService beneficiariesService, BeneficiaryIntroFlowRequestMapper beneficiaryIntroFlowRequestMapper, BeneficiaryCreateFlowRequestMapper beneficiaryCreateFlowRequestMapper, BeneficiaryCreateRequestMapper beneficiaryCreateBeneficiaryRequestMapper, BeneficiaryUpdateRequestMapper beneficiaryUpdateRequestMapper, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(beneficiariesService, "beneficiariesService");
            Intrinsics.checkNotNullParameter(beneficiaryIntroFlowRequestMapper, "beneficiaryIntroFlowRequestMapper");
            Intrinsics.checkNotNullParameter(beneficiaryCreateFlowRequestMapper, "beneficiaryCreateFlowRequestMapper");
            Intrinsics.checkNotNullParameter(beneficiaryCreateBeneficiaryRequestMapper, "beneficiaryCreateBeneficiaryRequestMapper");
            Intrinsics.checkNotNullParameter(beneficiaryUpdateRequestMapper, "beneficiaryUpdateRequestMapper");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new BeneficiaryStore(beneficiariesService, beneficiaryIntroFlowRequestMapper, beneficiaryCreateFlowRequestMapper, beneficiaryCreateBeneficiaryRequestMapper, beneficiaryUpdateRequestMapper, storeBundle);
        }
    }
}
