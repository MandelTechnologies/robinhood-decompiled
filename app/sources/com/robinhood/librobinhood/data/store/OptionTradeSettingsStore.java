package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.prefs.OptionOrderTradingSessionPref;
import com.robinhood.librobinhood.data.prefs.OptionTradingSessionPickerExtendedHoursNewTagPref;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.prefs.StringSetPreference;
import com.robinhood.prefs.StringToStringMapPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: OptionTradeSettingsStore.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionTradeSettingsStore;", "Lcom/robinhood/store/Store;", "optionOrderTradingSessionPref", "Lcom/robinhood/prefs/StringToStringMapPreference;", "optionTradingSessionPickerExtendedHoursNewTagPref", "Lcom/robinhood/prefs/StringSetPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/prefs/StringToStringMapPreference;Lcom/robinhood/prefs/StringSetPreference;Lcom/robinhood/store/StoreBundle;)V", "getOptionOrderTradingSession", "Lcom/robinhood/models/db/OrderMarketHours;", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "streamOptionOrderTradingSession", "Lkotlinx/coroutines/flow/Flow;", "setOptionOrderTradingSession", "", "orderTradingSession", "getOptionOrderTradeSessionKey", "", "shouldShowNewTagOnExtendedHours", "", "showedNewTagOnExtendedHours", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionTradeSettingsStore extends Store {
    private final StringToStringMapPreference optionOrderTradingSessionPref;
    private final StringSetPreference optionTradingSessionPickerExtendedHoursNewTagPref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionTradeSettingsStore(@OptionOrderTradingSessionPref StringToStringMapPreference optionOrderTradingSessionPref, @OptionTradingSessionPickerExtendedHoursNewTagPref StringSetPreference optionTradingSessionPickerExtendedHoursNewTagPref, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(optionOrderTradingSessionPref, "optionOrderTradingSessionPref");
        Intrinsics.checkNotNullParameter(optionTradingSessionPickerExtendedHoursNewTagPref, "optionTradingSessionPickerExtendedHoursNewTagPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.optionOrderTradingSessionPref = optionOrderTradingSessionPref;
        this.optionTradingSessionPickerExtendedHoursNewTagPref = optionTradingSessionPickerExtendedHoursNewTagPref;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderMarketHours getOptionOrderTradingSession(OptionChain.UnderlyingType underlyingType) {
        String str = this.optionOrderTradingSessionPref.getValues().get(getOptionOrderTradeSessionKey(underlyingType));
        if (str != null) {
            return OrderMarketHours.INSTANCE.fromServerValue(str);
        }
        return null;
    }

    public final Flow<OrderMarketHours> streamOptionOrderTradingSession(final OptionChain.UnderlyingType underlyingType) {
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.optionOrderTradingSessionPref.changes()), Integer.MAX_VALUE, null, 2, null);
        return new Flow<OrderMarketHours>() { // from class: com.robinhood.librobinhood.data.store.OptionTradeSettingsStore$streamOptionOrderTradingSession$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.OptionTradeSettingsStore$streamOptionOrderTradingSession$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ OptionChain.UnderlyingType $underlyingType$inlined;
                final /* synthetic */ OptionTradeSettingsStore this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionTradeSettingsStore$streamOptionOrderTradingSession$$inlined$map$1$2", m3645f = "OptionTradeSettingsStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.OptionTradeSettingsStore$streamOptionOrderTradingSession$$inlined$map$1$2$1, reason: invalid class name */
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, OptionTradeSettingsStore optionTradeSettingsStore, OptionChain.UnderlyingType underlyingType) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = optionTradeSettingsStore;
                    this.$underlyingType$inlined = underlyingType;
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
                        OrderMarketHours optionOrderTradingSession = this.this$0.getOptionOrderTradingSession(this.$underlyingType$inlined);
                        if (optionOrderTradingSession == null) {
                            optionOrderTradingSession = OrderMarketHours.REGULAR_HOURS;
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(optionOrderTradingSession, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super OrderMarketHours> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector, this, underlyingType), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final void setOptionOrderTradingSession(OptionChain.UnderlyingType underlyingType, OrderMarketHours orderTradingSession) {
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        Intrinsics.checkNotNullParameter(orderTradingSession, "orderTradingSession");
        this.optionOrderTradingSessionPref.put(getOptionOrderTradeSessionKey(underlyingType), orderTradingSession.getServerValue());
    }

    private final String getOptionOrderTradeSessionKey(OptionChain.UnderlyingType underlyingType) {
        return underlyingType.getServerValue();
    }

    public final boolean shouldShowNewTagOnExtendedHours(OptionChain.UnderlyingType underlyingType) {
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        return !this.optionTradingSessionPickerExtendedHoursNewTagPref.getValues().contains(getOptionOrderTradeSessionKey(underlyingType));
    }

    public final void showedNewTagOnExtendedHours(OptionChain.UnderlyingType underlyingType) {
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        this.optionTradingSessionPickerExtendedHoursNewTagPref.add(getOptionOrderTradeSessionKey(underlyingType));
    }
}
