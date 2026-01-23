package com.robinhood.android.common.options.upgrade;

import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.OptionOnboardingStore;
import com.robinhood.models.api.ApiUserInvestmentProfile;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: OptionsProfessionalTraderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/options/upgrade/OptionsProfessionalTraderDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/common/options/upgrade/OptionsProfessionalTraderViewState;", "optionOnboardingStore", "Lcom/robinhood/librobinhood/data/store/OptionOnboardingStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/OptionOnboardingStore;)V", "submitProfessionalTraderStatus", "", "isProfessionalTrader", "", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class OptionsProfessionalTraderDuxo extends OldBaseDuxo<OptionsProfessionalTraderViewState> {
    public static final int $stable = 8;
    private final OptionOnboardingStore optionOnboardingStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OptionsProfessionalTraderDuxo(OptionOnboardingStore optionOnboardingStore) {
        super(new OptionsProfessionalTraderViewState(null, null, 3, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(optionOnboardingStore, "optionOnboardingStore");
        this.optionOnboardingStore = optionOnboardingStore;
    }

    public final void submitProfessionalTraderStatus(boolean isProfessionalTrader) {
        ApiUserInvestmentProfile.Request request = new ApiUserInvestmentProfile.Request(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
        request.setProfessional_trader(Boolean.valueOf(isProfessionalTrader));
        LifecycleHost.DefaultImpls.bind$default(this, this.optionOnboardingStore.updateOptionsInvestmentProfile(request), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.common.options.upgrade.OptionsProfessionalTraderDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsProfessionalTraderDuxo.submitProfessionalTraderStatus$lambda$2(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.common.options.upgrade.OptionsProfessionalTraderDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsProfessionalTraderDuxo.submitProfessionalTraderStatus$lambda$4(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitProfessionalTraderStatus$lambda$2(OptionsProfessionalTraderDuxo optionsProfessionalTraderDuxo) {
        optionsProfessionalTraderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.options.upgrade.OptionsProfessionalTraderDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsProfessionalTraderDuxo.submitProfessionalTraderStatus$lambda$2$lambda$1((OptionsProfessionalTraderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsProfessionalTraderViewState submitProfessionalTraderStatus$lambda$2$lambda$1(OptionsProfessionalTraderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionsProfessionalTraderViewState.copy$default(applyMutation, new UiEvent(Unit.INSTANCE), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitProfessionalTraderStatus$lambda$4(OptionsProfessionalTraderDuxo optionsProfessionalTraderDuxo, final Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        optionsProfessionalTraderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.options.upgrade.OptionsProfessionalTraderDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsProfessionalTraderDuxo.submitProfessionalTraderStatus$lambda$4$lambda$3(it, (OptionsProfessionalTraderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsProfessionalTraderViewState submitProfessionalTraderStatus$lambda$4$lambda$3(Throwable th, OptionsProfessionalTraderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionsProfessionalTraderViewState.copy$default(applyMutation, null, new UiEvent(th), 1, null);
    }
}
