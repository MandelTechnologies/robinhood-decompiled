package com.robinhood.android.directdeposit.p101ui.switcher.atomic;

import android.util.Base64;
import android.webkit.JavascriptInterface;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.directdeposit.p101ui.switcher.atomic.TransactEvent;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import timber.log.Timber;

/* compiled from: AtomicTransactJavascriptBridge.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\nJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0006H\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\r0\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactJavascriptBridge;", "", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "base64Decoder", "Lkotlin/Function1;", "", "", "<init>", "(Lcom/robinhood/utils/moshi/LazyMoshi;Lkotlin/jvm/functions/Function1;)V", "(Lcom/robinhood/utils/moshi/LazyMoshi;)V", "transactEventAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent;", "transactEventRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "kotlin.jvm.PlatformType", "events", "Lio/reactivex/Observable;", "getEvents", "()Lio/reactivex/Observable;", "logEvents", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getLogEvents", "screenChanges", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getScreenChanges", "handleAction", "", WebsocketGatewayConstants.DATA_KEY, "TransactEventDeserializationException", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class AtomicTransactJavascriptBridge {
    public static final String JS_INTERFACE = "TransactEvents";
    private final Function1<String, byte[]> base64Decoder;
    private final Observable<TransactEvent> events;
    private final Observable<UserInteractionEventData> logEvents;
    private final Observable<Screen> screenChanges;
    private final JsonAdapter<TransactEvent> transactEventAdapter;
    private final BehaviorRelay<TransactEvent> transactEventRelay;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public AtomicTransactJavascriptBridge(LazyMoshi moshi, Function1<? super String, byte[]> base64Decoder) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(base64Decoder, "base64Decoder");
        this.base64Decoder = base64Decoder;
        Types types = Types.INSTANCE;
        this.transactEventAdapter = moshi.adapter(new TypeToken<TransactEvent>() { // from class: com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactJavascriptBridge$special$$inlined$getAdapter$1
        }.getType());
        BehaviorRelay<TransactEvent> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.transactEventRelay = behaviorRelayCreate;
        Observable<TransactEvent> observableHide = behaviorRelayCreate.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        Observable<TransactEvent> observableObserveOnMainThread = ObservablesAndroid.observeOnMainThread(observableHide);
        Observable<U> observableCast = observableObserveOnMainThread.filter(new Predicate() { // from class: com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactJavascriptBridge$special$$inlined$filterSubtype$1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(TransactEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it instanceof TransactEvent.Interaction;
            }
        }).cast(TransactEvent.Interaction.class);
        Intrinsics.checkNotNullExpressionValue(observableCast, "cast(...)");
        Observable<U> observableCast2 = observableObserveOnMainThread.filter(new Predicate() { // from class: com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactJavascriptBridge$special$$inlined$filterSubtype$2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(TransactEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it instanceof TransactEvent.Close;
            }
        }).cast(TransactEvent.Close.class);
        Intrinsics.checkNotNullExpressionValue(observableCast2, "cast(...)");
        Observable map = observableCast.map(new Function() { // from class: com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactJavascriptBridge$special$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Screen.Name screenName = ((TransactEvent.Interaction) it).getInteractionType().getScreenName();
                return Optional3.asOptional(screenName != null ? new Screen(screenName, null, null, null, 14, null) : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((AtomicTransactJavascriptBridge$special$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable<Screen> observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        this.events = observableObserveOnMainThread;
        Intrinsics.checkNotNull(observableDistinctUntilChanged);
        this.screenChanges = observableDistinctUntilChanged;
        Observable map2 = observableCast.map(new Function() { // from class: com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactJavascriptBridge$special$$inlined$mapNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(TransactEventLogging.toUserInteractionEventData((TransactEvent.Interaction) it));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((AtomicTransactJavascriptBridge$special$$inlined$mapNotNull$2<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable<UserInteractionEventData> observableMerge = Observable.merge(ObservablesKt.filterIsPresent(map2), io.reactivex.rxkotlin.ObservablesKt.withLatestFrom(observableCast2, observableDistinctUntilChanged).map(new Function() { // from class: com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactJavascriptBridge$closeLogEvents$1
            @Override // io.reactivex.functions.Function
            public final UserInteractionEventData apply(Tuples2<TransactEvent.Close, Screen> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                TransactEvent.Close closeComponent1 = tuples2.component1();
                Screen screenComponent2 = tuples2.component2();
                Intrinsics.checkNotNull(screenComponent2);
                return TransactEventLogging.toUserInteractionEventData(closeComponent1, screenComponent2);
            }
        }));
        Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(...)");
        this.logEvents = observableMerge;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AtomicTransactJavascriptBridge(LazyMoshi moshi) {
        this(moshi, new Function1() { // from class: com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactJavascriptBridge$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AtomicTransactJavascriptBridge._init_$lambda$0((String) obj);
            }
        });
        Intrinsics.checkNotNullParameter(moshi, "moshi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] _init_$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        byte[] bArrDecode = Base64.decode(it, 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        return bArrDecode;
    }

    public final Observable<TransactEvent> getEvents() {
        return this.events;
    }

    public final Observable<UserInteractionEventData> getLogEvents() {
        return this.logEvents;
    }

    public final Observable<Screen> getScreenChanges() {
        return this.screenChanges;
    }

    @JavascriptInterface
    public final void handleAction(String data) throws Exception {
        TransactEvent transactEventFromJson;
        Intrinsics.checkNotNullParameter(data, "data");
        String str = new String(this.base64Decoder.invoke(data), Charsets.UTF_8);
        Timber.INSTANCE.mo3356i("handleAction: " + str, new Object[0]);
        try {
            transactEventFromJson = this.transactEventAdapter.fromJson(str);
        } catch (Exception e) {
            if ((e instanceof IOException) || (e instanceof JsonDataException)) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new TransactEventDeserializationException(str, e), false, null, 6, null);
                transactEventFromJson = null;
            } else {
                throw e;
            }
        }
        if (transactEventFromJson != null) {
            this.transactEventRelay.accept(transactEventFromJson);
        }
    }

    /* compiled from: AtomicTransactJavascriptBridge.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactJavascriptBridge$TransactEventDeserializationException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "eventJson", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TransactEventDeserializationException extends RuntimeException {
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactEventDeserializationException(String eventJson, Throwable cause) {
            super("Unable to deserialize Transact event: " + eventJson, cause);
            Intrinsics.checkNotNullParameter(eventJson, "eventJson");
            Intrinsics.checkNotNullParameter(cause, "cause");
        }
    }
}
