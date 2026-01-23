package com.robinhood.android.trade.equity.symbol;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.compose.ComponentActivity6;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.Activity;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: EquityOrderWithSymbolActivity.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0010\u0010\rR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0013\u0010\rR\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/trade/equity/symbol/EquityOrderWithSymbolActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", EquityOrderWithSymbolActivity.EXTRA_SIDE, "Lcom/robinhood/models/db/EquityOrderSide;", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "side$delegate", "Lkotlin/Lazy;", "instrumentSymbol", "", "getInstrumentSymbol", "()Ljava/lang/String;", "instrumentSymbol$delegate", EquityOrderWithSymbolActivity.EXTRA_COMPLETION_URL, "getCompletionUrl", "completionUrl$delegate", "accountNumber", "getAccountNumber", "accountNumber$delegate", "duxo", "Lcom/robinhood/android/trade/equity/symbol/EquityOrderWithSymbolDuxo;", "getDuxo", "()Lcom/robinhood/android/trade/equity/symbol/EquityOrderWithSymbolDuxo;", "duxo$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "startOrderActivity", "state", "Lcom/robinhood/android/trade/equity/symbol/EquityOrderWithSymbolViewState;", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class EquityOrderWithSymbolActivity extends BaseActivity {
    private static final String EXTRA_ACCOUNT_NUMBER = "accountNumber";
    private static final String EXTRA_COMPLETION_URL = "completionUrl";
    private static final String EXTRA_INSTRUMENT_SYMBOL = "symbol";
    private static final String EXTRA_SIDE = "side";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: side$delegate, reason: from kotlin metadata */
    private final Lazy side = Activity.intentExtra(this, EXTRA_SIDE);

    /* renamed from: instrumentSymbol$delegate, reason: from kotlin metadata */
    private final Lazy instrumentSymbol = Activity.intentExtra(this, "symbol");

    /* renamed from: completionUrl$delegate, reason: from kotlin metadata */
    private final Lazy completionUrl = Activity.intentExtra(this, EXTRA_COMPLETION_URL);

    /* renamed from: accountNumber$delegate, reason: from kotlin metadata */
    private final Lazy accountNumber = Activity.intentExtra(this, "accountNumber");

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, EquityOrderWithSymbolDuxo.class);

    private final EquityOrderSide getSide() {
        return (EquityOrderSide) this.side.getValue();
    }

    private final String getInstrumentSymbol() {
        return (String) this.instrumentSymbol.getValue();
    }

    private final String getCompletionUrl() {
        return (String) this.completionUrl.getValue();
    }

    private final String getAccountNumber() {
        return (String) this.accountNumber.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EquityOrderWithSymbolDuxo getDuxo() {
        return (EquityOrderWithSymbolDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ComponentActivity6.setContent$default(this, null, ComposableLambda3.composableLambdaInstance(-1890802993, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.equity.symbol.EquityOrderWithSymbolActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1890802993, i, -1, "com.robinhood.android.trade.equity.symbol.EquityOrderWithSymbolActivity.onCreate.<anonymous> (EquityOrderWithSymbolActivity.kt:46)");
                }
                BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(EquityOrderWithSymbolActivity.this)), null, EquityOrderWithSymbolActivity2.INSTANCE.m19268getLambda$624029091$feature_trade_equity_externalDebug(), composer, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 1, null);
        getDuxo().getInstrument(getInstrumentSymbol());
        BaseActivity.collectDuxoState$default(this, null, new C293972(null), 1, null);
    }

    /* compiled from: EquityOrderWithSymbolActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.symbol.EquityOrderWithSymbolActivity$onCreate$2", m3645f = "EquityOrderWithSymbolActivity.kt", m3646l = {70}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.symbol.EquityOrderWithSymbolActivity$onCreate$2 */
    static final class C293972 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C293972(Continuation<? super C293972> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityOrderWithSymbolActivity.this.new C293972(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C293972) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EquityOrderWithSymbolActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.trade.equity.symbol.EquityOrderWithSymbolActivity$onCreate$2$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ EquityOrderWithSymbolActivity $tmp0;

            AnonymousClass1(EquityOrderWithSymbolActivity equityOrderWithSymbolActivity) {
                this.$tmp0 = equityOrderWithSymbolActivity;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, EquityOrderWithSymbolActivity.class, "startOrderActivity", "startOrderActivity(Lcom/robinhood/android/trade/equity/symbol/EquityOrderWithSymbolViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(EquityOrderWithSymbolViewState equityOrderWithSymbolViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$startOrderActivity = C293972.invokeSuspend$startOrderActivity(this.$tmp0, equityOrderWithSymbolViewState, continuation);
                return objInvokeSuspend$startOrderActivity == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$startOrderActivity : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((EquityOrderWithSymbolViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<EquityOrderWithSymbolViewState> stateFlow = EquityOrderWithSymbolActivity.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EquityOrderWithSymbolActivity.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$startOrderActivity(EquityOrderWithSymbolActivity equityOrderWithSymbolActivity, EquityOrderWithSymbolViewState equityOrderWithSymbolViewState, Continuation continuation) {
            equityOrderWithSymbolActivity.startOrderActivity(equityOrderWithSymbolViewState);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startOrderActivity(EquityOrderWithSymbolViewState state) {
        UUID instrumentId = state.getInstrumentId();
        if (instrumentId != null) {
            finish();
            Navigator navigator = getNavigator();
            EquityOrderSide side = getSide();
            String completionUrl = getCompletionUrl();
            UUID uuid = null;
            Navigator.DefaultImpls.startActivity$default(navigator, this, new EquityOrderActivityIntentKey.WithId(instrumentId, side, EquityOrderFlowSource.EQUITY_ORDER_WITH_SYMBOL_ACTIVITY, uuid, getAccountNumber(), completionUrl, null, false, false, WaitlistAnimationConstants.MIDDLE_YAW_FRAME, null), null, false, null, null, 60, null);
        }
    }

    /* compiled from: EquityOrderWithSymbolActivity.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/symbol/EquityOrderWithSymbolActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$EquityOrderWithSymbol;", "<init>", "()V", "EXTRA_INSTRUMENT_SYMBOL", "", "EXTRA_SIDE", "EXTRA_COMPLETION_URL", "EXTRA_ACCOUNT_NUMBER", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.EquityOrderWithSymbol> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.EquityOrderWithSymbol key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) EquityOrderWithSymbolActivity.class);
            intent.putExtra("symbol", key.getSymbol());
            intent.putExtra(EquityOrderWithSymbolActivity.EXTRA_SIDE, key.getSide());
            intent.putExtra(EquityOrderWithSymbolActivity.EXTRA_COMPLETION_URL, key.getCompletionUrl());
            intent.putExtra("accountNumber", key.getAccountNumber());
            return intent;
        }
    }
}
