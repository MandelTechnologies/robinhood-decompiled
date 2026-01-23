package com.robinhood.shared.trade.crypto.p397ui.powerInfoAlert;

import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.models.p320db.ClientComponentAlert;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.ServerDrivenAlert;
import com.robinhood.models.serverdriven.p347db.ActionButton;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.trade.crypto.C40095R;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: CryptoPowerInfoAlertProvider.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0002J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/powerInfoAlert/CryptoPowerInfoAlertProvider;", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/CryptoBuyingPowerStore;", "cryptoInputModePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "resources", "Landroid/content/res/Resources;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/librobinhood/data/store/CryptoBuyingPowerStore;Lcom/robinhood/prefs/EnumPreference;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Landroid/content/res/Resources;)V", "getPowerInfoAlertFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/ui/ServerDrivenAlert;", "currencyPairId", "Ljava/util/UUID;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "inputModeOverride", "cryptoInputModeFlow", "inputMode", "sellingPowerAlert", "Lcom/robinhood/models/db/ClientComponentAlert;", "assetCurrencyCode", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoPowerInfoAlertProvider {
    public static final int $stable = 8;
    private final AppType appType;
    private final CryptoBuyingPowerStore cryptoBuyingPowerStore;
    private final EnumPreference<CryptoInputMode> cryptoInputModePref;
    private final CurrencyPairV2Store currencyPairStore;
    private final Resources resources;

    /* compiled from: CryptoPowerInfoAlertProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CryptoInputMode.values().length];
            try {
                iArr2[CryptoInputMode.QUOTE_CURRENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CryptoInputMode.ASSET_CURRENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AppType.values().length];
            try {
                iArr3[AppType.RHC.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public CryptoPowerInfoAlertProvider(AppType appType, CryptoBuyingPowerStore cryptoBuyingPowerStore, EnumPreference<CryptoInputMode> cryptoInputModePref, CurrencyPairV2Store currencyPairStore, Resources resources) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptoBuyingPowerStore, "cryptoBuyingPowerStore");
        Intrinsics.checkNotNullParameter(cryptoInputModePref, "cryptoInputModePref");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.appType = appType;
        this.cryptoBuyingPowerStore = cryptoBuyingPowerStore;
        this.cryptoInputModePref = cryptoInputModePref;
        this.currencyPairStore = currencyPairStore;
        this.resources = resources;
    }

    public static /* synthetic */ Flow getPowerInfoAlertFlow$default(CryptoPowerInfoAlertProvider cryptoPowerInfoAlertProvider, UUID uuid, OrderSide orderSide, CryptoInputMode cryptoInputMode, int i, Object obj) {
        if ((i & 4) != 0) {
            cryptoInputMode = null;
        }
        return cryptoPowerInfoAlertProvider.getPowerInfoAlertFlow(uuid, orderSide, cryptoInputMode);
    }

    public final Flow<ServerDrivenAlert> getPowerInfoAlertFlow(UUID currencyPairId, OrderSide orderSide, CryptoInputMode inputModeOverride) {
        final Flow<ClientComponentAlert> flowStreamCryptoBuyingPowerAlert;
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        int i = WhenMappings.$EnumSwitchMapping$0[orderSide.ordinal()];
        if (i == 1) {
            flowStreamCryptoBuyingPowerAlert = this.cryptoBuyingPowerStore.streamCryptoBuyingPowerAlert(currencyPairId);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            flowStreamCryptoBuyingPowerAlert = FlowKt.transformLatest(this.currencyPairStore.streamCurrencyPairFlow(currencyPairId), new C40498x55de931a(null, this, inputModeOverride));
        }
        return new Flow<ServerDrivenAlert.LegacyAlert>() { // from class: com.robinhood.shared.trade.crypto.ui.powerInfoAlert.CryptoPowerInfoAlertProvider$getPowerInfoAlertFlow$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.trade.crypto.ui.powerInfoAlert.CryptoPowerInfoAlertProvider$getPowerInfoAlertFlow$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.powerInfoAlert.CryptoPowerInfoAlertProvider$getPowerInfoAlertFlow$$inlined$map$1$2", m3645f = "CryptoPowerInfoAlertProvider.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.trade.crypto.ui.powerInfoAlert.CryptoPowerInfoAlertProvider$getPowerInfoAlertFlow$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                        ClientComponentAlert clientComponentAlert = (ClientComponentAlert) obj;
                        ServerDrivenAlert.LegacyAlert legacyAlertFrom = clientComponentAlert != null ? ServerDrivenAlert.INSTANCE.from(clientComponentAlert) : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(legacyAlertFrom, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super ServerDrivenAlert.LegacyAlert> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamCryptoBuyingPowerAlert.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<CryptoInputMode> cryptoInputModeFlow(CryptoInputMode inputMode) {
        Flow<CryptoInputMode> flowFlowOf;
        return (inputMode == null || (flowFlowOf = FlowKt.flowOf(inputMode)) == null) ? Context7.buffer$default(RxConvert.asFlow(this.cryptoInputModePref.getChanges()), Integer.MAX_VALUE, null, 2, null) : flowFlowOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClientComponentAlert sellingPowerAlert(AppType appType, String assetCurrencyCode, CryptoInputMode inputMode) throws Resources.NotFoundException {
        int i;
        String string2;
        String string3 = this.resources.getString(C40095R.string.crypto_order_buying_power_alert_sell_title, assetCurrencyCode);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        Resources resources = this.resources;
        int i2 = WhenMappings.$EnumSwitchMapping$1[inputMode.ordinal()];
        if (i2 == 1) {
            i = C40095R.string.crypto_quote_order_sell_power_alert_message_v2;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C40095R.string.crypto_asset_order_sell_power_alert_message_v2;
        }
        String string4 = resources.getString(i, assetCurrencyCode);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        GenericAction.DismissAction dismissAction = GenericAction.DismissAction.INSTANCE;
        ActionButton.Style style = ActionButton.Style.FILLED_FOREGROUND;
        if (WhenMappings.$EnumSwitchMapping$2[appType.ordinal()] == 1) {
            string2 = this.resources.getString(C11048R.string.general_label_ok);
        } else {
            string2 = this.resources.getString(C40095R.string.crypto_order_buying_power_alert_sell_got_it_text);
        }
        String str = string2;
        Intrinsics.checkNotNull(str);
        return new ClientComponentAlert(string3, string4, CollectionsKt.listOf(new ActionButton(null, dismissAction, style, str, "")), null, null, 16, null);
    }
}
