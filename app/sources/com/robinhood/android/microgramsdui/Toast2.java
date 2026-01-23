package com.robinhood.android.microgramsdui;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIcon2;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.compose.bento.component.BentoToast2;
import com.robinhood.compose.bento.component.BentoToastAction;
import com.robinhood.microgram.sdui.MicrogramAction;
import com.robinhood.microgram.sdui.Toast3;
import com.robinhood.microgram.sdui.ToastData;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import microgram.p507ui.p508v1.ActionDto;
import microgram.p507ui.p508v1.ToastDto;
import rh_server_driven_ui.p531v1.IconDto;

/* compiled from: Toast.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001an\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00072'\u0010\b\u001a#\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\t2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\u0010\u001a\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007H\u0002\u001a0\u0010\u0013\u001a\u00020\u0014*\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0004j\u0002`\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u0010H\u0002\u001a\u0018\u0010\u0019\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001a0\u0004H\u0002¨\u0006\u001b"}, m3636d2 = {"showToast", "", "Lcom/robinhood/compose/bento/component/BentoToastHost;", "toast", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/ToastData;", "Lmicrogram/ui/v1/ToastDto;", "Lcom/robinhood/microgram/sdui/AnyToast;", "onAction", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "toastId", "Lcom/robinhood/microgram/sdui/MicrogramAction;", "onDismiss", "Lkotlin/Function1;", "leadingIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "toBentoToastAction", "Lcom/robinhood/compose/bento/component/BentoToastAction;", "Lcom/robinhood/microgram/sdui/ToastData$ActionData;", "Lmicrogram/ui/v1/ToastDto$ActionDataDto;", "Lcom/robinhood/microgram/sdui/AnyToastActionData;", "onClick", "toMicrogramAction", "Lmicrogram/ui/v1/ActionDto;", "lib-microgram-sdui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.microgramsdui.ToastKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class Toast2 {
    public static final void showToast(BentoToast2 bentoToast2, final UiObject<ToastData, ToastDto> toast, final Function2<? super String, ? super MicrogramAction, Unit> onAction, final Function1<? super String, Unit> onDismiss) {
        Intrinsics.checkNotNullParameter(bentoToast2, "<this>");
        Intrinsics.checkNotNullParameter(toast, "toast");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        String text = Toast3.getText(toast);
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2LeadingIcon = leadingIcon(toast);
        UiObject<ToastData.ActionData, ToastDto.ActionDataDto> uiObjectAnyToastAction = Toast3.anyToastAction(toast);
        BentoToast2.showToast$default(bentoToast2, text, 0, serverToBentoAssetMapper2LeadingIcon, uiObjectAnyToastAction != null ? toBentoToastAction(uiObjectAnyToastAction, new Function1() { // from class: com.robinhood.android.microgramsdui.ToastKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Toast2.showToast$lambda$0(onAction, toast, (MicrogramAction) obj);
            }
        }) : null, new Function0() { // from class: com.robinhood.android.microgramsdui.ToastKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Toast2.showToast$lambda$1(onDismiss, toast);
            }
        }, false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showToast$lambda$0(Function2 function2, UiObject uiObject, MicrogramAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function2.invoke(Toast3.getId(uiObject), it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showToast$lambda$1(Function1 function1, UiObject uiObject) {
        function1.invoke(Toast3.getId(uiObject));
        return Unit.INSTANCE;
    }

    private static final ServerToBentoAssetMapper2 leadingIcon(UiObject<ToastData, ToastDto> uiObject) {
        if (uiObject instanceof UiObject.Legacy) {
            Icon leadingIcon = ((ToastData) ((UiObject.Legacy) uiObject).getValue()).getLeadingIcon();
            if (leadingIcon != null) {
                return SduiIcon2.toBentoAsset(leadingIcon);
            }
            return null;
        }
        if (!(uiObject instanceof UiObject.Idl)) {
            throw new NoWhenBranchMatchedException();
        }
        IconDto leading_icon = ((ToastDto) ((UiObject.Idl) uiObject).getValue()).getLeading_icon();
        if (leading_icon != null) {
            return SduiIcon2.toBentoAsset(leading_icon);
        }
        return null;
    }

    private static final BentoToastAction toBentoToastAction(final UiObject<ToastData.ActionData, ToastDto.ActionDataDto> uiObject, final Function1<? super MicrogramAction, Unit> function1) {
        return new BentoToastAction(Toast3.getTitle(uiObject), false, new Function0() { // from class: com.robinhood.android.microgramsdui.ToastKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Toast2.toBentoToastAction$lambda$2(uiObject, function1);
            }
        }, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toBentoToastAction$lambda$2(UiObject uiObject, Function1 function1) {
        MicrogramAction microgramAction;
        UiObject<MicrogramAction, ActionDto> uiObjectAnyToastActionDataAction = Toast3.anyToastActionDataAction(uiObject);
        if (uiObjectAnyToastActionDataAction != null && (microgramAction = toMicrogramAction(uiObjectAnyToastActionDataAction)) != null) {
            function1.invoke(microgramAction);
        }
        return Unit.INSTANCE;
    }

    private static final MicrogramAction toMicrogramAction(UiObject<MicrogramAction, ActionDto> uiObject) {
        if (uiObject instanceof UiObject.Legacy) {
            return (MicrogramAction) ((UiObject.Legacy) uiObject).getValue();
        }
        if (uiObject instanceof UiObject.Idl) {
            return new MicrogramAction(((ActionDto) ((UiObject.Idl) uiObject).getValue()).getIdentifier());
        }
        throw new NoWhenBranchMatchedException();
    }
}
