package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.ordertypeschedule.SupportedOrderTypes;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.android.trading.contracts.configuration.DollarBased4;
import com.robinhood.android.trading.contracts.configuration.ShareOrder;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.TradingSession;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: EquityTradingSessionChangedStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.EquityTradingSessionChangedStore$determineCurrentSessionConfiguration$2$1", m3645f = "EquityTradingSessionChangedStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE, 224, 225, EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.EquityTradingSessionChangedStore$determineCurrentSessionConfiguration$2$1 */
/* loaded from: classes13.dex */
final class C33834xdbc23b3e extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super DirectOrder>, Object> {
    final /* synthetic */ DirectOrder $currentConfiguration;
    final /* synthetic */ UUID $instrumentId;
    final /* synthetic */ EquityOrderSide $side;
    final /* synthetic */ EquityTradingSessionChangedStore $this_runCatching;
    final /* synthetic */ boolean $useAdvancedMarket;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    boolean Z$0;
    boolean Z$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C33834xdbc23b3e(EquityOrderSide equityOrderSide, DirectOrder directOrder, boolean z, EquityTradingSessionChangedStore equityTradingSessionChangedStore, UUID uuid, Continuation<? super C33834xdbc23b3e> continuation) {
        super(2, continuation);
        this.$side = equityOrderSide;
        this.$currentConfiguration = directOrder;
        this.$useAdvancedMarket = z;
        this.$this_runCatching = equityTradingSessionChangedStore;
        this.$instrumentId = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C33834xdbc23b3e c33834xdbc23b3e = new C33834xdbc23b3e(this.$side, this.$currentConfiguration, this.$useAdvancedMarket, this.$this_runCatching, this.$instrumentId, continuation);
        c33834xdbc23b3e.L$0 = obj;
        return c33834xdbc23b3e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DirectOrder> continuation) {
        return ((C33834xdbc23b3e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0432 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Deferred deferredAsync$default;
        Object objAwait;
        Deferred deferred;
        Deferred deferred2;
        Deferred deferred3;
        Deferred deferred4;
        TradingSession tradingSession;
        Object objAwait2;
        Deferred deferred5;
        Deferred deferred6;
        EquityOrderSide equityOrderSide;
        BigDecimal bigDecimal;
        Object objAwait3;
        Deferred deferred7;
        int i;
        Deferred deferred8;
        Deferred deferred9;
        Deferred deferred10;
        Object objAwait4;
        int i2;
        Deferred deferred11;
        TradingSession tradingSession2;
        BigDecimal bigDecimal2;
        Deferred deferred12;
        Deferred deferred13;
        EquityOrderSide equityOrderSide2;
        boolean z;
        Deferred deferred14;
        Object objAwait5;
        BigDecimal bigDecimal3;
        EquityOrderSide equityOrderSide3;
        Deferred deferred15;
        Deferred deferred16;
        boolean z2;
        List listSelectableOrderTypes$default;
        Object objAwait6;
        Deferred deferred17;
        List list;
        Deferred deferred18;
        Object objAwait7;
        Deferred deferred19;
        Deferred deferred20;
        TradingSession tradingSession3;
        EquityOrderSide equityOrderSide4;
        Object objAwait8;
        Deferred deferred21;
        BigDecimal bigDecimal4;
        List list2;
        int i3;
        Object objAwait9;
        int i4;
        EquityOrderSide equityOrderSide5;
        Deferred deferred22;
        TradingSession tradingSession4;
        BigDecimal bigDecimal5;
        boolean z3;
        Object objAwait10;
        EquityOrderSide equityOrderSide6;
        List list3;
        boolean z4;
        Order.Configuration configurationDefaultOrderType;
        Object objAwait11;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new C33835xdaeed4d0(this.$this_runCatching, null), 3, null);
                Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new C33837xa1c8d787(this.$this_runCatching, this.$instrumentId, this.$currentConfiguration, null), 3, null);
                Deferred deferredAsync$default4 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new C33836x687d6e5a(this.$this_runCatching, this.$instrumentId, null), 3, null);
                deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new C33838xff4fbdeb(this.$this_runCatching, null), 3, null);
                Deferred deferredAsync$default5 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new C33839x8e8b6c2c(this.$this_runCatching, null), 3, null);
                this.L$0 = deferredAsync$default2;
                this.L$1 = deferredAsync$default3;
                this.L$2 = deferredAsync$default4;
                this.L$3 = deferredAsync$default;
                this.L$4 = deferredAsync$default5;
                this.label = 1;
                objAwait = deferredAsync$default2.await(this);
                if (objAwait != coroutine_suspended) {
                    deferred = deferredAsync$default2;
                    deferred2 = deferredAsync$default3;
                    deferred3 = deferredAsync$default5;
                    deferred4 = deferredAsync$default4;
                    tradingSession = (TradingSession) objAwait;
                    EquityOrderSide equityOrderSide7 = this.$side;
                    this.L$0 = deferred;
                    this.L$1 = deferred2;
                    this.L$2 = deferred4;
                    this.L$3 = deferredAsync$default;
                    this.L$4 = deferred3;
                    this.L$5 = tradingSession;
                    this.L$6 = equityOrderSide7;
                    this.label = 2;
                    objAwait2 = deferred2.await(this);
                    if (objAwait2 != coroutine_suspended) {
                        deferred5 = deferred;
                        deferred6 = deferred4;
                        equityOrderSide = equityOrderSide7;
                        Intrinsics.checkNotNullExpressionValue(objAwait2, "await(...)");
                        bigDecimal = (BigDecimal) objAwait2;
                        boolean z5 = this.$currentConfiguration instanceof ShareOrder;
                        this.L$0 = deferred5;
                        this.L$1 = deferred2;
                        this.L$2 = deferred6;
                        this.L$3 = deferredAsync$default;
                        this.L$4 = deferred3;
                        this.L$5 = tradingSession;
                        this.L$6 = equityOrderSide;
                        this.L$7 = bigDecimal;
                        this.I$0 = z5 ? 1 : 0;
                        this.label = 3;
                        objAwait3 = deferred6.await(this);
                        if (objAwait3 != coroutine_suspended) {
                            Deferred deferred23 = deferred6;
                            deferred7 = deferred3;
                            i = z5 ? 1 : 0;
                            deferred8 = deferredAsync$default;
                            deferred9 = deferred2;
                            deferred10 = deferred23;
                            boolean zIsOtc = ((Instrument) objAwait3).isOtc();
                            this.L$0 = deferred5;
                            this.L$1 = deferred9;
                            this.L$2 = deferred10;
                            this.L$3 = deferred8;
                            this.L$4 = deferred7;
                            this.L$5 = tradingSession;
                            this.L$6 = equityOrderSide;
                            this.L$7 = bigDecimal;
                            this.I$0 = i;
                            this.Z$0 = zIsOtc;
                            this.label = 4;
                            objAwait4 = deferred8.await(this);
                            if (objAwait4 != coroutine_suspended) {
                                TradingSession tradingSession5 = tradingSession;
                                i2 = i;
                                deferred11 = deferred8;
                                tradingSession2 = tradingSession5;
                                Deferred deferred24 = deferred7;
                                bigDecimal2 = bigDecimal;
                                deferred12 = deferred5;
                                deferred13 = deferred10;
                                equityOrderSide2 = equityOrderSide;
                                z = zIsOtc;
                                deferred14 = deferred24;
                                boolean zBooleanValue = ((Boolean) objAwait4).booleanValue();
                                this.L$0 = deferred12;
                                this.L$1 = deferred9;
                                this.L$2 = deferred13;
                                this.L$3 = deferred11;
                                this.L$4 = deferred14;
                                this.L$5 = tradingSession2;
                                this.L$6 = equityOrderSide2;
                                this.L$7 = bigDecimal2;
                                this.I$0 = i2;
                                this.Z$0 = z;
                                this.Z$1 = zBooleanValue;
                                this.label = 5;
                                objAwait5 = deferred14.await(this);
                                if (objAwait5 != coroutine_suspended) {
                                    bigDecimal3 = bigDecimal2;
                                    equityOrderSide3 = equityOrderSide2;
                                    deferred15 = deferred13;
                                    deferred16 = deferred9;
                                    z2 = zBooleanValue;
                                    listSelectableOrderTypes$default = SupportedOrderTypes.selectableOrderTypes$default(tradingSession2, equityOrderSide3, bigDecimal3, i2 == 0, z, z2, ((Boolean) objAwait5).booleanValue(), null, 64, null);
                                    if (!listSelectableOrderTypes$default.contains(this.$currentConfiguration.getOrderConfiguration())) {
                                        return null;
                                    }
                                    this.L$0 = deferred16;
                                    this.L$1 = deferred15;
                                    this.L$2 = deferred11;
                                    this.L$3 = deferred14;
                                    this.L$4 = listSelectableOrderTypes$default;
                                    this.L$5 = null;
                                    this.L$6 = null;
                                    this.L$7 = null;
                                    this.label = 6;
                                    objAwait6 = deferred12.await(this);
                                    if (objAwait6 != coroutine_suspended) {
                                        deferred17 = deferred11;
                                        list = listSelectableOrderTypes$default;
                                        deferred18 = deferred14;
                                        TradingSession tradingSession6 = (TradingSession) objAwait6;
                                        EquityOrderSide equityOrderSide8 = this.$side;
                                        this.L$0 = deferred15;
                                        this.L$1 = deferred17;
                                        this.L$2 = deferred18;
                                        this.L$3 = list;
                                        this.L$4 = tradingSession6;
                                        this.L$5 = equityOrderSide8;
                                        this.label = 7;
                                        objAwait7 = deferred16.await(this);
                                        if (objAwait7 != coroutine_suspended) {
                                            deferred19 = deferred17;
                                            deferred20 = deferred15;
                                            tradingSession3 = tradingSession6;
                                            equityOrderSide4 = equityOrderSide8;
                                            Intrinsics.checkNotNullExpressionValue(objAwait7, "await(...)");
                                            BigDecimal bigDecimal6 = (BigDecimal) objAwait7;
                                            boolean z6 = this.$currentConfiguration instanceof ShareOrder;
                                            this.L$0 = deferred20;
                                            this.L$1 = deferred19;
                                            this.L$2 = deferred18;
                                            this.L$3 = list;
                                            this.L$4 = tradingSession3;
                                            this.L$5 = equityOrderSide4;
                                            this.L$6 = bigDecimal6;
                                            this.I$0 = z6 ? 1 : 0;
                                            this.label = 8;
                                            objAwait8 = deferred20.await(this);
                                            if (objAwait8 != coroutine_suspended) {
                                                deferred21 = deferred18;
                                                bigDecimal4 = bigDecimal6;
                                                list2 = list;
                                                i3 = z6 ? 1 : 0;
                                                boolean zIsOtc2 = ((Instrument) objAwait8).isOtc();
                                                this.L$0 = deferred20;
                                                this.L$1 = deferred21;
                                                this.L$2 = list2;
                                                this.L$3 = tradingSession3;
                                                this.L$4 = equityOrderSide4;
                                                this.L$5 = bigDecimal4;
                                                this.L$6 = null;
                                                this.I$0 = i3;
                                                this.Z$0 = zIsOtc2;
                                                this.label = 9;
                                                objAwait9 = deferred19.await(this);
                                                if (objAwait9 != coroutine_suspended) {
                                                    EquityOrderSide equityOrderSide9 = equityOrderSide4;
                                                    i4 = i3;
                                                    equityOrderSide5 = equityOrderSide9;
                                                    deferred22 = deferred21;
                                                    tradingSession4 = tradingSession3;
                                                    bigDecimal5 = bigDecimal4;
                                                    z3 = zIsOtc2;
                                                    boolean zBooleanValue2 = ((Boolean) objAwait9).booleanValue();
                                                    this.L$0 = deferred20;
                                                    this.L$1 = list2;
                                                    this.L$2 = tradingSession4;
                                                    this.L$3 = equityOrderSide5;
                                                    this.L$4 = bigDecimal5;
                                                    this.L$5 = null;
                                                    this.I$0 = i4;
                                                    this.Z$0 = z3;
                                                    this.Z$1 = zBooleanValue2;
                                                    this.label = 10;
                                                    objAwait10 = deferred22.await(this);
                                                    if (objAwait10 != coroutine_suspended) {
                                                        equityOrderSide6 = equityOrderSide5;
                                                        list3 = list2;
                                                        z4 = zBooleanValue2;
                                                        configurationDefaultOrderType = SupportedOrderTypes.defaultOrderType(tradingSession4, equityOrderSide6, bigDecimal5, i4 == 0, z3, z4, ((Boolean) objAwait10).booleanValue(), list3);
                                                        if (configurationDefaultOrderType == null) {
                                                            String accountNumber = this.$currentConfiguration.getAccountNumber();
                                                            this.L$0 = configurationDefaultOrderType;
                                                            this.L$1 = accountNumber;
                                                            this.L$2 = null;
                                                            this.L$3 = null;
                                                            this.L$4 = null;
                                                            this.label = 11;
                                                            objAwait11 = deferred20.await(this);
                                                            if (objAwait11 != coroutine_suspended) {
                                                                str = accountNumber;
                                                                Order.Configuration configuration = configurationDefaultOrderType;
                                                                Intrinsics.checkNotNullExpressionValue(objAwait11, "await(...)");
                                                                Instrument instrument = (Instrument) objAwait11;
                                                                EquityOrderSide equityOrderSide10 = this.$side;
                                                                DirectOrder directOrder = this.$currentConfiguration;
                                                                boolean z7 = directOrder instanceof ShareOrder;
                                                                ShareOrder shareOrder = !(directOrder instanceof ShareOrder) ? (ShareOrder) directOrder : null;
                                                                BigDecimal shareQuantity = shareOrder == null ? shareOrder.getShareQuantity() : null;
                                                                DirectOrder directOrder2 = this.$currentConfiguration;
                                                                DollarBased4 dollarBased4 = !(directOrder2 instanceof DollarBased4) ? (DollarBased4) directOrder2 : null;
                                                                return SupportedOrderTypes.inflate(configuration, str, instrument, equityOrderSide10, z7, shareQuantity, dollarBased4 != null ? dollarBased4.getDollarAmount() : null, this.$useAdvancedMarket);
                                                            }
                                                        } else {
                                                            throw new IllegalStateException("No valid order configuration possible");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                deferred3 = (Deferred) this.L$4;
                Deferred deferred25 = (Deferred) this.L$3;
                deferred4 = (Deferred) this.L$2;
                Deferred deferred26 = (Deferred) this.L$1;
                deferred = (Deferred) this.L$0;
                ResultKt.throwOnFailure(obj);
                deferredAsync$default = deferred25;
                deferred2 = deferred26;
                objAwait = obj;
                tradingSession = (TradingSession) objAwait;
                EquityOrderSide equityOrderSide72 = this.$side;
                this.L$0 = deferred;
                this.L$1 = deferred2;
                this.L$2 = deferred4;
                this.L$3 = deferredAsync$default;
                this.L$4 = deferred3;
                this.L$5 = tradingSession;
                this.L$6 = equityOrderSide72;
                this.label = 2;
                objAwait2 = deferred2.await(this);
                if (objAwait2 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 2:
                EquityOrderSide equityOrderSide11 = (EquityOrderSide) this.L$6;
                TradingSession tradingSession7 = (TradingSession) this.L$5;
                Deferred deferred27 = (Deferred) this.L$4;
                Deferred deferred28 = (Deferred) this.L$3;
                deferred6 = (Deferred) this.L$2;
                deferred2 = (Deferred) this.L$1;
                Deferred deferred29 = (Deferred) this.L$0;
                ResultKt.throwOnFailure(obj);
                equityOrderSide = equityOrderSide11;
                deferred3 = deferred27;
                deferredAsync$default = deferred28;
                deferred5 = deferred29;
                objAwait2 = obj;
                tradingSession = tradingSession7;
                Intrinsics.checkNotNullExpressionValue(objAwait2, "await(...)");
                bigDecimal = (BigDecimal) objAwait2;
                boolean z52 = this.$currentConfiguration instanceof ShareOrder;
                this.L$0 = deferred5;
                this.L$1 = deferred2;
                this.L$2 = deferred6;
                this.L$3 = deferredAsync$default;
                this.L$4 = deferred3;
                this.L$5 = tradingSession;
                this.L$6 = equityOrderSide;
                this.L$7 = bigDecimal;
                this.I$0 = z52 ? 1 : 0;
                this.label = 3;
                objAwait3 = deferred6.await(this);
                if (objAwait3 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 3:
                i = this.I$0;
                bigDecimal = (BigDecimal) this.L$7;
                equityOrderSide = (EquityOrderSide) this.L$6;
                tradingSession = (TradingSession) this.L$5;
                deferred7 = (Deferred) this.L$4;
                Deferred deferred30 = (Deferred) this.L$3;
                Deferred deferred31 = (Deferred) this.L$2;
                Deferred deferred32 = (Deferred) this.L$1;
                deferred5 = (Deferred) this.L$0;
                ResultKt.throwOnFailure(obj);
                deferred8 = deferred30;
                deferred10 = deferred31;
                deferred9 = deferred32;
                objAwait3 = obj;
                boolean zIsOtc3 = ((Instrument) objAwait3).isOtc();
                this.L$0 = deferred5;
                this.L$1 = deferred9;
                this.L$2 = deferred10;
                this.L$3 = deferred8;
                this.L$4 = deferred7;
                this.L$5 = tradingSession;
                this.L$6 = equityOrderSide;
                this.L$7 = bigDecimal;
                this.I$0 = i;
                this.Z$0 = zIsOtc3;
                this.label = 4;
                objAwait4 = deferred8.await(this);
                if (objAwait4 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 4:
                boolean z8 = this.Z$0;
                int i5 = this.I$0;
                BigDecimal bigDecimal7 = (BigDecimal) this.L$7;
                EquityOrderSide equityOrderSide12 = (EquityOrderSide) this.L$6;
                TradingSession tradingSession8 = (TradingSession) this.L$5;
                Deferred deferred33 = (Deferred) this.L$4;
                Deferred deferred34 = (Deferred) this.L$3;
                Deferred deferred35 = (Deferred) this.L$2;
                Deferred deferred36 = (Deferred) this.L$1;
                Deferred deferred37 = (Deferred) this.L$0;
                ResultKt.throwOnFailure(obj);
                z = z8;
                deferred11 = deferred34;
                tradingSession2 = tradingSession8;
                bigDecimal2 = bigDecimal7;
                i2 = i5;
                deferred12 = deferred37;
                deferred9 = deferred36;
                deferred13 = deferred35;
                deferred14 = deferred33;
                equityOrderSide2 = equityOrderSide12;
                objAwait4 = obj;
                boolean zBooleanValue3 = ((Boolean) objAwait4).booleanValue();
                this.L$0 = deferred12;
                this.L$1 = deferred9;
                this.L$2 = deferred13;
                this.L$3 = deferred11;
                this.L$4 = deferred14;
                this.L$5 = tradingSession2;
                this.L$6 = equityOrderSide2;
                this.L$7 = bigDecimal2;
                this.I$0 = i2;
                this.Z$0 = z;
                this.Z$1 = zBooleanValue3;
                this.label = 5;
                objAwait5 = deferred14.await(this);
                if (objAwait5 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 5:
                boolean z9 = this.Z$1;
                z = this.Z$0;
                i2 = this.I$0;
                BigDecimal bigDecimal8 = (BigDecimal) this.L$7;
                EquityOrderSide equityOrderSide13 = (EquityOrderSide) this.L$6;
                tradingSession2 = (TradingSession) this.L$5;
                deferred14 = (Deferred) this.L$4;
                Deferred deferred38 = (Deferred) this.L$3;
                Deferred deferred39 = (Deferred) this.L$2;
                Deferred deferred40 = (Deferred) this.L$1;
                deferred12 = (Deferred) this.L$0;
                ResultKt.throwOnFailure(obj);
                objAwait5 = obj;
                z2 = z9;
                bigDecimal3 = bigDecimal8;
                equityOrderSide3 = equityOrderSide13;
                deferred11 = deferred38;
                deferred15 = deferred39;
                deferred16 = deferred40;
                listSelectableOrderTypes$default = SupportedOrderTypes.selectableOrderTypes$default(tradingSession2, equityOrderSide3, bigDecimal3, i2 == 0, z, z2, ((Boolean) objAwait5).booleanValue(), null, 64, null);
                if (!listSelectableOrderTypes$default.contains(this.$currentConfiguration.getOrderConfiguration())) {
                }
                break;
            case 6:
                list = (List) this.L$4;
                deferred18 = (Deferred) this.L$3;
                deferred17 = (Deferred) this.L$2;
                deferred15 = (Deferred) this.L$1;
                deferred16 = (Deferred) this.L$0;
                ResultKt.throwOnFailure(obj);
                objAwait6 = obj;
                TradingSession tradingSession62 = (TradingSession) objAwait6;
                EquityOrderSide equityOrderSide82 = this.$side;
                this.L$0 = deferred15;
                this.L$1 = deferred17;
                this.L$2 = deferred18;
                this.L$3 = list;
                this.L$4 = tradingSession62;
                this.L$5 = equityOrderSide82;
                this.label = 7;
                objAwait7 = deferred16.await(this);
                if (objAwait7 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 7:
                EquityOrderSide equityOrderSide14 = (EquityOrderSide) this.L$5;
                TradingSession tradingSession9 = (TradingSession) this.L$4;
                List list4 = (List) this.L$3;
                Deferred deferred41 = (Deferred) this.L$2;
                Deferred deferred42 = (Deferred) this.L$1;
                Deferred deferred43 = (Deferred) this.L$0;
                ResultKt.throwOnFailure(obj);
                equityOrderSide4 = equityOrderSide14;
                list = list4;
                tradingSession3 = tradingSession9;
                deferred18 = deferred41;
                deferred19 = deferred42;
                deferred20 = deferred43;
                objAwait7 = obj;
                Intrinsics.checkNotNullExpressionValue(objAwait7, "await(...)");
                BigDecimal bigDecimal62 = (BigDecimal) objAwait7;
                boolean z62 = this.$currentConfiguration instanceof ShareOrder;
                this.L$0 = deferred20;
                this.L$1 = deferred19;
                this.L$2 = deferred18;
                this.L$3 = list;
                this.L$4 = tradingSession3;
                this.L$5 = equityOrderSide4;
                this.L$6 = bigDecimal62;
                this.I$0 = z62 ? 1 : 0;
                this.label = 8;
                objAwait8 = deferred20.await(this);
                if (objAwait8 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 8:
                i3 = this.I$0;
                bigDecimal4 = (BigDecimal) this.L$6;
                equityOrderSide4 = (EquityOrderSide) this.L$5;
                tradingSession3 = (TradingSession) this.L$4;
                List list5 = (List) this.L$3;
                deferred21 = (Deferred) this.L$2;
                deferred19 = (Deferred) this.L$1;
                deferred20 = (Deferred) this.L$0;
                ResultKt.throwOnFailure(obj);
                list2 = list5;
                objAwait8 = obj;
                boolean zIsOtc22 = ((Instrument) objAwait8).isOtc();
                this.L$0 = deferred20;
                this.L$1 = deferred21;
                this.L$2 = list2;
                this.L$3 = tradingSession3;
                this.L$4 = equityOrderSide4;
                this.L$5 = bigDecimal4;
                this.L$6 = null;
                this.I$0 = i3;
                this.Z$0 = zIsOtc22;
                this.label = 9;
                objAwait9 = deferred19.await(this);
                if (objAwait9 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 9:
                boolean z10 = this.Z$0;
                int i6 = this.I$0;
                BigDecimal bigDecimal9 = (BigDecimal) this.L$5;
                EquityOrderSide equityOrderSide15 = (EquityOrderSide) this.L$4;
                TradingSession tradingSession10 = (TradingSession) this.L$3;
                List list6 = (List) this.L$2;
                deferred22 = (Deferred) this.L$1;
                deferred20 = (Deferred) this.L$0;
                ResultKt.throwOnFailure(obj);
                z3 = z10;
                equityOrderSide5 = equityOrderSide15;
                bigDecimal5 = bigDecimal9;
                i4 = i6;
                list2 = list6;
                tradingSession4 = tradingSession10;
                objAwait9 = obj;
                boolean zBooleanValue22 = ((Boolean) objAwait9).booleanValue();
                this.L$0 = deferred20;
                this.L$1 = list2;
                this.L$2 = tradingSession4;
                this.L$3 = equityOrderSide5;
                this.L$4 = bigDecimal5;
                this.L$5 = null;
                this.I$0 = i4;
                this.Z$0 = z3;
                this.Z$1 = zBooleanValue22;
                this.label = 10;
                objAwait10 = deferred22.await(this);
                if (objAwait10 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 10:
                boolean z11 = this.Z$1;
                z3 = this.Z$0;
                i4 = this.I$0;
                bigDecimal5 = (BigDecimal) this.L$4;
                EquityOrderSide equityOrderSide16 = (EquityOrderSide) this.L$3;
                tradingSession4 = (TradingSession) this.L$2;
                List list7 = (List) this.L$1;
                deferred20 = (Deferred) this.L$0;
                ResultKt.throwOnFailure(obj);
                z4 = z11;
                equityOrderSide6 = equityOrderSide16;
                list3 = list7;
                objAwait10 = obj;
                configurationDefaultOrderType = SupportedOrderTypes.defaultOrderType(tradingSession4, equityOrderSide6, bigDecimal5, i4 == 0, z3, z4, ((Boolean) objAwait10).booleanValue(), list3);
                if (configurationDefaultOrderType == null) {
                }
                break;
            case 11:
                String str2 = (String) this.L$1;
                configurationDefaultOrderType = (Order.Configuration) this.L$0;
                ResultKt.throwOnFailure(obj);
                objAwait11 = obj;
                str = str2;
                Order.Configuration configuration2 = configurationDefaultOrderType;
                Intrinsics.checkNotNullExpressionValue(objAwait11, "await(...)");
                Instrument instrument2 = (Instrument) objAwait11;
                EquityOrderSide equityOrderSide102 = this.$side;
                DirectOrder directOrder3 = this.$currentConfiguration;
                boolean z72 = directOrder3 instanceof ShareOrder;
                if (!(directOrder3 instanceof ShareOrder)) {
                }
                if (shareOrder == null) {
                }
                DirectOrder directOrder22 = this.$currentConfiguration;
                if (!(directOrder22 instanceof DollarBased4)) {
                }
                return SupportedOrderTypes.inflate(configuration2, str, instrument2, equityOrderSide102, z72, shareQuantity, dollarBased4 != null ? dollarBased4.getDollarAmount() : null, this.$useAdvancedMarket);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
