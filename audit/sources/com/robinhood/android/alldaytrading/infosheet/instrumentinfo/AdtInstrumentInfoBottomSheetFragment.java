package com.robinhood.android.alldaytrading.infosheet.instrumentinfo;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.equities.contracts.AdtInstrumentInfoKey;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.navigation.DialogFragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdtInstrumentInfoBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\r\u0010\u0019\u001a\u00020\u0016H\u0017¢\u0006\u0002\u0010\u001aR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/alldaytrading/infosheet/instrumentinfo/AdtInstrumentInfoBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "duxo", "Lcom/robinhood/android/alldaytrading/infosheet/instrumentinfo/AdtInstrumentInfoDuxo;", "getDuxo", "()Lcom/robinhood/android/alldaytrading/infosheet/instrumentinfo/AdtInstrumentInfoDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onAttach", "", "context", "Landroid/content/Context;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Args", "Companion", "feature-all-day-trading_externalDebug", "viewState", "Lcom/robinhood/android/alldaytrading/infosheet/instrumentinfo/AdtInstrumentInfoViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AdtInstrumentInfoBottomSheetFragment extends GenericComposeBottomSheetDialogFragment {
    private static final String ADT_INFO_SHEET_ID = "adt-instrument-info";
    public EventLogger eventLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final Component component = new Component(Component.ComponentType.BOTTOM_SHEET, ADT_INFO_SHEET_ID, null, 4, null);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, AdtInstrumentInfoDuxo.class);
    private final SduiActionHandler<GenericAction> actionHandler = new SduiActionHandler() { // from class: com.robinhood.android.alldaytrading.infosheet.instrumentinfo.AdtInstrumentInfoBottomSheetFragment$actionHandler$1
        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
        /* renamed from: handle, reason: merged with bridge method [inline-methods] */
        public final boolean mo15941handle(GenericAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (action instanceof GenericAction.Dismiss) {
                this.this$0.dismiss();
                return true;
            }
            if (!(action instanceof GenericAction.Deeplink)) {
                return false;
            }
            Navigator navigator = this.this$0.getNavigator();
            Context contextRequireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            return Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(AdtInstrumentInfoBottomSheetFragment adtInstrumentInfoBottomSheetFragment, int i, Composer composer, int i2) {
        adtInstrumentInfoBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    private final AdtInstrumentInfoDuxo getDuxo() {
        return (AdtInstrumentInfoDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
        EventLogger eventLogger = getEventLogger();
        Companion companion = INSTANCE;
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, ((Args) companion.getArgs((Fragment) this)).getScreen(), this.component, null, ((Args) companion.getArgs((Fragment) this)).getContext(), 9, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1898560545);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1898560545, i2, -1, "com.robinhood.android.alldaytrading.infosheet.instrumentinfo.AdtInstrumentInfoBottomSheetFragment.ComposeContent (AdtInstrumentInfoBottomSheetFragment.kt:73)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            Companion companion = INSTANCE;
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, ((Args) companion.getArgs((Fragment) this)).getScreen(), null, ((Args) companion.getArgs((Fragment) this)).getContext(), this.component, null, 37, null), ComposableLambda3.rememberComposableLambda(-1861361204, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.alldaytrading.infosheet.instrumentinfo.AdtInstrumentInfoBottomSheetFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1861361204, i3, -1, "com.robinhood.android.alldaytrading.infosheet.instrumentinfo.AdtInstrumentInfoBottomSheetFragment.ComposeContent.<anonymous> (AdtInstrumentInfoBottomSheetFragment.kt:82)");
                    }
                    final AdtInstrumentInfoBottomSheetFragment adtInstrumentInfoBottomSheetFragment = AdtInstrumentInfoBottomSheetFragment.this;
                    final SnapshotState4<AdtInstrumentInfoViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1696788897, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.alldaytrading.infosheet.instrumentinfo.AdtInstrumentInfoBottomSheetFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1696788897, i4, -1, "com.robinhood.android.alldaytrading.infosheet.instrumentinfo.AdtInstrumentInfoBottomSheetFragment.ComposeContent.<anonymous>.<anonymous> (AdtInstrumentInfoBottomSheetFragment.kt:83)");
                            }
                            AdtInstrumentInfoContents.InstrumentInfoContents(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), AdtInstrumentInfoBottomSheetFragment.ComposeContent$lambda$1(snapshotState4), adtInstrumentInfoBottomSheetFragment.actionHandler, composer3, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.alldaytrading.infosheet.instrumentinfo.AdtInstrumentInfoBottomSheetFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdtInstrumentInfoBottomSheetFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdtInstrumentInfoViewState ComposeContent$lambda$1(SnapshotState4<AdtInstrumentInfoViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: AdtInstrumentInfoBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/alldaytrading/infosheet/instrumentinfo/AdtInstrumentInfoBottomSheetFragment$Args;", "Landroid/os/Parcelable;", "instrumentId", "Ljava/util/UUID;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "context", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;)V", "getInstrumentId", "()Ljava/util/UUID;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-all-day-trading_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final com.robinhood.rosetta.eventlogging.Context context;
        private final UUID instrumentId;
        private final Screen screen;

        /* compiled from: AdtInstrumentInfoBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable(), (Screen) parcel.readSerializable(), (com.robinhood.rosetta.eventlogging.Context) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
            dest.writeSerializable(this.screen);
            dest.writeSerializable(this.context);
        }

        public Args(UUID instrumentId, Screen screen, com.robinhood.rosetta.eventlogging.Context context) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(screen, "screen");
            Intrinsics.checkNotNullParameter(context, "context");
            this.instrumentId = instrumentId;
            this.screen = screen;
            this.context = context;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final Screen getScreen() {
            return this.screen;
        }

        public final com.robinhood.rosetta.eventlogging.Context getContext() {
            return this.context;
        }
    }

    /* compiled from: AdtInstrumentInfoBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/alldaytrading/infosheet/instrumentinfo/AdtInstrumentInfoBottomSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolver;", "Lcom/robinhood/android/equities/contracts/AdtInstrumentInfoKey;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/alldaytrading/infosheet/instrumentinfo/AdtInstrumentInfoBottomSheetFragment;", "Lcom/robinhood/android/alldaytrading/infosheet/instrumentinfo/AdtInstrumentInfoBottomSheetFragment$Args;", "<init>", "()V", "ADT_INFO_SHEET_ID", "", "createDialogFragment", "key", "feature-all-day-trading_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolver<AdtInstrumentInfoKey>, FragmentWithArgsCompanion<AdtInstrumentInfoBottomSheetFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AdtInstrumentInfoBottomSheetFragment adtInstrumentInfoBottomSheetFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, adtInstrumentInfoBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AdtInstrumentInfoBottomSheetFragment newInstance(Args args) {
            return (AdtInstrumentInfoBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AdtInstrumentInfoBottomSheetFragment adtInstrumentInfoBottomSheetFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, adtInstrumentInfoBottomSheetFragment, args);
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolver
        public AdtInstrumentInfoBottomSheetFragment createDialogFragment(AdtInstrumentInfoKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (AdtInstrumentInfoBottomSheetFragment) newInstance((Parcelable) new Args(key.getInstrumentId(), key.getScreen(), key.getContext()));
        }
    }
}
