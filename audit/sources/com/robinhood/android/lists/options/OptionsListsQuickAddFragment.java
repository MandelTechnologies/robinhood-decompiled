package com.robinhood.android.lists.options;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.HtmlCompat;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.lists.options.OptionsListsQuickAddEvent;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionsDetailPageFragmentKey;
import com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.p320db.Security;
import com.robinhood.rosetta.eventlogging.OptionStrategyContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.lists.quickadd.BaseListsQuickAddFragment;
import com.robinhood.shared.lists.quickadd.C39088R;
import com.robinhood.shared.lists.quickadd.extensions.OptionStrategySecurity;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: OptionsListsQuickAddFragment.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\"\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\"\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/lists/options/OptionsListsQuickAddFragment;", "Lcom/robinhood/shared/lists/quickadd/BaseListsQuickAddFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/lists/options/OptionsListsQuickAddDuxo;", "getDuxo", "()Lcom/robinhood/android/lists/options/OptionsListsQuickAddDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showOptionItemAddedSnackbar", "security", "Lcom/robinhood/models/db/Security;", "showOptionItemRemovedSnackbar", "addToOptionsWatchlist", "optionStrategySecurity", "Lcom/robinhood/shared/lists/quickadd/extensions/OptionStrategySecurity;", "screenForLoggingTap", "optionStrategyContext", "Lcom/robinhood/rosetta/eventlogging/OptionStrategyContext;", "removeFromOptionsWatchlist", "Args", "Companion", "lib-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class OptionsListsQuickAddFragment extends BaseListsQuickAddFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    public OptionsListsQuickAddFragment() {
        super(0);
        this.duxo = DuxosKt.duxo(this, OptionsListsQuickAddDuxo.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionsListsQuickAddDuxo getDuxo() {
        return (OptionsListsQuickAddDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.shared.lists.quickadd.BaseListsQuickAddFragment
    public Screen getEventScreen() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getScreen();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C208481(null));
    }

    /* compiled from: OptionsListsQuickAddFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lists.options.OptionsListsQuickAddFragment$onCreate$1", m3645f = "OptionsListsQuickAddFragment.kt", m3646l = {41}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lists.options.OptionsListsQuickAddFragment$onCreate$1 */
    static final class C208481 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C208481(Continuation<? super C208481> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsListsQuickAddFragment.this.new C208481(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C208481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(OptionsListsQuickAddFragment.this.getDuxo().getEventFlow());
                final OptionsListsQuickAddFragment optionsListsQuickAddFragment = OptionsListsQuickAddFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.lists.options.OptionsListsQuickAddFragment.onCreate.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<OptionsListsQuickAddEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<OptionsListsQuickAddEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<OptionsListsQuickAddEvent> eventConsumerInvoke;
                        EventConsumer<OptionsListsQuickAddEvent> eventConsumerInvoke2;
                        EventConsumer<OptionsListsQuickAddEvent> eventConsumerInvoke3;
                        EventConsumer<OptionsListsQuickAddEvent> eventConsumerInvoke4;
                        EventConsumer<OptionsListsQuickAddEvent> eventConsumerInvoke5;
                        EventConsumer<OptionsListsQuickAddEvent> eventConsumerInvoke6;
                        final OptionsListsQuickAddFragment optionsListsQuickAddFragment2 = optionsListsQuickAddFragment;
                        if ((event.getData() instanceof OptionsListsQuickAddEvent.Uploading.QuickAdd) && (eventConsumerInvoke6 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke6.consume(event, new Function1() { // from class: com.robinhood.android.lists.options.OptionsListsQuickAddFragment$onCreate$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m16076invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m16076invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    String string2 = optionsListsQuickAddFragment2.getString(C39088R.string.lists_adding_item, ((OptionsListsQuickAddEvent.Uploading.QuickAdd) event.getData()).getSecurity().getDisplaySymbol());
                                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                    optionsListsQuickAddFragment2.showLoadingSnackbar(string2);
                                }
                            });
                        }
                        final OptionsListsQuickAddFragment optionsListsQuickAddFragment3 = optionsListsQuickAddFragment;
                        if ((event.getData() instanceof OptionsListsQuickAddEvent.Uploading.Remove) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.android.lists.options.OptionsListsQuickAddFragment$onCreate$1$1$emit$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m16077invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m16077invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    String string2 = optionsListsQuickAddFragment3.getString(C39088R.string.lists_removing_item_from_list, ((OptionsListsQuickAddEvent.Uploading.Remove) event.getData()).getCuratedList().getDisplayName());
                                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                    optionsListsQuickAddFragment3.showLoadingSnackbar(string2);
                                }
                            });
                        }
                        final OptionsListsQuickAddFragment optionsListsQuickAddFragment4 = optionsListsQuickAddFragment;
                        if ((event.getData() instanceof OptionsListsQuickAddEvent.Uploaded.QuickAdd) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.lists.options.OptionsListsQuickAddFragment$onCreate$1$1$emit$$inlined$consumeIfType$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m16078invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m16078invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    optionsListsQuickAddFragment4.showOptionItemAddedSnackbar(((OptionsListsQuickAddEvent.Uploaded.QuickAdd) event.getData()).getSecurity());
                                }
                            });
                        }
                        final OptionsListsQuickAddFragment optionsListsQuickAddFragment5 = optionsListsQuickAddFragment;
                        if ((event.getData() instanceof OptionsListsQuickAddEvent.Uploaded.Remove) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.lists.options.OptionsListsQuickAddFragment$onCreate$1$1$emit$$inlined$consumeIfType$4
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m16079invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m16079invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    optionsListsQuickAddFragment5.showOptionItemRemovedSnackbar(((OptionsListsQuickAddEvent.Uploaded.Remove) event.getData()).getSecurity());
                                }
                            });
                        }
                        final OptionsListsQuickAddFragment optionsListsQuickAddFragment6 = optionsListsQuickAddFragment;
                        if ((event.getData() instanceof OptionsListsQuickAddEvent.Error) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.lists.options.OptionsListsQuickAddFragment$onCreate$1$1$emit$$inlined$consumeIfType$5
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m16080invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m16080invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    optionsListsQuickAddFragment6.showErrorSnackbar(((OptionsListsQuickAddEvent.Error) event.getData()).getThrowable());
                                }
                            });
                        }
                        final OptionsListsQuickAddFragment optionsListsQuickAddFragment7 = optionsListsQuickAddFragment;
                        if ((event.getData() instanceof OptionsListsQuickAddEvent.HideSnackbar) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.lists.options.OptionsListsQuickAddFragment$onCreate$1$1$emit$$inlined$consumeIfType$6
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m16081invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m16081invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    RdsSnackbar currentSnackbar = optionsListsQuickAddFragment7.getCurrentSnackbar();
                                    if (currentSnackbar != null) {
                                        currentSnackbar.dismiss();
                                    }
                                }
                            });
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOptionItemAddedSnackbar(final Security security) {
        String string2 = getString(C20849R.string.lists_option_item_added_to_watchlist, security.getDisplaySymbol());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        RdsSnackbar.setAction$default(ensureCurrentSnackbar().setMessage(HtmlCompat.fromHtml$default(string2, 0, 2, null)).showLoading(false).setLeadingIcon(ViewsKt.getDrawable(getContainer(), C20690R.drawable.ic_rds_checkmark_16dp)), getString(C20849R.string.lists_view_watchlist), true, (UserInteractionEventDescriptor) null, (AutoLoggingConfig) null, new Function0() { // from class: com.robinhood.android.lists.options.OptionsListsQuickAddFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsListsQuickAddFragment.showOptionItemAddedSnackbar$lambda$0(security, this);
            }
        }, 12, (Object) null).setLongDuration().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showOptionItemAddedSnackbar$lambda$0(Security security, OptionsListsQuickAddFragment optionsListsQuickAddFragment) {
        Intrinsics.checkNotNull(security, "null cannot be cast to non-null type com.robinhood.shared.lists.quickadd.extensions.OptionStrategySecurity");
        String strategyCode = ((OptionStrategySecurity) security).getStrategyCode();
        Navigator navigator = optionsListsQuickAddFragment.getNavigator();
        Context contextRequireContext = optionsListsQuickAddFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        optionsListsQuickAddFragment.requireContext().startActivity(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, new OptionsDetailPageFragmentKey(new OptionsDetailPageLaunchMode.StrategyCode(strategyCode, false, CollectionsKt.listOf(strategyCode), null, null, 26, null)), false, false, false, null, false, false, false, false, false, null, false, 8188, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOptionItemRemovedSnackbar(Security security) {
        String string2 = getString(C20849R.string.lists_option_item_removed_from_watchlist, security.getDisplaySymbol());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        ensureCurrentSnackbar().setMessage(HtmlCompat.fromHtml$default(string2, 0, 2, null)).showLoading(false).setLongDuration().show();
    }

    public static /* synthetic */ void addToOptionsWatchlist$default(OptionsListsQuickAddFragment optionsListsQuickAddFragment, OptionStrategySecurity optionStrategySecurity, Screen screen, OptionStrategyContext optionStrategyContext, int i, Object obj) {
        if ((i & 4) != 0) {
            optionStrategyContext = null;
        }
        optionsListsQuickAddFragment.addToOptionsWatchlist(optionStrategySecurity, screen, optionStrategyContext);
    }

    public final void addToOptionsWatchlist(OptionStrategySecurity optionStrategySecurity, Screen screenForLoggingTap, OptionStrategyContext optionStrategyContext) {
        Intrinsics.checkNotNullParameter(optionStrategySecurity, "optionStrategySecurity");
        Intrinsics.checkNotNullParameter(screenForLoggingTap, "screenForLoggingTap");
        getDuxo().addToOptionsList(optionStrategySecurity, screenForLoggingTap, optionStrategyContext);
    }

    public static /* synthetic */ void removeFromOptionsWatchlist$default(OptionsListsQuickAddFragment optionsListsQuickAddFragment, OptionStrategySecurity optionStrategySecurity, Screen screen, OptionStrategyContext optionStrategyContext, int i, Object obj) {
        if ((i & 4) != 0) {
            optionStrategyContext = null;
        }
        optionsListsQuickAddFragment.removeFromOptionsWatchlist(optionStrategySecurity, screen, optionStrategyContext);
    }

    public final void removeFromOptionsWatchlist(OptionStrategySecurity optionStrategySecurity, Screen screenForLoggingTap, OptionStrategyContext optionStrategyContext) {
        Intrinsics.checkNotNullParameter(optionStrategySecurity, "optionStrategySecurity");
        Intrinsics.checkNotNullParameter(screenForLoggingTap, "screenForLoggingTap");
        getDuxo().removeFromOptionsList(optionStrategySecurity, screenForLoggingTap, optionStrategyContext);
    }

    /* compiled from: OptionsListsQuickAddFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/lists/options/OptionsListsQuickAddFragment$Args;", "Landroid/os/Parcelable;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Screen;)V", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final Screen screen;

        /* compiled from: OptionsListsQuickAddFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((Screen) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, Screen screen, int i, Object obj) {
            if ((i & 1) != 0) {
                screen = args.screen;
            }
            return args.copy(screen);
        }

        /* renamed from: component1, reason: from getter */
        public final Screen getScreen() {
            return this.screen;
        }

        public final Args copy(Screen screen) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            return new Args(screen);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.screen, ((Args) other).screen);
        }

        public int hashCode() {
            return this.screen.hashCode();
        }

        public String toString() {
            return "Args(screen=" + this.screen + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screen);
        }

        public Args(Screen screen) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            this.screen = screen;
        }

        public final Screen getScreen() {
            return this.screen;
        }
    }

    /* compiled from: OptionsListsQuickAddFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lists/options/OptionsListsQuickAddFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/lists/options/OptionsListsQuickAddFragment;", "Lcom/robinhood/android/lists/options/OptionsListsQuickAddFragment$Args;", "<init>", "()V", "lib-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionsListsQuickAddFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionsListsQuickAddFragment optionsListsQuickAddFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionsListsQuickAddFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionsListsQuickAddFragment newInstance(Args args) {
            return (OptionsListsQuickAddFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionsListsQuickAddFragment optionsListsQuickAddFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionsListsQuickAddFragment, args);
        }
    }
}
