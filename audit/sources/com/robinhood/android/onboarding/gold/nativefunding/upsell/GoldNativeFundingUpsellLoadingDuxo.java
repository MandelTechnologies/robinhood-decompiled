package com.robinhood.android.onboarding.gold.nativefunding.upsell;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.api.gold.nativefunding.upsell.ApiGoldNativeFundingUpsell;
import com.robinhood.android.api.gold.nativefunding.upsell.GoldNativeFundingUpsellApi;
import com.robinhood.android.onboarding.gold.nativefunding.upsell.GoldNativeFundingUpsellLoadingEvent;
import com.robinhood.android.onboarding.gold.nativefunding.upsell.GoldNativeFundingUpsellLoadingFragment;
import com.robinhood.android.onboarding.gold.nativefunding.upsell.GoldNativeFundingUpsellLoadingViewState;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GoldNativeFundingUpsellLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/onboarding/gold/nativefunding/upsell/GoldNativeFundingUpsellLoadingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/onboarding/gold/nativefunding/upsell/GoldNativeFundingUpsellLoadingViewState;", "Lcom/robinhood/android/onboarding/gold/nativefunding/upsell/GoldNativeFundingUpsellLoadingEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "goldNativeFundingUpsellApi", "Lcom/robinhood/android/api/gold/nativefunding/upsell/GoldNativeFundingUpsellApi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/api/gold/nativefunding/upsell/GoldNativeFundingUpsellApi;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-gold-native-funding-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldNativeFundingUpsellLoadingDuxo extends BaseDuxo5<GoldNativeFundingUpsellLoadingViewState, GoldNativeFundingUpsellLoadingEvent> implements HasSavedState {
    private final GoldNativeFundingUpsellApi goldNativeFundingUpsellApi;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldNativeFundingUpsellLoadingDuxo(GoldNativeFundingUpsellApi goldNativeFundingUpsellApi, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(GoldNativeFundingUpsellLoadingViewState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(goldNativeFundingUpsellApi, "goldNativeFundingUpsellApi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.goldNativeFundingUpsellApi = goldNativeFundingUpsellApi;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: GoldNativeFundingUpsellLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.gold.nativefunding.upsell.GoldNativeFundingUpsellLoadingDuxo$onCreate$1", m3645f = "GoldNativeFundingUpsellLoadingDuxo.kt", m3646l = {27}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.gold.nativefunding.upsell.GoldNativeFundingUpsellLoadingDuxo$onCreate$1 */
    static final class C227821 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C227821(Continuation<? super C227821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GoldNativeFundingUpsellLoadingDuxo.this.new C227821(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C227821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    GoldNativeFundingUpsellApi goldNativeFundingUpsellApi = GoldNativeFundingUpsellLoadingDuxo.this.goldNativeFundingUpsellApi;
                    String source = ((GoldNativeFundingUpsellLoadingFragment.Args) GoldNativeFundingUpsellLoadingDuxo.INSTANCE.getArgs((HasSavedState) GoldNativeFundingUpsellLoadingDuxo.this)).getSource();
                    this.label = 1;
                    obj = goldNativeFundingUpsellApi.getGoldNativeFundingUpsell(source, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                GoldNativeFundingUpsellLoadingDuxo.this.submit(new GoldNativeFundingUpsellLoadingEvent.Loaded((ApiGoldNativeFundingUpsell) obj));
            } catch (Exception e) {
                GoldNativeFundingUpsellLoadingDuxo.this.submit(new GoldNativeFundingUpsellLoadingEvent.Failed(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C227821(null), 3, null);
    }

    /* compiled from: GoldNativeFundingUpsellLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/gold/nativefunding/upsell/GoldNativeFundingUpsellLoadingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/onboarding/gold/nativefunding/upsell/GoldNativeFundingUpsellLoadingDuxo;", "Lcom/robinhood/android/onboarding/gold/nativefunding/upsell/GoldNativeFundingUpsellLoadingFragment$Args;", "<init>", "()V", "feature-gold-native-funding-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<GoldNativeFundingUpsellLoadingDuxo, GoldNativeFundingUpsellLoadingFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public GoldNativeFundingUpsellLoadingFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (GoldNativeFundingUpsellLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public GoldNativeFundingUpsellLoadingFragment.Args getArgs(GoldNativeFundingUpsellLoadingDuxo goldNativeFundingUpsellLoadingDuxo) {
            return (GoldNativeFundingUpsellLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, goldNativeFundingUpsellLoadingDuxo);
        }
    }
}
