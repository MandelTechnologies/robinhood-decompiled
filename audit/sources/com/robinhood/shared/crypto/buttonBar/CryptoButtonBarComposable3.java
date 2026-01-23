package com.robinhood.shared.crypto.buttonBar;

import android.content.Context;
import android.net.Uri;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.buttonBar.CryptoButtonBarArgs;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoButtonBarComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarComposableKt$CryptoButtonBarComposable$1$3$onCustomButtonClick$1$1$1", m3645f = "CryptoButtonBarComposable.kt", m3646l = {103}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarComposableKt$CryptoButtonBarComposable$1$3$onCustomButtonClick$1$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoButtonBarComposable3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GenericAction $action;
    final /* synthetic */ CryptoButtonBarArgs $args;
    final /* synthetic */ String $buttonIdentifier;
    final /* synthetic */ Context $context;
    final /* synthetic */ CryptoButtonBarDuxo $duxo;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ String $loadingIdentifier;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ Function0<Unit> $onCollapse;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoButtonBarComposable3(String str, CryptoButtonBarArgs cryptoButtonBarArgs, EventLogger eventLogger, CryptoButtonBarDuxo cryptoButtonBarDuxo, String str2, Navigator navigator, Context context, GenericAction genericAction, Function0<Unit> function0, Continuation<? super CryptoButtonBarComposable3> continuation) {
        super(2, continuation);
        this.$buttonIdentifier = str;
        this.$args = cryptoButtonBarArgs;
        this.$eventLogger = eventLogger;
        this.$duxo = cryptoButtonBarDuxo;
        this.$loadingIdentifier = str2;
        this.$navigator = navigator;
        this.$context = context;
        this.$action = genericAction;
        this.$onCollapse = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoButtonBarComposable3(this.$buttonIdentifier, this.$args, this.$eventLogger, this.$duxo, this.$loadingIdentifier, this.$navigator, this.$context, this.$action, this.$onCollapse, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoButtonBarComposable3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        CryptoButtonBarComposable3 cryptoButtonBarComposable3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(this.$buttonIdentifier, CryptoButtonIdentifiers.OPEN_BITSTAMP) && (this.$args instanceof CryptoButtonBarArgs.Crypto)) {
                EventLogger eventLogger = this.$eventLogger;
                Screen.Name name = Screen.Name.CRYPTO_DETAIL_PAGE;
                String string2 = ((CryptoButtonBarArgs.Crypto) this.$args).getCurrencyPairId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(name, null, string2, null, 10, null), new Component(Component.ComponentType.BUTTON, CryptoButtonIdentifiers.OPEN_BITSTAMP, null, 4, null), null, null, false, 57, null);
            }
            this.$duxo.updateLoading$lib_crypto_button_bar_externalDebug(this.$loadingIdentifier, true);
            Navigator navigator = this.$navigator;
            Context context = this.$context;
            Uri uri = ((GenericAction.DeeplinkAction) this.$action).getUri();
            NavigationType navigationType = NavigationType.PRESENT;
            this.label = 1;
            cryptoButtonBarComposable3 = this;
            if (Navigator.DefaultImpls.handleDeepLinkDirect$default(navigator, context, uri, false, false, navigationType, cryptoButtonBarComposable3, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            cryptoButtonBarComposable3 = this;
        }
        cryptoButtonBarComposable3.$duxo.updateLoading$lib_crypto_button_bar_externalDebug(cryptoButtonBarComposable3.$loadingIdentifier, false);
        cryptoButtonBarComposable3.$onCollapse.invoke();
        return Unit.INSTANCE;
    }
}
