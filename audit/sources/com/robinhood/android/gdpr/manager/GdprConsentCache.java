package com.robinhood.android.gdpr.manager;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.gdpr.GdprConsent;
import com.robinhood.android.gdpr.GdprConsentStatus;
import com.robinhood.android.gdpr.manager.annotation.GdprFunctionalConsentPref;
import com.robinhood.android.gdpr.manager.annotation.GdprLastUpdatedConsentPref;
import com.robinhood.android.gdpr.manager.annotation.GdprMarketingConsentPref;
import com.robinhood.android.gdpr.manager.annotation.GdprPerformanceConsentPref;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.StringPreference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.Combine;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Instant;

/* compiled from: GdprConsentCache.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR.\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0!0\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001cR \u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001cR\u0014\u0010(\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0017R\u0016\u0010+\u001a\u0004\u0018\u00010\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/gdpr/manager/GdprConsentCache;", "", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/gdpr/GdprConsentStatus;", "functionalConsent", "marketingConsent", "performanceConsent", "Lcom/robinhood/prefs/StringPreference;", "lastUpdatedConsent", "<init>", "(Lcom/robinhood/prefs/EnumPreference;Lcom/robinhood/prefs/EnumPreference;Lcom/robinhood/prefs/EnumPreference;Lcom/robinhood/prefs/StringPreference;)V", "Lcom/robinhood/android/gdpr/GdprConsent;", "consent", "j$/time/Instant", "updatedAt", "", "setConsent", "(Lcom/robinhood/android/gdpr/GdprConsent;Lj$/time/Instant;)V", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/prefs/StringPreference;", "initialConsent", "Lcom/robinhood/android/gdpr/GdprConsent;", "getInitialConsent$lib_gdpr_manager_externalDebug", "()Lcom/robinhood/android/gdpr/GdprConsent;", "Lkotlinx/coroutines/flow/Flow;", "functionalConsentFlow", "Lkotlinx/coroutines/flow/Flow;", "getFunctionalConsentFlow$lib_gdpr_manager_externalDebug", "()Lkotlinx/coroutines/flow/Flow;", "marketingConsentFlow", "getMarketingConsentFlow$lib_gdpr_manager_externalDebug", "performanceConsentFlow", "getPerformanceConsentFlow$lib_gdpr_manager_externalDebug", "Lkotlin/Pair;", "consentFlow", "getConsentFlow$lib_gdpr_manager_externalDebug", "", "hasCollectedConsentFlow", "getHasCollectedConsentFlow$lib_gdpr_manager_externalDebug", "getCurrentConsent$lib_gdpr_manager_externalDebug", "currentConsent", "getLastUpdated$lib_gdpr_manager_externalDebug", "()Lj$/time/Instant;", "lastUpdated", "lib-gdpr-manager_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class GdprConsentCache {
    private final Flow<Tuples2<GdprConsent, Instant>> consentFlow;
    private final EnumPreference<GdprConsentStatus> functionalConsent;
    private final Flow<GdprConsentStatus> functionalConsentFlow;
    private final Flow<Boolean> hasCollectedConsentFlow;
    private final GdprConsent initialConsent;
    private final StringPreference lastUpdatedConsent;
    private final EnumPreference<GdprConsentStatus> marketingConsent;
    private final Flow<GdprConsentStatus> marketingConsentFlow;
    private final EnumPreference<GdprConsentStatus> performanceConsent;
    private final Flow<GdprConsentStatus> performanceConsentFlow;

    public GdprConsentCache(@GdprFunctionalConsentPref EnumPreference<GdprConsentStatus> functionalConsent, @GdprMarketingConsentPref EnumPreference<GdprConsentStatus> marketingConsent, @GdprPerformanceConsentPref EnumPreference<GdprConsentStatus> performanceConsent, @GdprLastUpdatedConsentPref StringPreference lastUpdatedConsent) {
        Intrinsics.checkNotNullParameter(functionalConsent, "functionalConsent");
        Intrinsics.checkNotNullParameter(marketingConsent, "marketingConsent");
        Intrinsics.checkNotNullParameter(performanceConsent, "performanceConsent");
        Intrinsics.checkNotNullParameter(lastUpdatedConsent, "lastUpdatedConsent");
        this.functionalConsent = functionalConsent;
        this.marketingConsent = marketingConsent;
        this.performanceConsent = performanceConsent;
        this.lastUpdatedConsent = lastUpdatedConsent;
        this.initialConsent = new GdprConsent((GdprConsentStatus) functionalConsent.get(), (GdprConsentStatus) marketingConsent.get(), (GdprConsentStatus) performanceConsent.get());
        Flow<GdprConsentStatus> flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(functionalConsent.getChanges()), Integer.MAX_VALUE, null, 2, null);
        this.functionalConsentFlow = flowBuffer$default;
        Flow<GdprConsentStatus> flowBuffer$default2 = Context7.buffer$default(RxConvert.asFlow(marketingConsent.getChanges()), Integer.MAX_VALUE, null, 2, null);
        this.marketingConsentFlow = flowBuffer$default2;
        Flow<GdprConsentStatus> flowBuffer$default3 = Context7.buffer$default(RxConvert.asFlow(performanceConsent.getChanges()), Integer.MAX_VALUE, null, 2, null);
        this.performanceConsentFlow = flowBuffer$default3;
        final Flow[] flowArr = {flowBuffer$default, flowBuffer$default2, flowBuffer$default3};
        this.consentFlow = FlowKt.distinctUntilChanged(new Flow<Tuples2<? extends GdprConsent, ? extends Instant>>() { // from class: com.robinhood.android.gdpr.manager.GdprConsentCache$special$$inlined$combine$1

            /* compiled from: Zip.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
            @DebugMetadata(m3644c = "com.robinhood.android.gdpr.manager.GdprConsentCache$special$$inlined$combine$1$3", m3645f = "GdprConsentCache.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.gdpr.manager.GdprConsentCache$special$$inlined$combine$1$3 */
            public static final class C176803 extends ContinuationImpl7 implements Function3<FlowCollector<? super Tuples2<? extends GdprConsent, ? extends Instant>>, GdprConsentStatus[], Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;
                final /* synthetic */ GdprConsentCache this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C176803(Continuation continuation, GdprConsentCache gdprConsentCache) {
                    super(3, continuation);
                    this.this$0 = gdprConsentCache;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super Tuples2<? extends GdprConsent, ? extends Instant>> flowCollector, GdprConsentStatus[] gdprConsentStatusArr, Continuation<? super Unit> continuation) {
                    C176803 c176803 = new C176803(continuation, this.this$0);
                    c176803.L$0 = flowCollector;
                    c176803.L$1 = gdprConsentStatusArr;
                    return c176803.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        GdprConsentStatus[] gdprConsentStatusArr = (GdprConsentStatus[]) ((Object[]) this.L$1);
                        Tuples2 tuples2 = new Tuples2(new GdprConsent(gdprConsentStatusArr[0], gdprConsentStatusArr[1], gdprConsentStatusArr[2]), this.this$0.getLastUpdated$lib_gdpr_manager_externalDebug());
                        this.label = 1;
                        if (flowCollector.emit(tuples2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Tuples2<? extends GdprConsent, ? extends Instant>> flowCollector, Continuation continuation) {
                final Flow[] flowArr2 = flowArr;
                Object objCombineInternal = Combine.combineInternal(flowCollector, flowArr2, new Function0<GdprConsentStatus[]>() { // from class: com.robinhood.android.gdpr.manager.GdprConsentCache$special$$inlined$combine$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final GdprConsentStatus[] invoke() {
                        return new GdprConsentStatus[flowArr2.length];
                    }
                }, new C176803(null, this), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }
        });
        final Flow[] flowArr2 = {flowBuffer$default, flowBuffer$default2, flowBuffer$default3};
        this.hasCollectedConsentFlow = FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.robinhood.android.gdpr.manager.GdprConsentCache$special$$inlined$combine$2

            /* compiled from: Zip.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
            @DebugMetadata(m3644c = "com.robinhood.android.gdpr.manager.GdprConsentCache$special$$inlined$combine$2$3", m3645f = "GdprConsentCache.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.gdpr.manager.GdprConsentCache$special$$inlined$combine$2$3 */
            public static final class C176823 extends ContinuationImpl7 implements Function3<FlowCollector<? super Boolean>, GdprConsentStatus[], Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public C176823(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super Boolean> flowCollector, GdprConsentStatus[] gdprConsentStatusArr, Continuation<? super Unit> continuation) {
                    C176823 c176823 = new C176823(continuation);
                    c176823.L$0 = flowCollector;
                    c176823.L$1 = gdprConsentStatusArr;
                    return c176823.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        GdprConsentStatus[] gdprConsentStatusArr = (GdprConsentStatus[]) ((Object[]) this.L$1);
                        boolean z = false;
                        GdprConsentStatus gdprConsentStatus = gdprConsentStatusArr[0];
                        GdprConsentStatus gdprConsentStatus2 = gdprConsentStatusArr[1];
                        GdprConsentStatus gdprConsentStatus3 = gdprConsentStatusArr[2];
                        if (gdprConsentStatus.getIsCollected() && gdprConsentStatus2.getIsCollected() && gdprConsentStatus3.getIsCollected()) {
                            z = true;
                        }
                        Boolean boolBoxBoolean = boxing.boxBoolean(z);
                        this.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                final Flow[] flowArr3 = flowArr2;
                Object objCombineInternal = Combine.combineInternal(flowCollector, flowArr3, new Function0<GdprConsentStatus[]>() { // from class: com.robinhood.android.gdpr.manager.GdprConsentCache$special$$inlined$combine$2.2
                    @Override // kotlin.jvm.functions.Function0
                    public final GdprConsentStatus[] invoke() {
                        return new GdprConsentStatus[flowArr3.length];
                    }
                }, new C176823(null), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }
        });
    }

    /* renamed from: getInitialConsent$lib_gdpr_manager_externalDebug, reason: from getter */
    public final GdprConsent getInitialConsent() {
        return this.initialConsent;
    }

    public final GdprConsent getCurrentConsent$lib_gdpr_manager_externalDebug() {
        return new GdprConsent((GdprConsentStatus) this.functionalConsent.get(), (GdprConsentStatus) this.marketingConsent.get(), (GdprConsentStatus) this.performanceConsent.get());
    }

    public final Instant getLastUpdated$lib_gdpr_manager_externalDebug() {
        String str = this.lastUpdatedConsent.get();
        if (str != null) {
            return Instant.parse(str);
        }
        return null;
    }

    public final Flow<GdprConsentStatus> getFunctionalConsentFlow$lib_gdpr_manager_externalDebug() {
        return this.functionalConsentFlow;
    }

    public final Flow<GdprConsentStatus> getMarketingConsentFlow$lib_gdpr_manager_externalDebug() {
        return this.marketingConsentFlow;
    }

    public final Flow<GdprConsentStatus> getPerformanceConsentFlow$lib_gdpr_manager_externalDebug() {
        return this.performanceConsentFlow;
    }

    public final Flow<Tuples2<GdprConsent, Instant>> getConsentFlow$lib_gdpr_manager_externalDebug() {
        return this.consentFlow;
    }

    public final Flow<Boolean> getHasCollectedConsentFlow$lib_gdpr_manager_externalDebug() {
        return this.hasCollectedConsentFlow;
    }

    public final void setConsent(GdprConsent consent, Instant updatedAt) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        this.functionalConsent.set(consent.getFunctional());
        this.marketingConsent.set(consent.getMarketing());
        this.performanceConsent.set(consent.getPerformance());
        this.lastUpdatedConsent.set(updatedAt != null ? updatedAt.toString() : null);
    }
}
