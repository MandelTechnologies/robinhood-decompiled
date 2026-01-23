package com.robinhood.android.lists.options;

import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.lists.options.OptionsListsQuickAddEvent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.OptionsWatchlistStore;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.List;
import com.robinhood.rosetta.eventlogging.ListsContext;
import com.robinhood.rosetta.eventlogging.OptionStrategyContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.lists.quickadd.extensions.OptionStrategySecurity;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: OptionsListsQuickAddDuxo.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J \u0010\u0015\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J*\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/lists/options/OptionsListsQuickAddDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/lists/options/OptionsListsQuickAddViewState;", "Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "optionsWatchlistStore", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStop", "", "addToOptionsList", "security", "Lcom/robinhood/shared/lists/quickadd/extensions/OptionStrategySecurity;", "screenForLoggingTap", "Lcom/robinhood/rosetta/eventlogging/Screen;", "optionStrategyContext", "Lcom/robinhood/rosetta/eventlogging/OptionStrategyContext;", "removeFromOptionsList", "logTap", "screen", "optionsWatchlist", "Lcom/robinhood/models/db/CuratedList;", "listsContext", "Lcom/robinhood/rosetta/eventlogging/ListsContext;", "Companion", "lib-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class OptionsListsQuickAddDuxo extends BaseDuxo5<OptionsListsQuickAddViewState, OptionsListsQuickAddEvent> {
    private static final long MIN_LOADING_TIME_IN_MILLIS = 300;
    private static final String UPDATE_LIST_ITEMS_BUTTON_ID = "options_watchlist_add_remove";
    private final EventLogger eventLogger;
    private final OptionsWatchlistStore optionsWatchlistStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsListsQuickAddDuxo(EventLogger eventLogger, OptionsWatchlistStore optionsWatchlistStore, DuxoBundle duxoBundle) {
        super(OptionsListsQuickAddViewState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(optionsWatchlistStore, "optionsWatchlistStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.eventLogger = eventLogger;
        this.optionsWatchlistStore = optionsWatchlistStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStop() {
        super.onStop();
        submit(OptionsListsQuickAddEvent.HideSnackbar.INSTANCE);
    }

    public final void addToOptionsList(OptionStrategySecurity security, Screen screenForLoggingTap, OptionStrategyContext optionStrategyContext) {
        Intrinsics.checkNotNullParameter(security, "security");
        Intrinsics.checkNotNullParameter(screenForLoggingTap, "screenForLoggingTap");
        submit(new OptionsListsQuickAddEvent.Uploading.QuickAdd(security));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C208401(security, screenForLoggingTap, optionStrategyContext, null), 3, null);
    }

    /* compiled from: OptionsListsQuickAddDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lists.options.OptionsListsQuickAddDuxo$addToOptionsList$1", m3645f = "OptionsListsQuickAddDuxo.kt", m3646l = {54, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.lists.options.OptionsListsQuickAddDuxo$addToOptionsList$1 */
    static final class C208401 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OptionStrategyContext $optionStrategyContext;
        final /* synthetic */ Screen $screenForLoggingTap;
        final /* synthetic */ OptionStrategySecurity $security;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C208401(OptionStrategySecurity optionStrategySecurity, Screen screen, OptionStrategyContext optionStrategyContext, Continuation<? super C208401> continuation) {
            super(2, continuation);
            this.$security = optionStrategySecurity;
            this.$screenForLoggingTap = screen;
            this.$optionStrategyContext = optionStrategyContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsListsQuickAddDuxo.this.new C208401(this.$security, this.$screenForLoggingTap, this.$optionStrategyContext, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C208401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        
            if (r2 == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objAwait;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                if (Throwables.isNetworkRelated(th)) {
                    OptionsListsQuickAddDuxo.this.submit(new OptionsListsQuickAddEvent.Error(th));
                } else {
                    throw th;
                }
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(300L, this) == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objAwait = obj;
                CuratedList curatedList = (CuratedList) objAwait;
                OptionsListsQuickAddDuxo optionsListsQuickAddDuxo = OptionsListsQuickAddDuxo.this;
                Screen screen = this.$screenForLoggingTap;
                Intrinsics.checkNotNull(curatedList);
                optionsListsQuickAddDuxo.logTap(screen, curatedList, new ListsContext(ListsContext.AddToListFlow.INSTANT, null, 1, 0, this.$security.getStrategyCode(), null, 0, false, 0, 0, null, null, 4066, null), this.$optionStrategyContext);
                OptionsListsQuickAddDuxo.this.submit(new OptionsListsQuickAddEvent.Uploaded.QuickAdd(this.$security));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            Single<CuratedList> singleAddItem = OptionsListsQuickAddDuxo.this.optionsWatchlistStore.addItem(this.$security.getQuickAddRequest());
            this.label = 2;
            objAwait = RxAwait3.await(singleAddItem, this);
        }
    }

    /* compiled from: OptionsListsQuickAddDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lists.options.OptionsListsQuickAddDuxo$removeFromOptionsList$1", m3645f = "OptionsListsQuickAddDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, 97, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.lists.options.OptionsListsQuickAddDuxo$removeFromOptionsList$1 */
    static final class C208411 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OptionStrategyContext $optionStrategyContext;
        final /* synthetic */ Screen $screenForLoggingTap;
        final /* synthetic */ OptionStrategySecurity $security;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C208411(OptionStrategySecurity optionStrategySecurity, Screen screen, OptionStrategyContext optionStrategyContext, Continuation<? super C208411> continuation) {
            super(2, continuation);
            this.$security = optionStrategySecurity;
            this.$screenForLoggingTap = screen;
            this.$optionStrategyContext = optionStrategyContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsListsQuickAddDuxo.this.new C208411(this.$security, this.$screenForLoggingTap, this.$optionStrategyContext, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C208411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objAwaitFirst;
            CuratedList curatedList;
            Completable completableRemoveItem;
            CuratedList curatedList2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                if (Throwables.isNetworkRelated(th)) {
                    OptionsListsQuickAddDuxo.this.submit(new OptionsListsQuickAddEvent.Error(th));
                } else {
                    throw th;
                }
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable<Optional<CuratedList>> observableStreamList = OptionsListsQuickAddDuxo.this.optionsWatchlistStore.streamList();
                this.label = 1;
                objAwaitFirst = RxAwait3.awaitFirst(observableStreamList, this);
                if (objAwaitFirst == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    curatedList2 = (CuratedList) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    OptionsListsQuickAddDuxo.this.logTap(this.$screenForLoggingTap, curatedList2, new ListsContext(ListsContext.AddToListFlow.INSTANT, null, 0, 1, null, this.$security.getStrategyCode(), 0, false, 0, 0, null, null, 4050, null), this.$optionStrategyContext);
                    OptionsListsQuickAddDuxo.this.submit(new OptionsListsQuickAddEvent.Uploaded.Remove(this.$security));
                    return Unit.INSTANCE;
                }
                curatedList = (CuratedList) this.L$0;
                ResultKt.throwOnFailure(obj);
                completableRemoveItem = OptionsListsQuickAddDuxo.this.optionsWatchlistStore.removeItem(this.$security.getStrategyCode(), curatedList.getId());
                this.L$0 = curatedList;
                this.label = 3;
                if (RxAwait3.await(completableRemoveItem, this) != coroutine_suspended) {
                    curatedList2 = curatedList;
                    OptionsListsQuickAddDuxo.this.logTap(this.$screenForLoggingTap, curatedList2, new ListsContext(ListsContext.AddToListFlow.INSTANT, null, 0, 1, null, this.$security.getStrategyCode(), 0, false, 0, 0, null, null, 4050, null), this.$optionStrategyContext);
                    OptionsListsQuickAddDuxo.this.submit(new OptionsListsQuickAddEvent.Uploaded.Remove(this.$security));
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            ResultKt.throwOnFailure(obj);
            objAwaitFirst = obj;
            curatedList = (CuratedList) ((Optional) objAwaitFirst).getOrNull();
            if (curatedList == null) {
                OptionsListsQuickAddDuxo.this.submit(new OptionsListsQuickAddEvent.Error(null, 1, null));
                return Unit.INSTANCE;
            }
            OptionsListsQuickAddDuxo.this.submit(new OptionsListsQuickAddEvent.Uploading.Remove(this.$security, curatedList));
            this.L$0 = curatedList;
            this.label = 2;
            if (DelayKt.delay(300L, this) != coroutine_suspended) {
                completableRemoveItem = OptionsListsQuickAddDuxo.this.optionsWatchlistStore.removeItem(this.$security.getStrategyCode(), curatedList.getId());
                this.L$0 = curatedList;
                this.label = 3;
                if (RxAwait3.await(completableRemoveItem, this) != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
    }

    public final void removeFromOptionsList(OptionStrategySecurity security, Screen screenForLoggingTap, OptionStrategyContext optionStrategyContext) {
        Intrinsics.checkNotNullParameter(security, "security");
        Intrinsics.checkNotNullParameter(screenForLoggingTap, "screenForLoggingTap");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C208411(security, screenForLoggingTap, optionStrategyContext, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logTap(Screen screen, CuratedList optionsWatchlist, ListsContext listsContext, OptionStrategyContext optionStrategyContext) {
        EventLogger eventLogger = this.eventLogger;
        UserInteractionEventData.Action action = UserInteractionEventData.Action.UPDATE_LIST_ITEMS;
        Component component = new Component(Component.ComponentType.BUTTON, UPDATE_LIST_ITEMS_BUTTON_ID, null, 4, null);
        String string2 = optionsWatchlist.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component, null, new Context(i, i2, i3, str, null, null, null, null, 0, null, null, null, null, null, null, new List(string2, optionsWatchlist.getDisplayName(), List.OwnerType.CUSTOM, null, 8, null), null, null, null, null, listsContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, optionStrategyContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1081345, -8388609, -1, -1, -1, -1, 16383, null), false, 40, null);
    }
}
