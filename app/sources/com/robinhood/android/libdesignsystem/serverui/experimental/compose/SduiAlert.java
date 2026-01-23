package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import android.text.SpannableString;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragmentHost;
import com.robinhood.android.common.p088ui.RhButtonType;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BuyingPowerHubAlertSheetDialogFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.GenericAlertSheetDialogFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.GoldHubAlertSheetDialogFragment;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.alerts.BentoAlerts2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.idl.Dto3;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.ButtonType;
import com.robinhood.models.serverdriven.experimental.api.BuyingPowerHubAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import com.robinhood.models.serverdriven.experimental.api.GoldHubAction;
import com.robinhood.models.serverdriven.experimental.api.Pictogram;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import io.noties.markwon.Markwon;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.AlertDto;
import rh_server_driven_ui.p531v1.ButtonDto;
import rh_server_driven_ui.p531v1.GenericActionDto;

/* compiled from: SduiAlert.kt */
@Metadata(m3635d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ja\u0010\b\u001a\u00020\t\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0014Jo\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n2\u0006\u0010\f\u001a\u00020\u00152\u0016\u0010\u0016\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u0001H\n0\u00112\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0018J3\u0010\b\u001a\u00020\t\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\n0\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\u001bH\u0007¢\u0006\u0002\u0010\u001cJw\u0010\b\u001a\u00020\t\"\f\b\u0000\u0010\u001d*\u0006\u0012\u0002\b\u00030\u001e2\u0006\u0010\f\u001a\u00020\u00152\u0016\u0010\u0016\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u0001H\u001d0\u00112\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u0002H\u001d\u0018\u00010 2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010!J:\u0010\"\u001a\u00020\t\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\u000fH\u0087\b¢\u0006\u0002\u0010#JY\u0010\"\u001a\u00020\t\"\f\b\u0000\u0010\u001d*\u0006\u0012\u0002\b\u00030\u001e2\u0006\u0010\f\u001a\u00020\u00152\u0016\u0010\u0016\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u0001H\u001d0\u00112\b\b\u0002\u0010$\u001a\u00020%2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u0002H\u001d\u0018\u00010 H\u0007¢\u0006\u0004\b'\u0010(J3\u0010)\u001a\u00020*\"\b\b\u0000\u0010\n*\u00020\u000b*\b\u0012\u0004\u0012\u0002H\n0+2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u0004\u0018\u00010.*\u00020/H\u0000¢\u0006\u0002\b0JA\u0010)\u001a\u00020*\"\u0004\b\u0000\u0010\n*\u0002012\u0016\u0010\u0016\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u0001H\n0\u00112\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\u000fH\u0007¢\u0006\u0002\u00102JQ\u0010)\u001a\u00020*\"\f\b\u0000\u0010\u001d*\u0006\u0012\u0002\b\u00030\u001e*\u0002012\u0006\u00103\u001a\u0002042\u0016\u0010\u0016\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u0001H\u001d0\u00112\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u0002H\u001d\u0018\u00010 H\u0007¢\u0006\u0002\u00105J \u0001\u00106\u001a\u000207\"\b\b\u0000\u0010\n*\u00020\u000b2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\n0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\n0\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\u0014\b\u0002\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u00112\u0014\b\u0002\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020?2\b\b\u0002\u0010A\u001a\u00020?2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010CJÁ\u0001\u00106\u001a\u000207\"\b\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010:\u001a\u00020;2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\n0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\n0\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\u0014\b\u0002\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u00112\u0014\b\u0002\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020?2\b\b\u0002\u0010A\u001a\u00020?2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010C2'\u0010D\u001a#\u0012\u0004\u0012\u00020F\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bG\u0012\b\bH\u0012\u0004\b\b(I\u0012\u0004\u0012\u00020\t0EJ\u001c\u0010J\u001a\u00020\t2\u0006\u00108\u001a\u0002092\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020K0\rJ\u001c\u0010L\u001a\u00020\t2\u0006\u00108\u001a\u0002092\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020M0\rJ:\u0010N\u001a\u00020\t2\u0006\u00108\u001a\u0002092\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020O0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020O0\u000f2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006P"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/SduiAlert;", "", "<init>", "()V", "sheetId", "", "BOTTOM_SHEET_TAG", "", "Dialog", "", "ActionT", "Landroid/os/Parcelable;", "content", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "onClickUri", "Lkotlin/Function1;", "onDismiss", "Lkotlin/Function0;", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lrh_server_driven_ui/v1/AlertDto;", "parseAction", "Lrh_server_driven_ui/v1/ActionDto;", "(Lrh_server_driven_ui/v1/AlertDto;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "alert", "callbacks", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/SduiCallbacks;", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/SduiCallbacks;Landroidx/compose/runtime/Composer;I)V", "DtoT", "Lcom/robinhood/idl/MessageDto;", "dtoHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/dto/DtoActionHandler;", "(Lrh_server_driven_ui/v1/AlertDto;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/dto/DtoActionHandler;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "AlertSheet", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Landroidx/compose/runtime/Composer;II)V", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "dtoActionHandler", "AlertSheet-oTYcxuw", "(Lrh_server_driven_ui/v1/AlertDto;Lkotlin/jvm/functions/Function1;ILcom/robinhood/android/libdesignsystem/serverui/experimental/action/dto/DtoActionHandler;Landroidx/compose/runtime/Composer;II)V", "toAlertButton", "Lcom/robinhood/compose/bento/component/alerts/BentoAlertButton;", "Lcom/robinhood/models/serverdriven/experimental/api/Button;", "(Lcom/robinhood/models/serverdriven/experimental/api/Button;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/compose/bento/component/alerts/BentoAlertButton;", "toBentoButtonType", "Lcom/robinhood/compose/bento/component/BentoButtons$Type;", "Lcom/robinhood/models/serverdriven/experimental/api/ButtonType;", "toBentoButtonType$lib_sdui_externalRelease", "Lrh_server_driven_ui/v1/ButtonDto;", "(Lrh_server_driven_ui/v1/ButtonDto;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/compose/bento/component/alerts/BentoAlertButton;", "alertType", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertMobilePresentationStyle;", "(Lrh_server_driven_ui/v1/ButtonDto;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertMobilePresentationStyle;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/dto/DtoActionHandler;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/compose/bento/component/alerts/BentoAlertButton;", "sheetListener", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost$SheetListener;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "markwon", "Lio/noties/markwon/Markwon;", "onPrimaryButtonClick", "onSecondaryButtonClick", "forCrypto", "", "forAchromatic", "isCancelable", "overridePrimaryButtonType", "Lcom/robinhood/android/common/ui/RhButtonType;", "show", "Lkotlin/Function2;", "Landroidx/fragment/app/DialogFragment;", "Lkotlin/ParameterName;", "name", "tag", "presentGenericAlertSheet", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "presentBuyingPowerHubAlertSheet", "Lcom/robinhood/models/serverdriven/experimental/api/BuyingPowerHubAction;", "presentGoldHubAlertSheet", "Lcom/robinhood/models/serverdriven/experimental/api/GoldHubAction;", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class SduiAlert {
    public static final String BOTTOM_SHEET_TAG = "bottom_sheet";
    private static int sheetId;
    public static final SduiAlert INSTANCE = new SduiAlert();
    public static final int $stable = 8;

    /* compiled from: SduiAlert.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonType.values().length];
            try {
                iArr[ButtonType.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonType.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertSheet_oTYcxuw$lambda$13(SduiAlert sduiAlert, AlertDto alertDto, Function1 function1, int i, DtoActionHandler dtoActionHandler, int i2, int i3, Composer composer, int i4) {
        sduiAlert.m15974AlertSheetoTYcxuw(alertDto, function1, i, dtoActionHandler, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Dialog$lambda$12(SduiAlert sduiAlert, AlertDto alertDto, Function1 function1, DtoActionHandler dtoActionHandler, Function1 function12, Function0 function0, int i, int i2, Composer composer, int i3) {
        sduiAlert.Dialog(alertDto, function1, dtoActionHandler, (Function1<? super String, Unit>) function12, (Function0<Unit>) function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Dialog$lambda$3(SduiAlert sduiAlert, GenericAlertContent genericAlertContent, SduiActionHandler sduiActionHandler, Function1 function1, Function0 function0, int i, int i2, Composer composer, int i3) {
        sduiAlert.Dialog(genericAlertContent, sduiActionHandler, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Dialog$lambda$6(SduiAlert sduiAlert, AlertDto alertDto, Function1 function1, SduiActionHandler sduiActionHandler, Function1 function12, Function0 function0, int i, int i2, Composer composer, int i3) {
        sduiAlert.Dialog(alertDto, function1, sduiActionHandler, (Function1<? super String, Unit>) function12, (Function0<Unit>) function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Dialog$lambda$9(SduiAlert sduiAlert, GenericAlertContent genericAlertContent, SduiActionHandler6 sduiActionHandler6, int i, Composer composer, int i2) {
        sduiAlert.Dialog(genericAlertContent, sduiActionHandler6, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private SduiAlert() {
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <ActionT extends Parcelable> void Dialog(final GenericAlertContent<? extends ActionT> content, SduiActionHandler<? super ActionT> sduiActionHandler, Function1<? super String, Unit> function1, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super String, Unit> function12;
        int i4;
        Function0<Unit> function02;
        SduiAlert sduiAlert;
        final Function0<Unit> function03;
        boolean z;
        Object objRememberedValue;
        final SduiActionHandler<? super ActionT> sduiActionHandler2;
        final Function1<? super String, Unit> function13;
        String serverValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        SduiActionHandler<? super ActionT> sduiActionHandler3 = sduiActionHandler;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-979308702);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(sduiActionHandler3) : composerStartRestartGroup.changedInstance(sduiActionHandler3) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                function12 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                }
                if ((i2 & 16) == 0) {
                    if ((i & 24576) == 0) {
                        sduiAlert = this;
                        i3 |= composerStartRestartGroup.changedInstance(sduiAlert) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        if (i5 != 0) {
                            sduiActionHandler3 = null;
                        }
                        Function1<? super String, Unit> function14 = i6 == 0 ? null : function12;
                        function03 = i4 == 0 ? null : function02;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-979308702, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert.Dialog (SduiAlert.kt:69)");
                        }
                        Button<ActionT> button = content.getAction_buttons().get(0);
                        Button<? extends ActionT> button2 = (Button) CollectionsKt.getOrNull(content.getAction_buttons(), 1);
                        Pictogram pog = content.getPog();
                        ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = (pog != null || (serverValue = pog.getServerValue()) == null) ? null : ServerToBentoAssetMapper3.INSTANCE.fromServerValue(serverValue);
                        String title = content.getTitle();
                        BentoAlertDialog2.Body.MarkdownText markdownText = new BentoAlertDialog2.Body.MarkdownText(content.getBody_markdown());
                        int i7 = ((i3 >> 6) & 896) | (i3 & 112);
                        SduiActionHandler<? super ActionT> sduiActionHandler4 = sduiActionHandler3;
                        BentoAlertButton alertButton = sduiAlert.toAlertButton(button, sduiActionHandler4, composerStartRestartGroup, i7, 0);
                        composerStartRestartGroup.startReplaceGroup(-517799187);
                        BentoAlertButton alertButton2 = button2 != null ? toAlertButton(button2, sduiActionHandler4, composerStartRestartGroup, i7, 0) : null;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        z = (i3 & 7168) == 2048;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SduiAlert.Dialog$lambda$2$lambda$1(function03);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function04 = (Function0) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        int i8 = BentoAlertDialog2.Body.MarkdownText.$stable << 3;
                        int i9 = BentoAlertButton.$stable;
                        Function1<? super String, Unit> function15 = function14;
                        BentoAlertDialog.BentoAlertDialog(title, markdownText, alertButton, null, alertButton2, serverToBentoAssetMapper3FromServerValue, false, function15, function04, composerStartRestartGroup, ((i3 << 15) & 29360128) | i8 | (i9 << 6) | (i9 << 12), 72);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        sduiActionHandler2 = sduiActionHandler4;
                        function13 = function15;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        sduiActionHandler2 = sduiActionHandler3;
                        function13 = function12;
                        function03 = function02;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SduiAlert.Dialog$lambda$3(this.f$0, content, sduiActionHandler2, function13, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                sduiAlert = this;
                if ((i3 & 9363) == 9362) {
                    if (i5 != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Button<ActionT> button3 = content.getAction_buttons().get(0);
                    Button<? extends ActionT> button22 = (Button) CollectionsKt.getOrNull(content.getAction_buttons(), 1);
                    Pictogram pog2 = content.getPog();
                    if (pog2 != null) {
                        String title2 = content.getTitle();
                        BentoAlertDialog2.Body.MarkdownText markdownText2 = new BentoAlertDialog2.Body.MarkdownText(content.getBody_markdown());
                        int i72 = ((i3 >> 6) & 896) | (i3 & 112);
                        SduiActionHandler<? super ActionT> sduiActionHandler42 = sduiActionHandler3;
                        BentoAlertButton alertButton3 = sduiAlert.toAlertButton(button3, sduiActionHandler42, composerStartRestartGroup, i72, 0);
                        composerStartRestartGroup.startReplaceGroup(-517799187);
                        BentoAlertButton alertButton22 = button22 != null ? toAlertButton(button22, sduiActionHandler42, composerStartRestartGroup, i72, 0) : null;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if ((i3 & 7168) == 2048) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SduiAlert.Dialog$lambda$2$lambda$1(function03);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            Function0 function042 = (Function0) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            int i82 = BentoAlertDialog2.Body.MarkdownText.$stable << 3;
                            int i92 = BentoAlertButton.$stable;
                            Function1<? super String, Unit> function152 = function14;
                            BentoAlertDialog.BentoAlertDialog(title2, markdownText2, alertButton3, null, alertButton22, serverToBentoAssetMapper3FromServerValue, false, function152, function042, composerStartRestartGroup, ((i3 << 15) & 29360128) | i82 | (i92 << 6) | (i92 << 12), 72);
                            composerStartRestartGroup = composerStartRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            sduiActionHandler2 = sduiActionHandler42;
                            function13 = function152;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function02 = function0;
            if ((i2 & 16) == 0) {
            }
            sduiAlert = this;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function12 = function1;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function02 = function0;
        if ((i2 & 16) == 0) {
        }
        sduiAlert = this;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Dialog$lambda$2$lambda$1(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <ActionT> void Dialog(final AlertDto content, final Function1<? super ActionDto, ? extends ActionT> parseAction, SduiActionHandler<? super ActionT> sduiActionHandler, Function1<? super String, Unit> function1, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super String, Unit> function12;
        int i4;
        Function0<Unit> function02;
        SduiAlert sduiAlert;
        int i5;
        final Function0<Unit> function03;
        boolean z;
        Object objRememberedValue;
        final Function0<Unit> function04;
        final SduiActionHandler<? super ActionT> sduiActionHandler2;
        final Function1<? super String, Unit> function13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-673178942);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(parseAction) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(sduiActionHandler) : composerStartRestartGroup.changedInstance(sduiActionHandler) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                function12 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                }
                if ((i2 & 32) == 0) {
                    if ((i & 196608) == 0) {
                        sduiAlert = this;
                        i3 |= composerStartRestartGroup.changedInstance(sduiAlert) ? 131072 : 65536;
                    }
                    i5 = i3;
                    if ((74899 & i5) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        SduiActionHandler<? super ActionT> sduiActionHandler3 = i6 == 0 ? null : sduiActionHandler;
                        Function1<? super String, Unit> function14 = i7 == 0 ? null : function12;
                        function03 = i4 == 0 ? null : function02;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-673178942, i5, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert.Dialog (SduiAlert.kt:103)");
                        }
                        List<ButtonDto> buttons = content.getButtons();
                        ButtonDto buttonDto = buttons.get(0);
                        ButtonDto buttonDto2 = (ButtonDto) CollectionsKt.getOrNull(buttons, 1);
                        String title = content.getTitle();
                        BentoAlertDialog2.Body.MarkdownText markdownText = new BentoAlertDialog2.Body.MarkdownText(content.getBody_markdown());
                        int i8 = ((i5 >> 6) & 7168) | (i5 & 1008);
                        BentoAlertButton alertButton = sduiAlert.toAlertButton(buttonDto, parseAction, sduiActionHandler3, composerStartRestartGroup, i8, 0);
                        composerStartRestartGroup.startReplaceGroup(1615120491);
                        SduiActionHandler<? super ActionT> sduiActionHandler4 = sduiActionHandler3;
                        BentoAlertButton alertButton2 = buttonDto2 != null ? toAlertButton(buttonDto2, parseAction, sduiActionHandler3, composerStartRestartGroup, i8, 0) : null;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        z = (57344 & i5) == 16384;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SduiAlert.Dialog$lambda$5$lambda$4(function03);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function05 = (Function0) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        int i9 = BentoAlertDialog2.Body.MarkdownText.$stable << 3;
                        int i10 = BentoAlertButton.$stable;
                        int i11 = i9 | (i10 << 6) | (i10 << 12) | (29360128 & (i5 << 12));
                        Function0<Unit> function06 = function03;
                        Function1<? super String, Unit> function15 = function14;
                        BentoAlertDialog.BentoAlertDialog(title, markdownText, alertButton, null, alertButton2, null, false, function15, function05, composerStartRestartGroup, i11, 104);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function04 = function06;
                        sduiActionHandler2 = sduiActionHandler4;
                        function13 = function15;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        sduiActionHandler2 = sduiActionHandler;
                        function13 = function12;
                        function04 = function02;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SduiAlert.Dialog$lambda$6(this.f$0, content, parseAction, sduiActionHandler2, function13, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                sduiAlert = this;
                i5 = i3;
                if ((74899 & i5) == 74898) {
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    List<ButtonDto> buttons2 = content.getButtons();
                    ButtonDto buttonDto3 = buttons2.get(0);
                    ButtonDto buttonDto22 = (ButtonDto) CollectionsKt.getOrNull(buttons2, 1);
                    String title2 = content.getTitle();
                    BentoAlertDialog2.Body.MarkdownText markdownText2 = new BentoAlertDialog2.Body.MarkdownText(content.getBody_markdown());
                    int i82 = ((i5 >> 6) & 7168) | (i5 & 1008);
                    BentoAlertButton alertButton3 = sduiAlert.toAlertButton(buttonDto3, parseAction, sduiActionHandler3, composerStartRestartGroup, i82, 0);
                    composerStartRestartGroup.startReplaceGroup(1615120491);
                    SduiActionHandler<? super ActionT> sduiActionHandler42 = sduiActionHandler3;
                    BentoAlertButton alertButton22 = buttonDto22 != null ? toAlertButton(buttonDto22, parseAction, sduiActionHandler3, composerStartRestartGroup, i82, 0) : null;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((57344 & i5) == 16384) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SduiAlert.Dialog$lambda$5$lambda$4(function03);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        Function0 function052 = (Function0) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        int i92 = BentoAlertDialog2.Body.MarkdownText.$stable << 3;
                        int i102 = BentoAlertButton.$stable;
                        int i112 = i92 | (i102 << 6) | (i102 << 12) | (29360128 & (i5 << 12));
                        Function0<Unit> function062 = function03;
                        Function1<? super String, Unit> function152 = function14;
                        BentoAlertDialog.BentoAlertDialog(title2, markdownText2, alertButton3, null, alertButton22, null, false, function152, function052, composerStartRestartGroup, i112, 104);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function04 = function062;
                        sduiActionHandler2 = sduiActionHandler42;
                        function13 = function152;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function02 = function0;
            if ((i2 & 32) == 0) {
            }
            sduiAlert = this;
            i5 = i3;
            if ((74899 & i5) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function12 = function1;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function02 = function0;
        if ((i2 & 32) == 0) {
        }
        sduiAlert = this;
        i5 = i3;
        if ((74899 & i5) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Dialog$lambda$5$lambda$4(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @Deprecated
    public final <ActionT extends Parcelable> void Dialog(final GenericAlertContent<? extends ActionT> alert, SduiActionHandler6<ActionT> sduiActionHandler6, Composer composer, final int i) {
        int i2;
        BentoAlertButton alertButton;
        SduiAlert sduiAlert;
        final SduiAlert sduiAlert2;
        SduiAlert sduiAlert3 = this;
        final SduiActionHandler6<ActionT> callbacks = sduiActionHandler6;
        Intrinsics.checkNotNullParameter(alert, "alert");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1785982394);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(alert) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sduiAlert3) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1785982394, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert.Dialog (SduiAlert.kt:126)");
            }
            boolean z = false;
            Button<ActionT> button = alert.getAction_buttons().get(0);
            Button<? extends ActionT> button2 = (Button) CollectionsKt.getOrNull(alert.getAction_buttons(), 1);
            String title = alert.getTitle();
            BentoAlertDialog2.Body.MarkdownText markdownText = new BentoAlertDialog2.Body.MarkdownText(alert.getBody_markdown());
            int i4 = i3 & 112;
            int i5 = i3 & 1008;
            BentoAlertButton alertButton2 = sduiAlert3.toAlertButton(button, callbacks, composerStartRestartGroup, i5, 0);
            composerStartRestartGroup.startReplaceGroup(1657860478);
            if (button2 == null) {
                callbacks = sduiActionHandler6;
                alertButton = null;
                sduiAlert = this;
            } else {
                SduiAlert sduiAlert4 = this;
                callbacks = sduiActionHandler6;
                alertButton = sduiAlert4.toAlertButton(button2, callbacks, composerStartRestartGroup, i5, 0);
                sduiAlert = sduiAlert4;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            if (i4 == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(callbacks))) {
                z = true;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SduiAlert.Dialog$lambda$8$lambda$7(callbacks);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i6 = BentoAlertDialog2.Body.MarkdownText.$stable << 3;
            int i7 = BentoAlertButton.$stable;
            BentoAlertDialog.BentoAlertDialog(title, markdownText, alertButton2, null, alertButton, null, false, null, (Function0) objRememberedValue, composerStartRestartGroup, i6 | (i7 << 6) | (i7 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            sduiAlert2 = sduiAlert;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                sduiAlert2 = sduiAlert;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            sduiAlert2 = sduiAlert3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiAlert.Dialog$lambda$9(this.f$0, alert, callbacks, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Dialog$lambda$8$lambda$7(SduiActionHandler6 sduiActionHandler6) {
        sduiActionHandler6.dismissDialog();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <DtoT extends Dto3<?>> void Dialog(final AlertDto content, final Function1<? super ActionDto, ? extends DtoT> parseAction, DtoActionHandler<DtoT> dtoActionHandler, Function1<? super String, Unit> function1, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super String, Unit> function12;
        int i4;
        final Function0<Unit> function02;
        SduiAlert sduiAlert;
        int i5;
        boolean z;
        Object objRememberedValue;
        final Function0<Unit> function03;
        final DtoActionHandler<DtoT> dtoActionHandler2;
        final Function1<? super String, Unit> function13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        DtoActionHandler<DtoT> dtoActionHandler3 = dtoActionHandler;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1176458515);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(parseAction) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(dtoActionHandler3) : composerStartRestartGroup.changedInstance(dtoActionHandler3) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                function12 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                }
                if ((i2 & 32) == 0) {
                    if ((i & 196608) == 0) {
                        sduiAlert = this;
                        i3 |= composerStartRestartGroup.changedInstance(sduiAlert) ? 131072 : 65536;
                    }
                    i5 = i3;
                    if ((74899 & i5) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        if (i6 != 0) {
                            dtoActionHandler3 = null;
                        }
                        Function1<? super String, Unit> function14 = i7 == 0 ? null : function12;
                        if (i4 != 0) {
                            function02 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1176458515, i5, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert.Dialog (SduiAlert.kt:149)");
                        }
                        ButtonDto buttonDto = content.getButtons().get(0);
                        ButtonDto buttonDto2 = (ButtonDto) CollectionsKt.getOrNull(content.getButtons(), 1);
                        String title = content.getTitle();
                        BentoAlertDialog2.Body.MarkdownText markdownText = new BentoAlertDialog2.Body.MarkdownText(content.getBody_markdown());
                        GenericAlertMobilePresentationStyle genericAlertMobilePresentationStyle = GenericAlertMobilePresentationStyle.MODAL;
                        int i8 = i5 << 3;
                        int i9 = (i8 & 896) | 48 | (i8 & 7168) | ((i5 >> 3) & 57344);
                        DtoActionHandler<DtoT> dtoActionHandler4 = dtoActionHandler3;
                        BentoAlertButton alertButton = sduiAlert.toAlertButton(buttonDto, genericAlertMobilePresentationStyle, parseAction, dtoActionHandler4, composerStartRestartGroup, i9, 0);
                        composerStartRestartGroup.startReplaceGroup(-1000207606);
                        BentoAlertButton alertButton2 = buttonDto2 != null ? toAlertButton(buttonDto2, genericAlertMobilePresentationStyle, parseAction, dtoActionHandler4, composerStartRestartGroup, i9, 0) : null;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        z = (i5 & 57344) != 16384;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SduiAlert.Dialog$lambda$11$lambda$10(function02);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        int i10 = BentoAlertDialog2.Body.MarkdownText.$stable << 3;
                        int i11 = BentoAlertButton.$stable;
                        int i12 = i10 | (i11 << 6) | (i11 << 12) | (29360128 & (i5 << 12));
                        Function0<Unit> function04 = function02;
                        Function1<? super String, Unit> function15 = function14;
                        BentoAlertDialog.BentoAlertDialog(title, markdownText, alertButton, null, alertButton2, null, false, function15, (Function0) objRememberedValue, composerStartRestartGroup, i12, 104);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function03 = function04;
                        dtoActionHandler2 = dtoActionHandler4;
                        function13 = function15;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        dtoActionHandler2 = dtoActionHandler3;
                        function13 = function12;
                        function03 = function02;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SduiAlert.Dialog$lambda$12(this.f$0, content, parseAction, dtoActionHandler2, function13, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                sduiAlert = this;
                i5 = i3;
                if ((74899 & i5) == 74898) {
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ButtonDto buttonDto3 = content.getButtons().get(0);
                    ButtonDto buttonDto22 = (ButtonDto) CollectionsKt.getOrNull(content.getButtons(), 1);
                    String title2 = content.getTitle();
                    BentoAlertDialog2.Body.MarkdownText markdownText2 = new BentoAlertDialog2.Body.MarkdownText(content.getBody_markdown());
                    GenericAlertMobilePresentationStyle genericAlertMobilePresentationStyle2 = GenericAlertMobilePresentationStyle.MODAL;
                    int i82 = i5 << 3;
                    int i92 = (i82 & 896) | 48 | (i82 & 7168) | ((i5 >> 3) & 57344);
                    DtoActionHandler<DtoT> dtoActionHandler42 = dtoActionHandler3;
                    BentoAlertButton alertButton3 = sduiAlert.toAlertButton(buttonDto3, genericAlertMobilePresentationStyle2, parseAction, dtoActionHandler42, composerStartRestartGroup, i92, 0);
                    composerStartRestartGroup.startReplaceGroup(-1000207606);
                    if (buttonDto22 != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((i5 & 57344) != 16384) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SduiAlert.Dialog$lambda$11$lambda$10(function02);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        int i102 = BentoAlertDialog2.Body.MarkdownText.$stable << 3;
                        int i112 = BentoAlertButton.$stable;
                        int i122 = i102 | (i112 << 6) | (i112 << 12) | (29360128 & (i5 << 12));
                        Function0<Unit> function042 = function02;
                        Function1<? super String, Unit> function152 = function14;
                        BentoAlertDialog.BentoAlertDialog(title2, markdownText2, alertButton3, null, alertButton2, null, false, function152, (Function0) objRememberedValue, composerStartRestartGroup, i122, 104);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function03 = function042;
                        dtoActionHandler2 = dtoActionHandler42;
                        function13 = function152;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function02 = function0;
            if ((i2 & 32) == 0) {
            }
            sduiAlert = this;
            i5 = i3;
            if ((74899 & i5) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function12 = function1;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function02 = function0;
        if ((i2 & 32) == 0) {
        }
        sduiAlert = this;
        i5 = i3;
        if ((74899 & i5) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Dialog$lambda$11$lambda$10(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final /* synthetic */ <ActionT extends Parcelable> void AlertSheet(final GenericAlertContent<? extends ActionT> content, SduiActionHandler<? super ActionT> sduiActionHandler, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceGroup(1847729312);
        if ((i2 & 2) != 0) {
            sduiActionHandler = null;
        }
        final Button<ActionT> button = content.getAction_buttons().get(0);
        final Button button2 = (Button) CollectionsKt.getOrNull(content.getAction_buttons(), 1);
        Intrinsics.needClassReification();
        SduiActionHandler3.ProvideActionHandler(sduiActionHandler, ComposableLambda3.rememberComposableLambda(925557249, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert.AlertSheet.1
            public final void invoke(Composer composer2, int i3) {
                long jM21372getBg20d7_KjU;
                String serverValue;
                if ((i3 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(925557249, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert.AlertSheet.<anonymous> (SduiAlert.kt:186)");
                }
                Pictogram pog = content.getPog();
                ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = (pog == null || (serverValue = pog.getServerValue()) == null) ? null : ServerToBentoAssetMapper3.INSTANCE.fromServerValue(serverValue);
                String title = content.getTitle();
                final String body_markdown = content.getBody_markdown();
                final List body_components = content.getBody_components();
                SduiAlert sduiAlert = SduiAlert.INSTANCE;
                BentoAlertButton alertButton = sduiAlert.toAlertButton(button, null, composer2, 0, 1);
                Parcelable parcelable = button2;
                composer2.startReplaceGroup(402298512);
                BentoAlertButton alertButton2 = parcelable == null ? null : sduiAlert.toAlertButton(parcelable, null, composer2, 0, 1);
                composer2.endReplaceGroup();
                int i4 = BentoAlertButton.$stable;
                int i5 = (i4 << 9) | (i4 << 12);
                composer2.startReplaceGroup(221388998);
                final int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                Intrinsics.needClassReification();
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1694075195, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$AlertSheet$1$invoke$$inlined$BentoSduiAlertSheet-G_u8Q3M$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1694075195, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BentoSduiAlertSheet.<anonymous> (BentoSduiAlertSheet.kt:38)");
                        }
                        Alignment.Companion companion = Alignment.INSTANCE;
                        Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                        String str = body_markdown;
                        int i7 = iM7919getCentere0LSkKk;
                        List list = body_components;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer3, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion2);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        composer3.startReplaceGroup(1390346787);
                        if (str.length() > 0) {
                            BentoAlerts2.m20854AlertBodyText5stqomU(str, i7, composer3, 0, 0);
                        }
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(1390351170);
                        if (list != null) {
                            ImmutableList3 persistentList = extensions2.toPersistentList(list);
                            HorizontalPadding horizontalPadding = HorizontalPadding.None;
                            composer3.startReplaceGroup(-1772220517);
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Horizontal start = companion.getStart();
                            Intrinsics.reifiedOperationMarker(4, "ActionT");
                            SduiColumns.SduiColumn(persistentList, Parcelable.class, companion2, null, null, horizontalPadding, top, start, true, composer3, 100859904, 0);
                            composer3.endReplaceGroup();
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54);
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU(), null, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM4872backgroundbw27NRU$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(1)), 0.0f, 1, null);
                if (bentoTheme.getColors(composer2, i6).getIsDay()) {
                    composer2.startReplaceGroup(-2071673393);
                    jM21372getBg20d7_KjU = bentoTheme.getColors(composer2, i6).getJet();
                } else {
                    composer2.startReplaceGroup(-2071672529);
                    jM21372getBg20d7_KjU = bentoTheme.getColors(composer2, i6).m21372getBg20d7_KjU();
                }
                composer2.endReplaceGroup();
                BoxKt.Box(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, jM21372getBg20d7_KjU, null, 2, null), composer2, 0);
                BentoAlerts2.AlertContent(null, serverToBentoAssetMapper3FromServerValue, title, null, CollectionsKt.listOfNotNull((Object[]) new BentoAlertButton[]{alertButton, alertButton2}), false, composableLambdaRememberComposableLambda, composer2, ((i5 >> 12) & 112) | 1572864 | ((i5 << 6) & 896) | (i4 << 12), 41);
                composer2.endNode();
                composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }
        }, composer, 54), composer, ((i >> 3) & 14) | 48);
        composer.endReplaceGroup();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e3  */
    /* renamed from: AlertSheet-oTYcxuw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <DtoT extends Dto3<?>> void m15974AlertSheetoTYcxuw(final AlertDto content, final Function1<? super ActionDto, ? extends DtoT> parseAction, int i, DtoActionHandler<DtoT> dtoActionHandler, Composer composer, final int i2, final int i3) {
        int i4;
        int iM7919getCentere0LSkKk;
        int i5;
        final int i6;
        DtoActionHandler<DtoT> dtoActionHandler2;
        ButtonDto buttonDto;
        BentoAlertButton bentoAlertButton;
        BentoAlertButton alertButton;
        BentoTheme bentoTheme;
        int i7;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        long jM21372getBg20d7_KjU;
        final DtoActionHandler<DtoT> dtoActionHandler3;
        final int i8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1371445065);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(parseAction) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                iM7919getCentere0LSkKk = i;
                int i9 = composerStartRestartGroup.changed(iM7919getCentere0LSkKk) ? 256 : 128;
                i4 |= i9;
            } else {
                iM7919getCentere0LSkKk = i;
            }
            i4 |= i9;
        } else {
            iM7919getCentere0LSkKk = i;
        }
        int i10 = i3 & 8;
        if (i10 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= (i2 & 4096) == 0 ? composerStartRestartGroup.changed(dtoActionHandler) : composerStartRestartGroup.changedInstance(dtoActionHandler) ? 2048 : 1024;
        }
        if ((i3 & 16) == 0) {
            if ((i2 & 24576) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(this) ? 16384 : 8192;
            }
            if ((i4 & 9363) != 9362 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                i8 = iM7919getCentere0LSkKk;
                dtoActionHandler3 = dtoActionHandler;
            } else {
                composerStartRestartGroup.startDefaults();
                final List list = null;
                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if ((i3 & 4) != 0) {
                        iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                        i4 &= -897;
                    }
                    if (i10 == 0) {
                        i5 = i4;
                        i6 = iM7919getCentere0LSkKk;
                        dtoActionHandler2 = null;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1371445065, i5, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert.AlertSheet (SduiAlert.kt:206)");
                    }
                    ButtonDto buttonDto2 = content.getButtons().get(0);
                    buttonDto = (ButtonDto) CollectionsKt.getOrNull(content.getButtons(), 1);
                    String title = content.getTitle();
                    final String body_markdown = content.getBody_markdown();
                    GenericAlertMobilePresentationStyle genericAlertMobilePresentationStyle = GenericAlertMobilePresentationStyle.BOTTOM_SHEET;
                    int i11 = ((i5 << 3) & 896) | 48 | (i5 & 7168) | (57344 & i5);
                    BentoAlertButton alertButton2 = toAlertButton(buttonDto2, genericAlertMobilePresentationStyle, parseAction, dtoActionHandler2, composerStartRestartGroup, i11, 0);
                    composerStartRestartGroup.startReplaceGroup(596278945);
                    if (buttonDto == null) {
                        bentoAlertButton = alertButton2;
                        alertButton = null;
                    } else {
                        bentoAlertButton = alertButton2;
                        alertButton = toAlertButton(buttonDto, genericAlertMobilePresentationStyle, parseAction, dtoActionHandler2, composerStartRestartGroup, i11, 0);
                    }
                    DtoActionHandler<DtoT> dtoActionHandler4 = dtoActionHandler2;
                    composerStartRestartGroup.endReplaceGroup();
                    int i12 = BentoAlertButton.$stable;
                    int i13 = (i12 << 9) | 384 | (i12 << 12) | (3670016 & (i5 << 12));
                    composerStartRestartGroup.startReplaceGroup(221388998);
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1694075195, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$AlertSheet-oTYcxuw$$inlined$BentoSduiAlertSheet-G_u8Q3M$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i14) {
                            if ((i14 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1694075195, i14, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BentoSduiAlertSheet.<anonymous> (BentoSduiAlertSheet.kt:38)");
                            }
                            Alignment.Companion companion = Alignment.INSTANCE;
                            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                            String str = body_markdown;
                            int i15 = i6;
                            List list2 = list;
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion2);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            composer2.startReplaceGroup(1390346787);
                            if (str.length() > 0) {
                                BentoAlerts2.m20854AlertBodyText5stqomU(str, i15, composer2, 0, 0);
                            }
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(1390351170);
                            if (list2 != null) {
                                ImmutableList3 persistentList = extensions2.toPersistentList(list2);
                                HorizontalPadding horizontalPadding = HorizontalPadding.None;
                                composer2.startReplaceGroup(-1772220517);
                                SduiColumns.SduiColumn(persistentList, GenericActionDto.class, companion2, null, null, horizontalPadding, arrangement.getTop(), companion.getStart(), true, composer2, 100859904, 0);
                                composer2.endReplaceGroup();
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    bentoTheme = BentoTheme.INSTANCE;
                    i7 = BentoTheme.$stable;
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composerStartRestartGroup, i7).m21371getBg0d7_KjU(), null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    int i14 = i6;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(1)), 0.0f, 1, null);
                    if (bentoTheme.getColors(composerStartRestartGroup, i7).getIsDay()) {
                        composerStartRestartGroup.startReplaceGroup(-2071672529);
                        jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21372getBg20d7_KjU();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-2071673393);
                        jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).getJet();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BoxKt.Box(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, jM21372getBg20d7_KjU, null, 2, null), composerStartRestartGroup, 0);
                    BentoAlerts2.AlertContent(null, null, title, null, CollectionsKt.listOfNotNull((Object[]) new BentoAlertButton[]{bentoAlertButton, alertButton}), false, composableLambdaRememberComposableLambda, composerStartRestartGroup, ((i13 >> 12) & 112) | 1572864 | ((i13 << 6) & 896) | (i12 << 12), 41);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    dtoActionHandler3 = dtoActionHandler4;
                    i8 = i14;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                }
                dtoActionHandler2 = dtoActionHandler;
                i5 = i4;
                i6 = iM7919getCentere0LSkKk;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ButtonDto buttonDto22 = content.getButtons().get(0);
                buttonDto = (ButtonDto) CollectionsKt.getOrNull(content.getButtons(), 1);
                String title2 = content.getTitle();
                final String body_markdown2 = content.getBody_markdown();
                GenericAlertMobilePresentationStyle genericAlertMobilePresentationStyle2 = GenericAlertMobilePresentationStyle.BOTTOM_SHEET;
                int i112 = ((i5 << 3) & 896) | 48 | (i5 & 7168) | (57344 & i5);
                BentoAlertButton alertButton22 = toAlertButton(buttonDto22, genericAlertMobilePresentationStyle2, parseAction, dtoActionHandler2, composerStartRestartGroup, i112, 0);
                composerStartRestartGroup.startReplaceGroup(596278945);
                if (buttonDto == null) {
                }
                DtoActionHandler<DtoT> dtoActionHandler42 = dtoActionHandler2;
                composerStartRestartGroup.endReplaceGroup();
                int i122 = BentoAlertButton.$stable;
                int i132 = (i122 << 9) | 384 | (i122 << 12) | (3670016 & (i5 << 12));
                composerStartRestartGroup.startReplaceGroup(221388998);
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-1694075195, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$AlertSheet-oTYcxuw$$inlined$BentoSduiAlertSheet-G_u8Q3M$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i142) {
                        if ((i142 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1694075195, i142, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BentoSduiAlertSheet.<anonymous> (BentoSduiAlertSheet.kt:38)");
                        }
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                        String str = body_markdown2;
                        int i15 = i6;
                        List list2 = list;
                        Modifier.Companion companion22 = Modifier.INSTANCE;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, companion22);
                        ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion32.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        composer2.startReplaceGroup(1390346787);
                        if (str.length() > 0) {
                            BentoAlerts2.m20854AlertBodyText5stqomU(str, i15, composer2, 0, 0);
                        }
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1390351170);
                        if (list2 != null) {
                            ImmutableList3 persistentList = extensions2.toPersistentList(list2);
                            HorizontalPadding horizontalPadding = HorizontalPadding.None;
                            composer2.startReplaceGroup(-1772220517);
                            SduiColumns.SduiColumn(persistentList, GenericActionDto.class, companion22, null, null, horizontalPadding, arrangement.getTop(), companion3.getStart(), true, composer2, 100859904, 0);
                            composer2.endReplaceGroup();
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                bentoTheme = BentoTheme.INSTANCE;
                i7 = BentoTheme.$stable;
                Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(companion3, bentoTheme.getColors(composerStartRestartGroup, i7).m21371getBg0d7_KjU(), null, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                int i142 = i6;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(companion3, C2002Dp.m7995constructorimpl(1)), 0.0f, 1, null);
                    if (bentoTheme.getColors(composerStartRestartGroup, i7).getIsDay()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BoxKt.Box(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default2, jM21372getBg20d7_KjU, null, 2, null), composerStartRestartGroup, 0);
                    BentoAlerts2.AlertContent(null, null, title2, null, CollectionsKt.listOfNotNull((Object[]) new BentoAlertButton[]{bentoAlertButton, alertButton}), false, composableLambdaRememberComposableLambda2, composerStartRestartGroup, ((i132 >> 12) & 112) | 1572864 | ((i132 << 6) & 896) | (i122 << 12), 41);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    dtoActionHandler3 = dtoActionHandler42;
                    i8 = i142;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiAlert.AlertSheet_oTYcxuw$lambda$13(this.f$0, content, parseAction, i8, dtoActionHandler3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 24576;
        if ((i4 & 9363) != 9362) {
            composerStartRestartGroup.startDefaults();
            final List list2 = null;
            if ((i2 & 1) != 0) {
                if ((i3 & 4) != 0) {
                }
                if (i10 == 0) {
                    dtoActionHandler2 = dtoActionHandler;
                    i5 = i4;
                    i6 = iM7919getCentere0LSkKk;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ButtonDto buttonDto222 = content.getButtons().get(0);
                buttonDto = (ButtonDto) CollectionsKt.getOrNull(content.getButtons(), 1);
                String title22 = content.getTitle();
                final String body_markdown22 = content.getBody_markdown();
                GenericAlertMobilePresentationStyle genericAlertMobilePresentationStyle22 = GenericAlertMobilePresentationStyle.BOTTOM_SHEET;
                int i1122 = ((i5 << 3) & 896) | 48 | (i5 & 7168) | (57344 & i5);
                BentoAlertButton alertButton222 = toAlertButton(buttonDto222, genericAlertMobilePresentationStyle22, parseAction, dtoActionHandler2, composerStartRestartGroup, i1122, 0);
                composerStartRestartGroup.startReplaceGroup(596278945);
                if (buttonDto == null) {
                }
                DtoActionHandler<DtoT> dtoActionHandler422 = dtoActionHandler2;
                composerStartRestartGroup.endReplaceGroup();
                int i1222 = BentoAlertButton.$stable;
                int i1322 = (i1222 << 9) | 384 | (i1222 << 12) | (3670016 & (i5 << 12));
                composerStartRestartGroup.startReplaceGroup(221388998);
                ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambda3.rememberComposableLambda(-1694075195, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$AlertSheet-oTYcxuw$$inlined$BentoSduiAlertSheet-G_u8Q3M$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i1422) {
                        if ((i1422 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1694075195, i1422, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BentoSduiAlertSheet.<anonymous> (BentoSduiAlertSheet.kt:38)");
                        }
                        Alignment.Companion companion32 = Alignment.INSTANCE;
                        Alignment.Horizontal centerHorizontally = companion32.getCenterHorizontally();
                        String str = body_markdown22;
                        int i15 = i6;
                        List list22 = list2;
                        Modifier.Companion companion222 = Modifier.INSTANCE;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, companion222);
                        ComposeUiNode.Companion companion322 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor22 = companion322.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor22);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion322.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion322.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion322.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion322.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        composer2.startReplaceGroup(1390346787);
                        if (str.length() > 0) {
                            BentoAlerts2.m20854AlertBodyText5stqomU(str, i15, composer2, 0, 0);
                        }
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1390351170);
                        if (list22 != null) {
                            ImmutableList3 persistentList = extensions2.toPersistentList(list22);
                            HorizontalPadding horizontalPadding = HorizontalPadding.None;
                            composer2.startReplaceGroup(-1772220517);
                            SduiColumns.SduiColumn(persistentList, GenericActionDto.class, companion222, null, null, horizontalPadding, arrangement.getTop(), companion32.getStart(), true, composer2, 100859904, 0);
                            composer2.endReplaceGroup();
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                Modifier.Companion companion32 = Modifier.INSTANCE;
                bentoTheme = BentoTheme.INSTANCE;
                i7 = BentoTheme.$stable;
                Modifier modifierM4872backgroundbw27NRU$default22 = Background3.m4872backgroundbw27NRU$default(companion32, bentoTheme.getColors(composerStartRestartGroup, i7).m21371getBg0d7_KjU(), null, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default22);
                ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
                int i1422 = i6;
                Function0<ComposeUiNode> constructor22 = companion222.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy22, companion222.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap22, companion222.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion222.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public final <ActionT extends Parcelable> BentoAlertButton toAlertButton(Button<? extends ActionT> button, SduiActionHandler<? super ActionT> sduiActionHandler, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(button, "<this>");
        composer.startReplaceGroup(440333880);
        SduiActionHandler<? super ActionT> sduiActionHandler2 = (i2 & 1) != 0 ? null : sduiActionHandler;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(440333880, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert.toAlertButton (SduiAlert.kt:234)");
        }
        String label = button.getLabel();
        Function0<Unit> function0Handling = sduiActionHandler2 != null ? SduiActionHandler3.handling(sduiActionHandler2, button.getAction()) : null;
        composer.startReplaceGroup(-2040895787);
        if (function0Handling == null) {
            function0Handling = SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composer, 0), button.getAction());
        }
        composer.endReplaceGroup();
        BentoAlertButton bentoAlertButton = new BentoAlertButton(label, function0Handling, ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, button.getLogging_identifier(), null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null), toBentoButtonType$lib_sdui_externalRelease(button.getType()), null, false, 48, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bentoAlertButton;
    }

    public final BentoButtons.Type toBentoButtonType$lib_sdui_externalRelease(ButtonType buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[buttonType.ordinal()];
        if (i == 1) {
            return BentoButtons.Type.Primary;
        }
        if (i != 2) {
            return null;
        }
        return BentoButtons.Type.Secondary;
    }

    public final <ActionT> BentoAlertButton toAlertButton(ButtonDto buttonDto, Function1<? super ActionDto, ? extends ActionT> parseAction, SduiActionHandler<? super ActionT> sduiActionHandler, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(buttonDto, "<this>");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        composer.startReplaceGroup(50213996);
        SduiActionHandler<? super ActionT> sduiActionHandler2 = (i2 & 2) != 0 ? null : sduiActionHandler;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(50213996, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert.toAlertButton (SduiAlert.kt:267)");
        }
        ActionT actiontInvoke = parseAction.invoke(buttonDto.getAction());
        Function0<Unit> function0Handling = sduiActionHandler2 != null ? SduiActionHandler3.handling(sduiActionHandler2, actiontInvoke) : null;
        composer.startReplaceGroup(1011018059);
        if (function0Handling == null) {
            function0Handling = SduiActionHandler3.handling(actiontInvoke, SduiActionHandler3.currentActionHandler(composer, 0), DtoActionHandler2.currentDtoActionHandler(composer, 0));
        }
        Function0<Unit> function0 = function0Handling;
        composer.endReplaceGroup();
        String label = buttonDto.getLabel();
        Modifier.Companion companion = Modifier.INSTANCE;
        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
        String logging_identifier = buttonDto.getLogging_identifier();
        BentoAlertButton bentoAlertButton = new BentoAlertButton(label, function0, ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, logging_identifier != null ? new Component(Component.ComponentType.BUTTON, logging_identifier, null, 4, null) : null, null, 47, null), true, false, false, true, false, null, 108, null), null, null, false, 56, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bentoAlertButton;
    }

    public final <DtoT extends Dto3<?>> BentoAlertButton toAlertButton(ButtonDto buttonDto, GenericAlertMobilePresentationStyle alertType, Function1<? super ActionDto, ? extends DtoT> parseAction, DtoActionHandler<DtoT> dtoActionHandler, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(buttonDto, "<this>");
        Intrinsics.checkNotNullParameter(alertType, "alertType");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        composer.startReplaceGroup(-77562879);
        DtoActionHandler<DtoT> dtoActionHandler2 = (i2 & 4) != 0 ? null : dtoActionHandler;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-77562879, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert.toAlertButton (SduiAlert.kt:300)");
        }
        String label = buttonDto.getLabel();
        Function0 function0M15938handling1Vfn_Dk$default = dtoActionHandler2 != null ? DtoActionHandler2.m15938handling1Vfn_Dk$default(dtoActionHandler2, parseAction.invoke(buttonDto.getAction()), alertType, 0, 4, null) : null;
        composer.startReplaceGroup(-1523463640);
        if (function0M15938handling1Vfn_Dk$default == null) {
            function0M15938handling1Vfn_Dk$default = DtoActionHandler2.m15938handling1Vfn_Dk$default(DtoActionHandler2.currentDtoActionHandler(composer, 0), parseAction.invoke(buttonDto.getAction()), alertType, 0, 4, null);
        }
        Function0 function0 = function0M15938handling1Vfn_Dk$default;
        composer.endReplaceGroup();
        Modifier.Companion companion = Modifier.INSTANCE;
        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
        String logging_identifier = buttonDto.getLogging_identifier();
        BentoAlertButton bentoAlertButton = new BentoAlertButton(label, function0, ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, logging_identifier != null ? new Component(Component.ComponentType.BUTTON, logging_identifier, null, 4, null) : null, null, 47, null), true, false, false, true, false, null, 108, null), null, null, false, 56, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bentoAlertButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sheetListener$lambda$16(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sheetListener$lambda$17(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final <ActionT extends Parcelable> RhBottomSheetDialogFragmentHost.SheetListener sheetListener(final FragmentManager fragmentManager, Markwon markwon, GenericAlertContent<? extends ActionT> alert, SduiActionHandler<? super ActionT> actionHandler, Function0<Unit> onDismiss, Function1<? super String, Unit> onPrimaryButtonClick, Function1<? super String, Unit> onSecondaryButtonClick, boolean forCrypto, boolean forAchromatic, boolean isCancelable, RhButtonType overridePrimaryButtonType) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(alert, "alert");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onPrimaryButtonClick, "onPrimaryButtonClick");
        Intrinsics.checkNotNullParameter(onSecondaryButtonClick, "onSecondaryButtonClick");
        return sheetListener(markwon, alert, actionHandler, onDismiss, onPrimaryButtonClick, onSecondaryButtonClick, forCrypto, forAchromatic, isCancelable, overridePrimaryButtonType, new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SduiAlert.sheetListener$lambda$18(fragmentManager, (DialogFragment) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sheetListener$lambda$18(FragmentManager fragmentManager, DialogFragment fragment, String tag) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(tag, "tag");
        fragment.show(fragmentManager, tag);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sheetListener$lambda$19(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sheetListener$lambda$20(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final <ActionT extends Parcelable> RhBottomSheetDialogFragmentHost.SheetListener sheetListener(Markwon markwon, GenericAlertContent<? extends ActionT> alert, final SduiActionHandler<? super ActionT> actionHandler, Function0<Unit> onDismiss, final Function1<? super String, Unit> onPrimaryButtonClick, final Function1<? super String, Unit> onSecondaryButtonClick, boolean forCrypto, boolean forAchromatic, boolean isCancelable, RhButtonType overridePrimaryButtonType, Function2<? super DialogFragment, ? super String, Unit> show) {
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(alert, "alert");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onPrimaryButtonClick, "onPrimaryButtonClick");
        Intrinsics.checkNotNullParameter(onSecondaryButtonClick, "onSecondaryButtonClick");
        Intrinsics.checkNotNullParameter(show, "show");
        int i = sheetId;
        sheetId = i + 1;
        Object orNull = CollectionsKt.getOrNull(alert.getAction_buttons(), 0);
        Intrinsics.checkNotNull(orNull);
        final Button button = (Button) orNull;
        final Button button2 = (Button) CollectionsKt.getOrNull(alert.getAction_buttons(), 1);
        Function0 function0 = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SduiAlert.sheetListener$lambda$21(onPrimaryButtonClick, button, actionHandler);
            }
        };
        Function0 function02 = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SduiAlert.sheetListener$lambda$23(button2, onSecondaryButtonClick, actionHandler);
            }
        };
        ServerToBentoAssetMapper3.Companion companion = ServerToBentoAssetMapper3.INSTANCE;
        Pictogram pog = alert.getPog();
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = companion.fromServerValue(pog != null ? pog.getServerValue() : null);
        Integer numValueOf = serverToBentoAssetMapper3FromServerValue != null ? Integer.valueOf(serverToBentoAssetMapper3FromServerValue.getResourceId()) : null;
        List<UIComponent<ActionT>> body_components = alert.getBody_components();
        show.invoke((RhBottomSheetDialogFragment) RhBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(i, alert.getTitle(), null, new SpannableString(markwon.toMarkdown(alert.getBody_markdown())), body_components != null ? new SduiAlertParcelable(Boolean.valueOf(forAchromatic), extensions2.toPersistentList(body_components)) : null, button.getLabel(), overridePrimaryButtonType, button2 != null ? button2.getLabel() : null, numValueOf, false, false, null, null, null, forCrypto, forAchromatic, false, false, null, Boolean.valueOf(isCancelable), null, 1523204, null)), BOTTOM_SHEET_TAG);
        return new RhBottomSheetDialogFragmentHost.SheetListener(i, function0, function02, onDismiss);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sheetListener$lambda$21(Function1 function1, Button button, SduiActionHandler sduiActionHandler) {
        function1.invoke(button.getLogging_identifier());
        sduiActionHandler.mo15941handle(button.getAction());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sheetListener$lambda$23(Button button, Function1 function1, SduiActionHandler sduiActionHandler) {
        if (button != null) {
            function1.invoke(button.getLogging_identifier());
            sduiActionHandler.mo15941handle(button.getAction());
        }
        return Unit.INSTANCE;
    }

    public final void presentGenericAlertSheet(FragmentManager fragmentManager, GenericAlertContent<? extends GenericAction> alert) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(alert, "alert");
        ((GenericAlertSheetDialogFragment) GenericAlertSheetDialogFragment.INSTANCE.newInstance((Parcelable) new GenericAlertSheetDialogFragment.Args(alert))).show(fragmentManager, BOTTOM_SHEET_TAG);
    }

    public final void presentBuyingPowerHubAlertSheet(FragmentManager fragmentManager, GenericAlertContent<? extends BuyingPowerHubAction> alert) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(alert, "alert");
        ((BuyingPowerHubAlertSheetDialogFragment) BuyingPowerHubAlertSheetDialogFragment.INSTANCE.newInstance((Parcelable) new BuyingPowerHubAlertSheetDialogFragment.Args(alert))).show(fragmentManager, BOTTOM_SHEET_TAG);
    }

    public final void presentGoldHubAlertSheet(FragmentManager fragmentManager, GenericAlertContent<? extends GoldHubAction> alert, SduiActionHandler<? super GoldHubAction> actionHandler, Function0<Unit> onDismiss) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(alert, "alert");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        GoldHubAlertSheetDialogFragment goldHubAlertSheetDialogFragment = (GoldHubAlertSheetDialogFragment) GoldHubAlertSheetDialogFragment.INSTANCE.newInstance((Parcelable) new GoldHubAlertSheetDialogFragment.Args(alert));
        goldHubAlertSheetDialogFragment.setActionHandler(actionHandler);
        goldHubAlertSheetDialogFragment.setOnDismiss(onDismiss);
        goldHubAlertSheetDialogFragment.show(fragmentManager, BOTTOM_SHEET_TAG);
    }
}
