package com.robinhood.librobinhood.data.store.bonfire.beneficiaries.mapper;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryUpdateRequestMapper_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryUpdateRequestMapper_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryUpdateRequestMapper;", "beneficiaryInfoMapper", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryInfoMapper;", "beneficiaryAgreementsMapper", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryAgreementsMapper;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class BeneficiaryUpdateRequestMapper_Factory implements Factory<BeneficiaryUpdateRequestMapper> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<BeneficiaryAgreementsMapper> beneficiaryAgreementsMapper;
    private final Provider<BeneficiaryInfoMapper> beneficiaryInfoMapper;

    @JvmStatic
    public static final BeneficiaryUpdateRequestMapper_Factory create(Provider<BeneficiaryInfoMapper> provider, Provider<BeneficiaryAgreementsMapper> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final BeneficiaryUpdateRequestMapper newInstance(BeneficiaryInfoMapper beneficiaryInfoMapper, BeneficiaryAgreementsMapper beneficiaryAgreementsMapper) {
        return INSTANCE.newInstance(beneficiaryInfoMapper, beneficiaryAgreementsMapper);
    }

    public BeneficiaryUpdateRequestMapper_Factory(Provider<BeneficiaryInfoMapper> beneficiaryInfoMapper, Provider<BeneficiaryAgreementsMapper> beneficiaryAgreementsMapper) {
        Intrinsics.checkNotNullParameter(beneficiaryInfoMapper, "beneficiaryInfoMapper");
        Intrinsics.checkNotNullParameter(beneficiaryAgreementsMapper, "beneficiaryAgreementsMapper");
        this.beneficiaryInfoMapper = beneficiaryInfoMapper;
        this.beneficiaryAgreementsMapper = beneficiaryAgreementsMapper;
    }

    @Override // javax.inject.Provider
    public BeneficiaryUpdateRequestMapper get() {
        Companion companion = INSTANCE;
        BeneficiaryInfoMapper beneficiaryInfoMapper = this.beneficiaryInfoMapper.get();
        Intrinsics.checkNotNullExpressionValue(beneficiaryInfoMapper, "get(...)");
        BeneficiaryAgreementsMapper beneficiaryAgreementsMapper = this.beneficiaryAgreementsMapper.get();
        Intrinsics.checkNotNullExpressionValue(beneficiaryAgreementsMapper, "get(...)");
        return companion.newInstance(beneficiaryInfoMapper, beneficiaryAgreementsMapper);
    }

    /* compiled from: BeneficiaryUpdateRequestMapper_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryUpdateRequestMapper_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryUpdateRequestMapper_Factory;", "beneficiaryInfoMapper", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryInfoMapper;", "beneficiaryAgreementsMapper", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryAgreementsMapper;", "newInstance", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryUpdateRequestMapper;", "lib-store-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BeneficiaryUpdateRequestMapper_Factory create(Provider<BeneficiaryInfoMapper> beneficiaryInfoMapper, Provider<BeneficiaryAgreementsMapper> beneficiaryAgreementsMapper) {
            Intrinsics.checkNotNullParameter(beneficiaryInfoMapper, "beneficiaryInfoMapper");
            Intrinsics.checkNotNullParameter(beneficiaryAgreementsMapper, "beneficiaryAgreementsMapper");
            return new BeneficiaryUpdateRequestMapper_Factory(beneficiaryInfoMapper, beneficiaryAgreementsMapper);
        }

        @JvmStatic
        public final BeneficiaryUpdateRequestMapper newInstance(BeneficiaryInfoMapper beneficiaryInfoMapper, BeneficiaryAgreementsMapper beneficiaryAgreementsMapper) {
            Intrinsics.checkNotNullParameter(beneficiaryInfoMapper, "beneficiaryInfoMapper");
            Intrinsics.checkNotNullParameter(beneficiaryAgreementsMapper, "beneficiaryAgreementsMapper");
            return new BeneficiaryUpdateRequestMapper(beneficiaryInfoMapper, beneficiaryAgreementsMapper);
        }
    }
}
