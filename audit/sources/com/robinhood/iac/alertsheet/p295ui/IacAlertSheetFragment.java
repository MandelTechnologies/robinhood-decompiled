package com.robinhood.iac.alertsheet.p295ui;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.google.android.material.R$attr;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.style.DesignSystemOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.creditcard.CreditCardOverlay;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RemoteImageRenderer;
import com.robinhood.android.navigation.DialogFragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.iac.alertsheet.AlertSheetExtensions;
import com.robinhood.iac.alertsheet.p295ui.IacAlertSheetViewState;
import com.robinhood.models.p355ui.IacAlertSheet;
import com.robinhood.models.serverdriven.experimental.api.AspectFillRemoteImage;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.shared.compose.color.LinearGradientColor;
import com.robinhood.shared.iac.alertsheet.C39038R;
import com.robinhood.shared.iac.alertsheet.databinding.FragmentIacAlertSheetBinding;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.UUID;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: IacAlertSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 T2\u00020\u0001:\u0001TB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00052\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J)\u00101\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b1\u00102R\"\u00104\u001a\u0002038\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001b\u0010E\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010<\u001a\u0004\bN\u0010OR\u001b\u0010R\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010<\u001a\u0004\bR\u0010S¨\u0006U"}, m3636d2 = {"Lcom/robinhood/iac/alertsheet/ui/IacAlertSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "Lkotlin/Function0;", "", "content", "BackgroundBentoTheme", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/iac/alertsheet/ui/IacAlertSheetViewState;", "state", "refreshUi", "(Lcom/robinhood/iac/alertsheet/ui/IacAlertSheetViewState;)V", "Lcom/robinhood/models/ui/IacAlertSheet;", "iacAlertSheet", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "action", "", "buttonLoggingIdentifier", "buttonTitle", "onAction", "(Lcom/robinhood/models/ui/IacAlertSheet;Lcom/robinhood/models/serverdriven/db/GenericAction;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onCreate", "(Landroid/os/Bundle;)V", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", WebsocketGatewayConstants.DATA_KEY, "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "Lcom/robinhood/iac/alertsheet/ui/IacAlertSheetDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "getDuxo", "()Lcom/robinhood/iac/alertsheet/ui/IacAlertSheetDuxo;", "duxo", "Lcom/robinhood/shared/iac/alertsheet/databinding/FragmentIacAlertSheetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBinding", "()Lcom/robinhood/shared/iac/alertsheet/databinding/FragmentIacAlertSheetBinding;", "binding", "Ljava/util/UUID;", "iacAlertSheetId", "Ljava/util/UUID;", "", "shouldPostItemDismissedPassive", "Z", "Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreenName$delegate", "getEventScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreenName", "isCreditCardThemed$delegate", "isCreditCardThemed", "()Z", "Companion", "lib-iac-alert-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class IacAlertSheetFragment extends BaseBottomSheetDialogFragment {
    private static final int REQUEST_GOLD_DOWNGRADE = 1;
    public EventLogger eventLogger;
    private UUID iacAlertSheetId;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(IacAlertSheetFragment.class, "binding", "getBinding()Lcom/robinhood/shared/iac/alertsheet/databinding/FragmentIacAlertSheetBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, IacAlertSheetDuxo.class);

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding = ViewBinding5.viewBinding(this, IacAlertSheetFragment2.INSTANCE);
    private boolean shouldPostItemDismissedPassive = true;

    /* renamed from: eventScreenName$delegate, reason: from kotlin metadata */
    private final Lazy eventScreenName = LazyKt.lazy(new Function0() { // from class: com.robinhood.iac.alertsheet.ui.IacAlertSheetFragment$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IacAlertSheetFragment.eventScreenName_delegate$lambda$0(this.f$0);
        }
    });

    /* renamed from: isCreditCardThemed$delegate, reason: from kotlin metadata */
    private final Lazy isCreditCardThemed = LazyKt.lazy(new Function0() { // from class: com.robinhood.iac.alertsheet.ui.IacAlertSheetFragment$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(IacAlertSheetFragment.isCreditCardThemed_delegate$lambda$1(this.f$0));
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BackgroundBentoTheme$lambda$3(IacAlertSheetFragment iacAlertSheetFragment, Function2 function2, int i, Composer composer, int i2) {
        iacAlertSheetFragment.BackgroundBentoTheme(function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    /* JADX INFO: Access modifiers changed from: private */
    public final IacAlertSheetDuxo getDuxo() {
        return (IacAlertSheetDuxo) this.duxo.getValue();
    }

    private final FragmentIacAlertSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentIacAlertSheetBinding) value;
    }

    private final Screen getEventScreenName() {
        return (Screen) this.eventScreenName.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen eventScreenName_delegate$lambda$0(IacAlertSheetFragment iacAlertSheetFragment) {
        Screen.Name.Companion companion = Screen.Name.INSTANCE;
        Companion companion2 = INSTANCE;
        Screen.Name nameFromValue = companion.fromValue(((LegacyDialogFragmentKey.IacAlertSheet) companion2.getArgs((Fragment) iacAlertSheetFragment)).getEventScreenId());
        if (nameFromValue == null) {
            nameFromValue = Screen.Name.NAME_UNSPECIFIED;
        }
        String eventScreenIdentifier = ((LegacyDialogFragmentKey.IacAlertSheet) companion2.getArgs((Fragment) iacAlertSheetFragment)).getEventScreenIdentifier();
        if (eventScreenIdentifier == null) {
            eventScreenIdentifier = "";
        }
        return new Screen(nameFromValue, null, eventScreenIdentifier, null, 10, null);
    }

    private final boolean isCreditCardThemed() {
        return ((Boolean) this.isCreditCardThemed.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isCreditCardThemed_delegate$lambda$1(IacAlertSheetFragment iacAlertSheetFragment) {
        String loggingIdentifier = ((LegacyDialogFragmentKey.IacAlertSheet) INSTANCE.getArgs((Fragment) iacAlertSheetFragment)).getLoggingIdentifier();
        if (loggingIdentifier != null) {
            return StringsKt.startsWith$default(loggingIdentifier, "CreditCardGold", false, 2, (Object) null);
        }
        return false;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        if (isCreditCardThemed()) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), DesignSystemOverlay.INSTANCE, null, 2, null);
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), CreditCardOverlay.INSTANCE, null, 2, null);
        } else {
            putDesignSystemOverlay(scarletContextWrapper);
        }
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C39038R.layout.fragment_iac_alert_sheet, container, true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventLogger eventLogger = getEventLogger();
        Screen eventScreenName = getEventScreenName();
        Component.ComponentType componentType = Component.ComponentType.ALERT_SHEET;
        Companion companion = INSTANCE;
        String loggingIdentifier = ((LegacyDialogFragmentKey.IacAlertSheet) companion.getArgs((Fragment) this)).getLoggingIdentifier();
        if (loggingIdentifier == null) {
            loggingIdentifier = "";
        }
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, eventScreenName, new Component(componentType, loggingIdentifier, null, 4, null), null, AlertSheetExtensions.eventContext(((LegacyDialogFragmentKey.IacAlertSheet) companion.getArgs((Fragment) this)).getIacBottomSheet(), ((LegacyDialogFragmentKey.IacAlertSheet) companion.getArgs((Fragment) this)).getProductTag()), 9, null);
    }

    /* compiled from: IacAlertSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.iac.alertsheet.ui.IacAlertSheetFragment$onViewCreated$1", m3645f = "IacAlertSheetFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.iac.alertsheet.ui.IacAlertSheetFragment$onViewCreated$1 */
    static final class C333441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C333441(Continuation<? super C333441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C333441 c333441 = IacAlertSheetFragment.this.new C333441(continuation);
            c333441.L$0 = obj;
            return c333441;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C333441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: IacAlertSheetFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.iac.alertsheet.ui.IacAlertSheetFragment$onViewCreated$1$1", m3645f = "IacAlertSheetFragment.kt", m3646l = {117}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.iac.alertsheet.ui.IacAlertSheetFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ IacAlertSheetFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IacAlertSheetFragment iacAlertSheetFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = iacAlertSheetFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getStateFlow());
                    C506561 c506561 = new C506561(this.this$0);
                    this.label = 1;
                    if (flowFilterNotNull.collect(c506561, this) == coroutine_suspended) {
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

            /* compiled from: IacAlertSheetFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.iac.alertsheet.ui.IacAlertSheetFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C506561 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ IacAlertSheetFragment $tmp0;

                C506561(IacAlertSheetFragment iacAlertSheetFragment) {
                    this.$tmp0 = iacAlertSheetFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, IacAlertSheetFragment.class, "refreshUi", "refreshUi(Lcom/robinhood/iac/alertsheet/ui/IacAlertSheetViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(IacAlertSheetViewState iacAlertSheetViewState, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$refreshUi = AnonymousClass1.invokeSuspend$refreshUi(this.$tmp0, iacAlertSheetViewState, continuation);
                    return objInvokeSuspend$refreshUi == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$refreshUi : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((IacAlertSheetViewState) obj, (Continuation<? super Unit>) continuation);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$refreshUi(IacAlertSheetFragment iacAlertSheetFragment, IacAlertSheetViewState iacAlertSheetViewState, Continuation continuation) {
                iacAlertSheetFragment.refreshUi(iacAlertSheetViewState);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(IacAlertSheetFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseDialogFragment.collectDuxoState$default(this, null, new C333441(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void BackgroundBentoTheme(final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-189320873);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-189320873, i2, -1, "com.robinhood.iac.alertsheet.ui.IacAlertSheetFragment.BackgroundBentoTheme (IacAlertSheetFragment.kt:122)");
            }
            if (isCreditCardThemed()) {
                composerStartRestartGroup.startReplaceGroup(-765942994);
                BentoTheme2.BentoTheme(Boolean.FALSE, null, Boolean.TRUE, null, null, null, null, null, function2, composerStartRestartGroup, ((i2 << 24) & 234881024) | 390, 250);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-765846026);
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, function2, composerStartRestartGroup, (i2 << 24) & 234881024, 255);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.iac.alertsheet.ui.IacAlertSheetFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IacAlertSheetFragment.BackgroundBentoTheme$lambda$3(this.f$0, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshUi(final IacAlertSheetViewState state) {
        this.iacAlertSheetId = state.getIacAlertSheet().getId();
        getDuxo().postItemSeen(state.getIacAlertSheet().getId());
        setCancelable(state.getIacAlertSheet().getCanPassivelyDismiss());
        getBinding().gradientBackground.setContent(ComposableLambda3.composableLambdaInstance(-1378858088, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.iac.alertsheet.ui.IacAlertSheetFragment.refreshUi.1
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
                    ComposerKt.traceEventStart(-1378858088, i, -1, "com.robinhood.iac.alertsheet.ui.IacAlertSheetFragment.refreshUi.<anonymous> (IacAlertSheetFragment.kt:136)");
                }
                final IacAlertSheetFragment iacAlertSheetFragment = IacAlertSheetFragment.this;
                final IacAlertSheetViewState iacAlertSheetViewState = state;
                iacAlertSheetFragment.BackgroundBentoTheme(ComposableLambda3.rememberComposableLambda(-808388842, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.iac.alertsheet.ui.IacAlertSheetFragment.refreshUi.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) throws Resources.NotFoundException {
                        Brush brush$default;
                        int themeColor;
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-808388842, i2, -1, "com.robinhood.iac.alertsheet.ui.IacAlertSheetFragment.refreshUi.<anonymous>.<anonymous> (IacAlertSheetFragment.kt:137)");
                        }
                        IacAlertSheetViewState.BackgroundColor backgroundColor = iacAlertSheetViewState.getBackgroundColor();
                        composer2.startReplaceGroup(527405350);
                        if (backgroundColor instanceof IacAlertSheetViewState.BackgroundColor.Solid) {
                            ResourceReferences4<Integer> colorResourceRef = ((IacAlertSheetViewState.BackgroundColor.Solid) backgroundColor).getColorResourceRef();
                            Resources.Theme theme = iacAlertSheetFragment.requireContext().getTheme();
                            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                            Integer numResolve = colorResourceRef.resolve(theme);
                            if (numResolve != null) {
                                themeColor = numResolve.intValue();
                            } else {
                                Context contextRequireContext = iacAlertSheetFragment.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                themeColor = ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorBackground1);
                            }
                            brush$default = new SolidColor(Color2.Color(themeColor), null);
                        } else {
                            if (!(backgroundColor instanceof IacAlertSheetViewState.BackgroundColor.Gradient)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            brush$default = LinearGradientColor.getBrush$default(SduiColors2.toLinearGradientColor(((IacAlertSheetViewState.BackgroundColor.Gradient) backgroundColor).getLinearGradientColor(), 0.0f, composer2, 0, 1), null, 1, null);
                        }
                        Brush brush = brush$default;
                        composer2.endReplaceGroup();
                        BoxKt.Box(Background3.background$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), brush, null, 0.0f, 6, null), composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        RichText title = state.getIacAlertSheet().getTitle();
        if (title != null) {
            RhTextView rhTextView = getBinding().titleTextView;
            rhTextView.setVisibility(0);
            Intrinsics.checkNotNull(rhTextView);
            ScarletManager2.overrideAttribute(rhTextView, R.attr.textColor, state.getTextColor());
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            rhTextView.setText(RichTexts.toSpannableString$default(title, contextRequireContext, null, false, null, 14, null));
            Intrinsics.checkNotNull(rhTextView);
        } else {
            getBinding().titleTextView.setVisibility(8);
        }
        RichText description = state.getIacAlertSheet().getDescription();
        if (description != null) {
            RhTextView rhTextView2 = getBinding().descriptionTextView;
            rhTextView2.setVisibility(0);
            Intrinsics.checkNotNull(rhTextView2);
            ScarletManager2.overrideAttribute(rhTextView2, R.attr.textColor, state.getTextColor());
            ScarletManager2.overrideAttribute(rhTextView2, R.attr.textColorLink, state.getLinkTextColor());
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            rhTextView2.setText(RichTexts.toSpannableString$default(description, contextRequireContext2, null, false, null, 14, null));
            Intrinsics.checkNotNull(rhTextView2);
        } else {
            getBinding().descriptionTextView.setVisibility(8);
        }
        RdsButton rdsButton = getBinding().primaryButton;
        final GenericButton firstButton = state.getIacAlertSheet().getFirstButton();
        rdsButton.setVisibility(0);
        rdsButton.setText(firstButton.getTitle());
        setStyle(state.getButtonStyle(firstButton), 0);
        Intrinsics.checkNotNull(rdsButton);
        ScarletManager2.overrideAttribute(rdsButton, R.attr.textColor, state.getButtonTextColor(firstButton));
        ScarletManager2.overrideAttribute(rdsButton, R.attr.backgroundTint, state.getButtonColor(firstButton));
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.iac.alertsheet.ui.IacAlertSheetFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IacAlertSheetFragment.refreshUi$lambda$7$lambda$6(this.f$0, state, firstButton);
            }
        });
        if (state.getIacAlertSheet().getSecondButton() != null) {
            final GenericButton secondButton = state.getIacAlertSheet().getSecondButton();
            Intrinsics.checkNotNull(secondButton);
            RdsButton rdsButton2 = getBinding().secondaryButton;
            rdsButton2.setVisibility(0);
            rdsButton2.setText(secondButton.getTitle());
            setStyle(state.getButtonStyle(secondButton), 0);
            Intrinsics.checkNotNull(rdsButton2);
            ScarletManager2.overrideAttribute(rdsButton2, R.attr.textColor, state.getButtonTextColor(secondButton));
            ScarletManager2.overrideAttribute(rdsButton2, R$attr.strokeColor, state.getButtonTextColor(secondButton));
            OnClickListeners.onClick(rdsButton2, new Function0() { // from class: com.robinhood.iac.alertsheet.ui.IacAlertSheetFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IacAlertSheetFragment.refreshUi$lambda$9$lambda$8(this.f$0, state, secondButton);
                }
            });
            Intrinsics.checkNotNull(rdsButton2);
        } else {
            getBinding().secondaryButton.setVisibility(8);
        }
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(state.getIacAlertSheet().getPog());
        Integer numValueOf = serverToBentoAssetMapper3FromServerValue != null ? Integer.valueOf(serverToBentoAssetMapper3FromServerValue.getResourceId()) : null;
        final AspectFillRemoteImage<GenericAction> image = state.getIacAlertSheet().getImage();
        if (image != null) {
            ComposeView composeView = getBinding().remoteImage;
            composeView.setContent(ComposableLambda3.composableLambdaInstance(-2083417186, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.iac.alertsheet.ui.IacAlertSheetFragment$refreshUi$6$1
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
                        ComposerKt.traceEventStart(-2083417186, i, -1, "com.robinhood.iac.alertsheet.ui.IacAlertSheetFragment.refreshUi.<anonymous>.<anonymous> (IacAlertSheetFragment.kt:229)");
                    }
                    RemoteImageRenderer.SduiAspectFillRemoteImage(image, null, false, ContentScale.INSTANCE.getFillWidth(), composer, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            composeView.setVisibility(0);
            getBinding().rdsPogView.setVisibility(8);
            RhTextView titleTextView = getBinding().titleTextView;
            Intrinsics.checkNotNullExpressionValue(titleTextView, "titleTextView");
            ViewsKt.setMarginTop(titleTextView, 0);
            return;
        }
        if (numValueOf != null) {
            RdsPogView rdsPogView = getBinding().rdsPogView;
            Intrinsics.checkNotNull(rdsPogView);
            rdsPogView.setPictogram(ViewsKt.getDrawable(rdsPogView, numValueOf.intValue()));
            ScarletManager2.overrideAttribute(rdsPogView, R.attr.backgroundTint, state.getPogBackgroundColor());
            ScarletManager2.overrideAttribute(rdsPogView, C13997R.attr.pictogramTint, state.getPogForegroundColor());
            rdsPogView.setVisibility(0);
            getBinding().remoteImage.setVisibility(8);
            RhTextView titleTextView2 = getBinding().titleTextView;
            Intrinsics.checkNotNullExpressionValue(titleTextView2, "titleTextView");
            ViewsKt.setMarginTop(titleTextView2, 0);
            return;
        }
        getBinding().remoteImage.setVisibility(8);
        getBinding().rdsPogView.setVisibility(8);
        RhTextView titleTextView3 = getBinding().titleTextView;
        Intrinsics.checkNotNullExpressionValue(titleTextView3, "titleTextView");
        ViewsKt.setMarginTop(titleTextView3, getResources().getDimensionPixelOffset(C13997R.dimen.rds_spacing_medium));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$7$lambda$6(IacAlertSheetFragment iacAlertSheetFragment, IacAlertSheetViewState iacAlertSheetViewState, GenericButton genericButton) {
        iacAlertSheetFragment.onAction(iacAlertSheetViewState.getIacAlertSheet(), genericButton.getTypedAction(), genericButton.getLoggingIdentifier(), genericButton.getTitle());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$9$lambda$8(IacAlertSheetFragment iacAlertSheetFragment, IacAlertSheetViewState iacAlertSheetViewState, GenericButton genericButton) {
        iacAlertSheetFragment.onAction(iacAlertSheetViewState.getIacAlertSheet(), genericButton.getTypedAction(), genericButton.getLoggingIdentifier(), genericButton.getTitle());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.shouldPostItemDismissedPassive) {
            getDuxo().postItemDismissedPassive();
            EventLogger eventLogger = getEventLogger();
            Screen eventScreenName = getEventScreenName();
            Component.ComponentType componentType = Component.ComponentType.ALERT_SHEET;
            Companion companion = INSTANCE;
            String loggingIdentifier = ((LegacyDialogFragmentKey.IacAlertSheet) companion.getArgs((Fragment) this)).getLoggingIdentifier();
            if (loggingIdentifier == null) {
                loggingIdentifier = "";
            }
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.DISMISS, eventScreenName, new Component(componentType, loggingIdentifier, null, 4, null), null, AlertSheetExtensions.eventContext(((LegacyDialogFragmentKey.IacAlertSheet) companion.getArgs((Fragment) this)).getIacBottomSheet(), ((LegacyDialogFragmentKey.IacAlertSheet) companion.getArgs((Fragment) this)).getProductTag()), false, 40, null);
        }
    }

    private final void onAction(IacAlertSheet iacAlertSheet, com.robinhood.models.serverdriven.p347db.GenericAction action, String buttonLoggingIdentifier, String buttonTitle) {
        if (action instanceof GenericAction.DeeplinkAction) {
            this.shouldPostItemDismissedPassive = false;
            IacAlertSheetDuxo duxo = getDuxo();
            UUID id = iacAlertSheet.getId();
            GenericAction.DeeplinkAction deeplinkAction = (GenericAction.DeeplinkAction) action;
            String string2 = deeplinkAction.getUri().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            duxo.postItemAction(id, string2);
            getDuxo().postItemDismissed(iacAlertSheet.getId());
            IacAlertSheetDuxo duxo2 = getDuxo();
            Uri uri = deeplinkAction.getUri();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            duxo2.onDeepLinkClicked(uri, contextRequireContext);
            dismiss();
        } else {
            this.shouldPostItemDismissedPassive = false;
            getDuxo().postItemDismissed(iacAlertSheet.getId());
            dismiss();
        }
        EventLogger eventLogger = getEventLogger();
        Screen eventScreenName = getEventScreenName();
        Component.ComponentType componentType = Component.ComponentType.ALERT_SHEET;
        Companion companion = INSTANCE;
        String loggingIdentifier = ((LegacyDialogFragmentKey.IacAlertSheet) companion.getArgs((Fragment) this)).getLoggingIdentifier();
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, eventScreenName, new Component(Component.ComponentType.BUTTON, buttonLoggingIdentifier, null, 4, null), new ComponentHierarchy(new Component(componentType, loggingIdentifier == null ? buttonTitle : loggingIdentifier, null, 4, null), null, null, null, null, 30, null), AlertSheetExtensions.eventContext(iacAlertSheet, ((LegacyDialogFragmentKey.IacAlertSheet) companion.getArgs((Fragment) this)).getProductTag()), false, 33, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != 1) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        if (resultCode == -1) {
            IacAlertSheetDuxo duxo = getDuxo();
            UUID uuid = this.iacAlertSheetId;
            Intrinsics.checkNotNull(uuid);
            duxo.postItemDismissed(uuid);
            dismiss();
            requireActivity().onBackPressed();
        }
    }

    /* compiled from: IacAlertSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/iac/alertsheet/ui/IacAlertSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/iac/alertsheet/ui/IacAlertSheetFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$IacAlertSheet;", "Lcom/robinhood/android/navigation/DialogFragmentResolver;", "<init>", "()V", "REQUEST_GOLD_DOWNGRADE", "", "createDialogFragment", "Landroidx/fragment/app/DialogFragment;", "key", "lib-iac-alert-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<IacAlertSheetFragment, LegacyDialogFragmentKey.IacAlertSheet>, DialogFragmentResolver<LegacyDialogFragmentKey.IacAlertSheet> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyDialogFragmentKey.IacAlertSheet getArgs(IacAlertSheetFragment iacAlertSheetFragment) {
            return (LegacyDialogFragmentKey.IacAlertSheet) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, iacAlertSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public IacAlertSheetFragment newInstance(LegacyDialogFragmentKey.IacAlertSheet iacAlertSheet) {
            return (IacAlertSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, iacAlertSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(IacAlertSheetFragment iacAlertSheetFragment, LegacyDialogFragmentKey.IacAlertSheet iacAlertSheet) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, iacAlertSheetFragment, iacAlertSheet);
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolver
        public DialogFragment createDialogFragment(LegacyDialogFragmentKey.IacAlertSheet key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (DialogFragment) IacAlertSheetFragment.INSTANCE.newInstance((Parcelable) key);
        }
    }
}
