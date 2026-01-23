package com.robinhood.android.equities.equityupsell;

import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.StringToBooleanMapPreference;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;

/* compiled from: EquityUpsellService.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001f\u0010\u0017J'\u0010!\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J%\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b$\u0010\u0017J'\u0010&\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\b\u0012\u0004\u0012\u00020#0\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b(\u0010\u0017J'\u0010)\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b)\u0010\u001dJ'\u0010*\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020\u001e¢\u0006\u0004\b*\u0010\"J'\u0010+\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010%\u001a\u00020#¢\u0006\u0004\b+\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010,R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010-R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010.¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/equities/equityupsell/EquityUpsellService;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/prefs/StringToLongMapPreference;", "equityUpsellViewCountPref", "equityUpsellLastSeenPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "equityUpsellCompletePref", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/prefs/StringToLongMapPreference;Lcom/robinhood/prefs/StringToLongMapPreference;Lcom/robinhood/prefs/StringToBooleanMapPreference;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)V", "Lcom/robinhood/android/equities/equityupsell/UpsellLocation;", "upsellLocation", "Lcom/robinhood/android/equities/equityupsell/EquityUpsell;", "upsell", "", "getUpsellPrefKey", "(Lcom/robinhood/android/equities/equityupsell/UpsellLocation;Lcom/robinhood/android/equities/equityupsell/EquityUpsell;)Ljava/lang/String;", "Lkotlinx/coroutines/flow/Flow;", "", "getUpsellViewCountChanges", "(Lcom/robinhood/android/equities/equityupsell/UpsellLocation;Lcom/robinhood/android/equities/equityupsell/EquityUpsell;)Lkotlinx/coroutines/flow/Flow;", "getUpsellViewCountPref", "(Lcom/robinhood/android/equities/equityupsell/UpsellLocation;Lcom/robinhood/android/equities/equityupsell/EquityUpsell;)I", "viewCount", "", "setUpsellViewCountPref", "(Lcom/robinhood/android/equities/equityupsell/UpsellLocation;Lcom/robinhood/android/equities/equityupsell/EquityUpsell;I)V", "", "getUpsellLastSeenChanges", "lastSeenMillis", "setUpsellLastSeenPref", "(Lcom/robinhood/android/equities/equityupsell/UpsellLocation;Lcom/robinhood/android/equities/equityupsell/EquityUpsell;J)V", "", "getUpsellCompleteChanges", "complete", "setUpsellCompletePref", "(Lcom/robinhood/android/equities/equityupsell/UpsellLocation;Lcom/robinhood/android/equities/equityupsell/EquityUpsell;Z)V", "shouldShowUpsell", "setUpsellViewCount", "setUpsellLastSeen", "setUpsellComplete", "Lcom/robinhood/prefs/StringToLongMapPreference;", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "Lj$/time/Clock;", "lib-equity-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EquityUpsellService extends Store {
    public static final int $stable = 8;
    private final Clock clock;
    private final StringToBooleanMapPreference equityUpsellCompletePref;
    private final StringToLongMapPreference equityUpsellLastSeenPref;
    private final StringToLongMapPreference equityUpsellViewCountPref;

    /* compiled from: EquityUpsellService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EquityUpsell.values().length];
            try {
                iArr[EquityUpsell.POST_TRADE_AUTO_SEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityUpsellService(@EquityUpsellModule4 StringToLongMapPreference equityUpsellViewCountPref, @EquityUpsellModule3 StringToLongMapPreference equityUpsellLastSeenPref, @EquityUpsellModule2 StringToBooleanMapPreference equityUpsellCompletePref, Clock clock, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(equityUpsellViewCountPref, "equityUpsellViewCountPref");
        Intrinsics.checkNotNullParameter(equityUpsellLastSeenPref, "equityUpsellLastSeenPref");
        Intrinsics.checkNotNullParameter(equityUpsellCompletePref, "equityUpsellCompletePref");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.equityUpsellViewCountPref = equityUpsellViewCountPref;
        this.equityUpsellLastSeenPref = equityUpsellLastSeenPref;
        this.equityUpsellCompletePref = equityUpsellCompletePref;
        this.clock = clock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getUpsellPrefKey(UpsellLocation upsellLocation, EquityUpsell upsell) {
        return upsellLocation + "_" + upsell;
    }

    private final Flow<Integer> getUpsellViewCountChanges(final UpsellLocation upsellLocation, final EquityUpsell upsell) {
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.equityUpsellViewCountPref.changes()), Integer.MAX_VALUE, null, 2, null);
        return FlowKt.distinctUntilChanged(new Flow<Integer>() { // from class: com.robinhood.android.equities.equityupsell.EquityUpsellService$getUpsellViewCountChanges$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equities.equityupsell.EquityUpsellService$getUpsellViewCountChanges$$inlined$map$1$2 */
            public static final class C147002<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ EquityUpsell $upsell$inlined;
                final /* synthetic */ UpsellLocation $upsellLocation$inlined;
                final /* synthetic */ EquityUpsellService this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.equityupsell.EquityUpsellService$getUpsellViewCountChanges$$inlined$map$1$2", m3645f = "EquityUpsellService.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.equities.equityupsell.EquityUpsellService$getUpsellViewCountChanges$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C147002.this.emit(null, this);
                    }
                }

                public C147002(FlowCollector flowCollector, EquityUpsellService equityUpsellService, UpsellLocation upsellLocation, EquityUpsell equityUpsell) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = equityUpsellService;
                    this.$upsellLocation$inlined = upsellLocation;
                    this.$upsell$inlined = equityUpsell;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Integer numBoxInt = boxing.boxInt((int) this.this$0.equityUpsellViewCountPref.get(this.this$0.getUpsellPrefKey(this.$upsellLocation$inlined, this.$upsell$inlined), 0L));
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(numBoxInt, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new C147002(flowCollector, this, upsellLocation, upsell), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    private final int getUpsellViewCountPref(UpsellLocation upsellLocation, EquityUpsell upsell) {
        return (int) this.equityUpsellViewCountPref.get(getUpsellPrefKey(upsellLocation, upsell), 0L);
    }

    private final void setUpsellViewCountPref(UpsellLocation upsellLocation, EquityUpsell upsell, int viewCount) {
        this.equityUpsellViewCountPref.set(getUpsellPrefKey(upsellLocation, upsell), viewCount);
    }

    private final Flow<Long> getUpsellLastSeenChanges(final UpsellLocation upsellLocation, final EquityUpsell upsell) {
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.equityUpsellLastSeenPref.changes()), Integer.MAX_VALUE, null, 2, null);
        return FlowKt.distinctUntilChanged(new Flow<Long>() { // from class: com.robinhood.android.equities.equityupsell.EquityUpsellService$getUpsellLastSeenChanges$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equities.equityupsell.EquityUpsellService$getUpsellLastSeenChanges$$inlined$map$1$2 */
            public static final class C146992<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ EquityUpsell $upsell$inlined;
                final /* synthetic */ UpsellLocation $upsellLocation$inlined;
                final /* synthetic */ EquityUpsellService this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.equityupsell.EquityUpsellService$getUpsellLastSeenChanges$$inlined$map$1$2", m3645f = "EquityUpsellService.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.equities.equityupsell.EquityUpsellService$getUpsellLastSeenChanges$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C146992.this.emit(null, this);
                    }
                }

                public C146992(FlowCollector flowCollector, EquityUpsellService equityUpsellService, UpsellLocation upsellLocation, EquityUpsell equityUpsell) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = equityUpsellService;
                    this.$upsellLocation$inlined = upsellLocation;
                    this.$upsell$inlined = equityUpsell;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Long lBoxLong = boxing.boxLong(this.this$0.equityUpsellLastSeenPref.get(this.this$0.getUpsellPrefKey(this.$upsellLocation$inlined, this.$upsell$inlined), 0L));
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(lBoxLong, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Long> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new C146992(flowCollector, this, upsellLocation, upsell), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    private final void setUpsellLastSeenPref(UpsellLocation upsellLocation, EquityUpsell upsell, long lastSeenMillis) {
        this.equityUpsellLastSeenPref.set(getUpsellPrefKey(upsellLocation, upsell), lastSeenMillis);
    }

    private final Flow<Boolean> getUpsellCompleteChanges(final UpsellLocation upsellLocation, final EquityUpsell upsell) {
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.equityUpsellCompletePref.changes()), Integer.MAX_VALUE, null, 2, null);
        return FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.robinhood.android.equities.equityupsell.EquityUpsellService$getUpsellCompleteChanges$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equities.equityupsell.EquityUpsellService$getUpsellCompleteChanges$$inlined$map$1$2 */
            public static final class C146982<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ EquityUpsell $upsell$inlined;
                final /* synthetic */ UpsellLocation $upsellLocation$inlined;
                final /* synthetic */ EquityUpsellService this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.equityupsell.EquityUpsellService$getUpsellCompleteChanges$$inlined$map$1$2", m3645f = "EquityUpsellService.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.equities.equityupsell.EquityUpsellService$getUpsellCompleteChanges$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C146982.this.emit(null, this);
                    }
                }

                public C146982(FlowCollector flowCollector, EquityUpsellService equityUpsellService, UpsellLocation upsellLocation, EquityUpsell equityUpsell) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = equityUpsellService;
                    this.$upsellLocation$inlined = upsellLocation;
                    this.$upsell$inlined = equityUpsell;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Boolean boolBoxBoolean = boxing.boxBoolean(this.this$0.equityUpsellCompletePref.get(this.this$0.getUpsellPrefKey(this.$upsellLocation$inlined, this.$upsell$inlined), false));
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new C146982(flowCollector, this, upsellLocation, upsell), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    private final void setUpsellCompletePref(UpsellLocation upsellLocation, EquityUpsell upsell, boolean complete) {
        this.equityUpsellCompletePref.set(getUpsellPrefKey(upsellLocation, upsell), complete);
    }

    public final Flow<Boolean> shouldShowUpsell(UpsellLocation upsellLocation, EquityUpsell upsell) {
        Intrinsics.checkNotNullParameter(upsellLocation, "upsellLocation");
        Intrinsics.checkNotNullParameter(upsell, "upsell");
        if (WhenMappings.$EnumSwitchMapping$0[upsell.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        return FlowKt.combine(getUpsellViewCountChanges(upsellLocation, upsell), getUpsellLastSeenChanges(upsellLocation, upsell), getUpsellCompleteChanges(upsellLocation, upsell), new C147011(null));
    }

    /* compiled from: EquityUpsellService.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "viewCount", "", "dismissedTime", "", "upsellComplete"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.equityupsell.EquityUpsellService$shouldShowUpsell$1", m3645f = "EquityUpsellService.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.equityupsell.EquityUpsellService$shouldShowUpsell$1 */
    static final class C147011 extends ContinuationImpl7 implements Function4<Integer, Long, Boolean, Continuation<? super Boolean>, Object> {
        /* synthetic */ int I$0;
        /* synthetic */ long J$0;
        /* synthetic */ boolean Z$0;
        int label;

        C147011(Continuation<? super C147011> continuation) {
            super(4, continuation);
        }

        public final Object invoke(int i, long j, boolean z, Continuation<? super Boolean> continuation) {
            C147011 c147011 = EquityUpsellService.this.new C147011(continuation);
            c147011.I$0 = i;
            c147011.J$0 = j;
            c147011.Z$0 = z;
            return c147011.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Long l, Boolean bool, Continuation<? super Boolean> continuation) {
            return invoke(num.intValue(), l.longValue(), bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i = this.I$0;
            long j = this.J$0;
            return boxing.boxBoolean(!this.Z$0 && i < 3 && ((j > 0L ? 1 : (j == 0L ? 0 : -1)) == 0 || ((EquityUpsellService.this.clock.millis() - j) > 2592000000L ? 1 : ((EquityUpsellService.this.clock.millis() - j) == 2592000000L ? 0 : -1)) >= 0));
        }
    }

    public static /* synthetic */ void setUpsellViewCount$default(EquityUpsellService equityUpsellService, UpsellLocation upsellLocation, EquityUpsell equityUpsell, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = equityUpsellService.getUpsellViewCountPref(upsellLocation, equityUpsell) + 1;
        }
        equityUpsellService.setUpsellViewCount(upsellLocation, equityUpsell, i);
    }

    public final void setUpsellViewCount(UpsellLocation upsellLocation, EquityUpsell upsell, int viewCount) {
        Intrinsics.checkNotNullParameter(upsellLocation, "upsellLocation");
        Intrinsics.checkNotNullParameter(upsell, "upsell");
        if (WhenMappings.$EnumSwitchMapping$0[upsell.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        setUpsellViewCountPref(upsellLocation, upsell, viewCount);
    }

    public static /* synthetic */ void setUpsellLastSeen$default(EquityUpsellService equityUpsellService, UpsellLocation upsellLocation, EquityUpsell equityUpsell, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = equityUpsellService.clock.millis();
        }
        equityUpsellService.setUpsellLastSeen(upsellLocation, equityUpsell, j);
    }

    public final void setUpsellLastSeen(UpsellLocation upsellLocation, EquityUpsell upsell, long lastSeenMillis) {
        Intrinsics.checkNotNullParameter(upsellLocation, "upsellLocation");
        Intrinsics.checkNotNullParameter(upsell, "upsell");
        if (WhenMappings.$EnumSwitchMapping$0[upsell.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        setUpsellLastSeenPref(upsellLocation, upsell, lastSeenMillis);
    }

    public static /* synthetic */ void setUpsellComplete$default(EquityUpsellService equityUpsellService, UpsellLocation upsellLocation, EquityUpsell equityUpsell, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        equityUpsellService.setUpsellComplete(upsellLocation, equityUpsell, z);
    }

    public final void setUpsellComplete(UpsellLocation upsellLocation, EquityUpsell upsell, boolean complete) {
        Intrinsics.checkNotNullParameter(upsellLocation, "upsellLocation");
        Intrinsics.checkNotNullParameter(upsell, "upsell");
        if (WhenMappings.$EnumSwitchMapping$0[upsell.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        setUpsellCompletePref(upsellLocation, upsell, complete);
    }
}
