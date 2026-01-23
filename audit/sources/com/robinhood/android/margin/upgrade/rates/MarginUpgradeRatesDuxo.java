package com.robinhood.android.margin.upgrade.rates;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.margin.p083ui.eligibility.MarginEligibilityChecklistViewState4;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.lib.margin.MarginEligibilityStore;
import com.robinhood.android.lib.margin.MarginInvestingInfoStore;
import com.robinhood.android.lib.margin.MarginTieredRatesStore;
import com.robinhood.android.lib.margin.api.ApiMarginEligibility;
import com.robinhood.android.lib.margin.api.ApiMarginInvestingInfo;
import com.robinhood.android.lib.margin.api.ApiToggleMarginInvestingResponse;
import com.robinhood.android.lib.margin.api.ApiToggleMarginInvestingResponse2;
import com.robinhood.android.lib.margin.p167db.models.MarginTieredRates;
import com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementState2;
import com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesDuxo2;
import com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.util.Money;
import io.reactivex.Single;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: MarginUpgradeRatesDuxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0019B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesViewState;", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "marginEligibilityStore", "Lcom/robinhood/android/lib/margin/MarginEligibilityStore;", "leveredMarginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "marginTieredRatesStore", "Lcom/robinhood/android/lib/margin/MarginTieredRatesStore;", "marginInvestingInfoStore", "Lcom/robinhood/android/lib/margin/MarginInvestingInfoStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/margin/MarginEligibilityStore;Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;Lcom/robinhood/android/lib/margin/MarginTieredRatesStore;Lcom/robinhood/android/lib/margin/MarginInvestingInfoStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "enableMarginInvesting", "Lkotlinx/coroutines/Job;", "Companion", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MarginUpgradeRatesDuxo extends BaseDuxo5<MarginUpgradeRatesViewState, MarginUpgradeRatesDuxo2> implements HasSavedState {
    private final LeveredMarginSettingsStore leveredMarginSettingsStore;
    private final MarginEligibilityStore marginEligibilityStore;
    private final MarginInvestingInfoStore marginInvestingInfoStore;
    private final MarginTieredRatesStore marginTieredRatesStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginUpgradeRatesDuxo(MarginEligibilityStore marginEligibilityStore, LeveredMarginSettingsStore leveredMarginSettingsStore, MarginTieredRatesStore marginTieredRatesStore, MarginInvestingInfoStore marginInvestingInfoStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new MarginUpgradeRatesViewState(false, null, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(marginEligibilityStore, "marginEligibilityStore");
        Intrinsics.checkNotNullParameter(leveredMarginSettingsStore, "leveredMarginSettingsStore");
        Intrinsics.checkNotNullParameter(marginTieredRatesStore, "marginTieredRatesStore");
        Intrinsics.checkNotNullParameter(marginInvestingInfoStore, "marginInvestingInfoStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.marginEligibilityStore = marginEligibilityStore;
        this.leveredMarginSettingsStore = leveredMarginSettingsStore;
        this.marginTieredRatesStore = marginTieredRatesStore;
        this.marginInvestingInfoStore = marginInvestingInfoStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: MarginUpgradeRatesDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesDuxo$onCreate$1", m3645f = "MarginUpgradeRatesDuxo.kt", m3646l = {41, 47, 61, 65}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesDuxo$onCreate$1 */
    static final class C212111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C212111(Continuation<? super C212111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginUpgradeRatesDuxo.this.new C212111(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C212111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(1:76)|(1:(1:(1:(1:(8:8|9|61|(1:63)|64|65|72|73)(2:14|15))(4:16|53|(1:57)|58))(7:17|37|(5:39|(1:49)(1:44)|50|(1:52)(5:53|(3:55|57|58)(0)|65|72|73)|60)|64|65|72|73))(1:18))(5:20|79|21|(1:23)|60)|24|(1:31)(1:30)|32|33|77|34|(1:36)(6:37|(0)|64|65|72|73)|60|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0124, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x016b, code lost:
        
            if (r15 != r0) goto L61;
         */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00ed A[Catch: all -> 0x0120, Exception -> 0x0124, TryCatch #0 {all -> 0x0120, blocks: (B:61:0x016e, B:63:0x0176, B:70:0x0191, B:53:0x0132, B:55:0x0154, B:58:0x0165, B:37:0x00d1, B:39:0x00ed, B:41:0x010d, B:50:0x0129, B:34:0x00c9), top: B:76:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0164  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            C212111 c212111;
            Exception exc;
            C212111 c2121112;
            MarginUpgradeRatesDuxo marginUpgradeRatesDuxo;
            AnonymousClass4 anonymousClass4;
            Companion companion;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e) {
                exc = e;
                c2121112 = this;
            } catch (Throwable th3) {
                th = th3;
                c212111 = this;
                MarginUpgradeRatesDuxo.this.applyMutation(new AnonymousClass4(null));
                throw th;
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    MarginUpgradeRatesDuxo.this.applyMutation(new AnonymousClass1(null));
                    MarginInvestingInfoStore marginInvestingInfoStore = MarginUpgradeRatesDuxo.this.marginInvestingInfoStore;
                    String accountNumber = ((MarginUpgradeRatesFragment.Args) MarginUpgradeRatesDuxo.INSTANCE.getArgs((HasSavedState) MarginUpgradeRatesDuxo.this)).getAccountNumber();
                    this.label = 1;
                    obj = marginInvestingInfoStore.getMarginInvestingInfo(accountNumber, this);
                    if (obj == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                } catch (Exception e2) {
                    e = e2;
                    c2121112 = this;
                    exc = e;
                    MarginUpgradeRatesDuxo.this.submit(new MarginUpgradeRatesDuxo2.GenericError(exc));
                    marginUpgradeRatesDuxo = MarginUpgradeRatesDuxo.this;
                    anonymousClass4 = new AnonymousClass4(null);
                    marginUpgradeRatesDuxo.applyMutation(anonymousClass4);
                    return Unit.INSTANCE;
                } catch (Throwable th4) {
                    th = th4;
                    c212111 = this;
                    th = th;
                    MarginUpgradeRatesDuxo.this.applyMutation(new AnonymousClass4(null));
                    throw th;
                }
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    c2121112 = this;
                    MarginUpgradeRatesDuxo.this.applyMutation(new AnonymousClass2((MarginTieredRates) obj, null));
                    companion = MarginUpgradeRatesDuxo.INSTANCE;
                    if (((MarginUpgradeRatesFragment.Args) companion.getArgs((HasSavedState) MarginUpgradeRatesDuxo.this)).getCheckEligibility()) {
                        MarginEligibilityStore marginEligibilityStore = MarginUpgradeRatesDuxo.this.marginEligibilityStore;
                        String accountNumber2 = ((MarginUpgradeRatesFragment.Args) companion.getArgs((HasSavedState) MarginUpgradeRatesDuxo.this)).getAccountNumber();
                        boolean z = ((MarginUpgradeRatesFragment.Args) companion.getArgs((HasSavedState) MarginUpgradeRatesDuxo.this)).getFromAcats() || (((MarginUpgradeRatesFragment.Args) companion.getArgs((HasSavedState) MarginUpgradeRatesDuxo.this)).getMarginFlowType() instanceof MarginEligibilityChecklistViewState4.Skip2KCheck);
                        c2121112.label = 3;
                        if (marginEligibilityStore.updateMarginEligibilityCooldown(accountNumber2, z, this) != coroutine_suspended) {
                            MarginEligibilityStore marginEligibilityStore2 = MarginUpgradeRatesDuxo.this.marginEligibilityStore;
                            Companion companion2 = MarginUpgradeRatesDuxo.INSTANCE;
                            String accountNumber3 = ((MarginUpgradeRatesFragment.Args) companion2.getArgs((HasSavedState) MarginUpgradeRatesDuxo.this)).getAccountNumber();
                            if (((MarginUpgradeRatesFragment.Args) companion2.getArgs((HasSavedState) MarginUpgradeRatesDuxo.this)).getFromAcats()) {
                                c2121112.label = 4;
                                obj = marginEligibilityStore2.getMarginEligibility(accountNumber3, z, this);
                            }
                            marginUpgradeRatesDuxo.applyMutation(anonymousClass4);
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    }
                    marginUpgradeRatesDuxo = MarginUpgradeRatesDuxo.this;
                    anonymousClass4 = new AnonymousClass4(null);
                    marginUpgradeRatesDuxo.applyMutation(anonymousClass4);
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    c2121112 = this;
                    ApiMarginEligibility.ApiMarginUpgradeBlocked marginUpgradeBlocked = ((ApiMarginEligibility) obj).getMarginUpgradeBlocked();
                    if (marginUpgradeBlocked != null) {
                        MarginUpgradeRatesDuxo.this.submit(new MarginUpgradeRatesDuxo2.Ineligible(marginUpgradeBlocked));
                    }
                    marginUpgradeRatesDuxo = MarginUpgradeRatesDuxo.this;
                    anonymousClass4 = new AnonymousClass4(null);
                    marginUpgradeRatesDuxo.applyMutation(anonymousClass4);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                c2121112 = this;
                MarginEligibilityStore marginEligibilityStore22 = MarginUpgradeRatesDuxo.this.marginEligibilityStore;
                Companion companion22 = MarginUpgradeRatesDuxo.INSTANCE;
                String accountNumber32 = ((MarginUpgradeRatesFragment.Args) companion22.getArgs((HasSavedState) MarginUpgradeRatesDuxo.this)).getAccountNumber();
                boolean z2 = !((MarginUpgradeRatesFragment.Args) companion22.getArgs((HasSavedState) MarginUpgradeRatesDuxo.this)).getFromAcats() || (((MarginUpgradeRatesFragment.Args) companion22.getArgs((HasSavedState) MarginUpgradeRatesDuxo.this)).getMarginFlowType() instanceof MarginEligibilityChecklistViewState4.Skip2KCheck);
                c2121112.label = 4;
                obj = marginEligibilityStore22.getMarginEligibility(accountNumber32, z2, this);
            }
            boolean zIsZero = ((ApiMarginInvestingInfo) obj).getMarginAvailable().isZero();
            MarginTieredRatesStore marginTieredRatesStore = MarginUpgradeRatesDuxo.this.marginTieredRatesStore;
            Companion companion3 = MarginUpgradeRatesDuxo.INSTANCE;
            String accountNumber4 = ((MarginUpgradeRatesFragment.Args) companion3.getArgs((HasSavedState) MarginUpgradeRatesDuxo.this)).getAccountNumber();
            boolean z3 = ((MarginUpgradeRatesFragment.Args) companion3.getArgs((HasSavedState) MarginUpgradeRatesDuxo.this)).getFromAcats() || (((MarginUpgradeRatesFragment.Args) companion3.getArgs((HasSavedState) MarginUpgradeRatesDuxo.this)).getMarginFlowType() instanceof MarginEligibilityChecklistViewState4.Skip2KCheck) || zIsZero;
            boolean z4 = ((MarginUpgradeRatesFragment.Args) companion3.getArgs((HasSavedState) MarginUpgradeRatesDuxo.this)).getMarginFlowType() instanceof MarginEligibilityChecklistViewState4.QuickOnboarding;
            String source = ((MarginUpgradeRatesFragment.Args) companion3.getArgs((HasSavedState) MarginUpgradeRatesDuxo.this)).getSource();
            this.label = 2;
            c2121112 = this;
            obj = marginTieredRatesStore.getMarginTieredRates(accountNumber4, z3, z4, source, c2121112);
            if (obj != coroutine_suspended) {
                MarginUpgradeRatesDuxo.this.applyMutation(new AnonymousClass2((MarginTieredRates) obj, null));
                companion = MarginUpgradeRatesDuxo.INSTANCE;
                if (((MarginUpgradeRatesFragment.Args) companion.getArgs((HasSavedState) MarginUpgradeRatesDuxo.this)).getCheckEligibility()) {
                }
                marginUpgradeRatesDuxo = MarginUpgradeRatesDuxo.this;
                anonymousClass4 = new AnonymousClass4(null);
                marginUpgradeRatesDuxo.applyMutation(anonymousClass4);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }

        /* compiled from: MarginUpgradeRatesDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesDuxo$onCreate$1$1", m3645f = "MarginUpgradeRatesDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MarginUpgradeRatesViewState, Continuation<? super MarginUpgradeRatesViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MarginUpgradeRatesViewState marginUpgradeRatesViewState, Continuation<? super MarginUpgradeRatesViewState> continuation) {
                return ((AnonymousClass1) create(marginUpgradeRatesViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MarginUpgradeRatesViewState.copy$default((MarginUpgradeRatesViewState) this.L$0, true, null, 2, null);
            }
        }

        /* compiled from: MarginUpgradeRatesDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesDuxo$onCreate$1$2", m3645f = "MarginUpgradeRatesDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<MarginUpgradeRatesViewState, Continuation<? super MarginUpgradeRatesViewState>, Object> {
            final /* synthetic */ MarginTieredRates $tieredRates;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(MarginTieredRates marginTieredRates, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$tieredRates = marginTieredRates;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$tieredRates, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MarginUpgradeRatesViewState marginUpgradeRatesViewState, Continuation<? super MarginUpgradeRatesViewState> continuation) {
                return ((AnonymousClass2) create(marginUpgradeRatesViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MarginUpgradeRatesViewState.copy$default((MarginUpgradeRatesViewState) this.L$0, false, this.$tieredRates, 1, null);
            }
        }

        /* compiled from: MarginUpgradeRatesDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesDuxo$onCreate$1$4", m3645f = "MarginUpgradeRatesDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<MarginUpgradeRatesViewState, Continuation<? super MarginUpgradeRatesViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MarginUpgradeRatesViewState marginUpgradeRatesViewState, Continuation<? super MarginUpgradeRatesViewState> continuation) {
                return ((AnonymousClass4) create(marginUpgradeRatesViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MarginUpgradeRatesViewState.copy$default((MarginUpgradeRatesViewState) this.L$0, false, null, 2, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C212111(null), 3, null);
    }

    /* compiled from: MarginUpgradeRatesDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesDuxo$enableMarginInvesting$1", m3645f = "MarginUpgradeRatesDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, 102}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesDuxo$enableMarginInvesting$1 */
    static final class C212101 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        C212101(Continuation<? super C212101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C212101 c212101 = MarginUpgradeRatesDuxo.this.new C212101(continuation);
            c212101.L$0 = obj;
            return c212101;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C212101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00c8 A[Catch: all -> 0x001e, Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:7:0x0019, B:33:0x00bc, B:35:0x00c8, B:37:0x00d5, B:38:0x00e4, B:16:0x0032, B:25:0x0089, B:29:0x0095, B:19:0x003e, B:21:0x0058, B:22:0x0064), top: B:47:0x0009, outer: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            MarginUpgradeRatesDuxo marginUpgradeRatesDuxo;
            AnonymousClass4 anonymousClass4;
            CoroutineScope coroutineScope;
            ApiToggleMarginInvestingResponse apiToggleMarginInvestingResponse;
            int i;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            int i3 = 1;
            try {
                try {
                } catch (Exception e) {
                    MarginUpgradeRatesDuxo.this.submit(new MarginUpgradeRatesDuxo2.GenericError(e));
                    marginUpgradeRatesDuxo = MarginUpgradeRatesDuxo.this;
                    anonymousClass4 = new AnonymousClass4(null);
                }
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    MarginUpgradeRatesDuxo.this.applyMutation(new AnonymousClass1(null));
                    Companion companion = MarginUpgradeRatesDuxo.INSTANCE;
                    if (!((MarginUpgradeRatesFragment.Args) companion.getArgs((HasSavedState) MarginUpgradeRatesDuxo.this)).isCash()) {
                        ((MarginUpgradeRatesFragment.Args) companion.getArgs((HasSavedState) MarginUpgradeRatesDuxo.this)).isUk();
                    }
                    Single<ApiToggleMarginInvestingResponse> singleEnableMarginInvesting = MarginUpgradeRatesDuxo.this.leveredMarginSettingsStore.enableMarginInvesting(((MarginUpgradeRatesFragment.Args) companion.getArgs((HasSavedState) MarginUpgradeRatesDuxo.this)).getAccountNumber(), null, null, false, true);
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    obj = RxAwait3.await(singleEnableMarginInvesting, this);
                    if (obj == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$0;
                    apiToggleMarginInvestingResponse = (ApiToggleMarginInvestingResponse) this.L$1;
                    ResultKt.throwOnFailure(obj);
                    Money buyingPowerWithUserSetLimit = ((ApiMarginInvestingInfo) obj).getBuyingPowerWithUserSetLimit();
                    String errorReason = apiToggleMarginInvestingResponse.getErrorReason();
                    if (i == 0) {
                        MarginUpgradeRatesDuxo.this.submit(new MarginUpgradeRatesDuxo2.UpgradeSuccess(buyingPowerWithUserSetLimit));
                    } else if (errorReason != null) {
                        MarginUpgradeRatesDuxo.this.submit(new MarginUpgradeRatesDuxo2.UpgradeError(apiToggleMarginInvestingResponse.getResult(), errorReason));
                    } else {
                        MarginUpgradeRatesDuxo.this.submit(new MarginUpgradeRatesDuxo2.GenericError(new IllegalStateException(MarginUpgradeAgreementState2.ERROR_MSG_ERROR_REASON_MISSING)));
                    }
                    marginUpgradeRatesDuxo = MarginUpgradeRatesDuxo.this;
                    anonymousClass4 = new AnonymousClass4(null);
                    marginUpgradeRatesDuxo.applyMutation(anonymousClass4);
                    return Unit.INSTANCE;
                }
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                ApiToggleMarginInvestingResponse apiToggleMarginInvestingResponse2 = (ApiToggleMarginInvestingResponse) obj;
                if (apiToggleMarginInvestingResponse2.getResult() != ApiToggleMarginInvestingResponse2.SUCCESS) {
                    i3 = 0;
                }
                MarginInvestingInfoStore marginInvestingInfoStore = MarginUpgradeRatesDuxo.this.marginInvestingInfoStore;
                String accountNumber = ((MarginUpgradeRatesFragment.Args) MarginUpgradeRatesDuxo.INSTANCE.getArgs((HasSavedState) MarginUpgradeRatesDuxo.this)).getAccountNumber();
                this.L$0 = coroutineScope;
                this.L$1 = apiToggleMarginInvestingResponse2;
                this.I$0 = i3;
                this.label = 2;
                Object marginInvestingInfo = marginInvestingInfoStore.getMarginInvestingInfo(accountNumber, this);
                if (marginInvestingInfo != coroutine_suspended) {
                    apiToggleMarginInvestingResponse = apiToggleMarginInvestingResponse2;
                    obj = marginInvestingInfo;
                    i = i3;
                    Money buyingPowerWithUserSetLimit2 = ((ApiMarginInvestingInfo) obj).getBuyingPowerWithUserSetLimit();
                    String errorReason2 = apiToggleMarginInvestingResponse.getErrorReason();
                    if (i == 0) {
                    }
                    marginUpgradeRatesDuxo = MarginUpgradeRatesDuxo.this;
                    anonymousClass4 = new AnonymousClass4(null);
                    marginUpgradeRatesDuxo.applyMutation(anonymousClass4);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            } catch (Throwable th) {
                MarginUpgradeRatesDuxo.this.applyMutation(new AnonymousClass4(null));
                throw th;
            }
        }

        /* compiled from: MarginUpgradeRatesDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesDuxo$enableMarginInvesting$1$1", m3645f = "MarginUpgradeRatesDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesDuxo$enableMarginInvesting$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MarginUpgradeRatesViewState, Continuation<? super MarginUpgradeRatesViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MarginUpgradeRatesViewState marginUpgradeRatesViewState, Continuation<? super MarginUpgradeRatesViewState> continuation) {
                return ((AnonymousClass1) create(marginUpgradeRatesViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MarginUpgradeRatesViewState.copy$default((MarginUpgradeRatesViewState) this.L$0, true, null, 2, null);
            }
        }

        /* compiled from: MarginUpgradeRatesDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesDuxo$enableMarginInvesting$1$4", m3645f = "MarginUpgradeRatesDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesDuxo$enableMarginInvesting$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<MarginUpgradeRatesViewState, Continuation<? super MarginUpgradeRatesViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MarginUpgradeRatesViewState marginUpgradeRatesViewState, Continuation<? super MarginUpgradeRatesViewState> continuation) {
                return ((AnonymousClass4) create(marginUpgradeRatesViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MarginUpgradeRatesViewState.copy$default((MarginUpgradeRatesViewState) this.L$0, false, null, 2, null);
            }
        }
    }

    public final Job enableMarginInvesting() {
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C212101(null), 3, null);
    }

    /* compiled from: MarginUpgradeRatesDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesDuxo;", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesFragment$Args;", "<init>", "()V", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MarginUpgradeRatesDuxo, MarginUpgradeRatesFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MarginUpgradeRatesFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (MarginUpgradeRatesFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MarginUpgradeRatesFragment.Args getArgs(MarginUpgradeRatesDuxo marginUpgradeRatesDuxo) {
            return (MarginUpgradeRatesFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, marginUpgradeRatesDuxo);
        }
    }
}
