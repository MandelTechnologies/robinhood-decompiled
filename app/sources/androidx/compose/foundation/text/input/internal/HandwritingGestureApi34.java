package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p011ui.graphics.RectHelper_androidKt;
import androidx.compose.p011ui.platform.ViewConfiguration;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextGranularity;
import androidx.compose.p011ui.text.TextInclusionStrategy;
import androidx.compose.p011ui.text.TextLayoutInput;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRange2;
import androidx.compose.p011ui.text.input.CommitTextCommand;
import androidx.compose.p011ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.p011ui.text.input.EditCommand;
import androidx.compose.p011ui.text.input.SetSelectionCommand;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* compiled from: HandwritingGesture.android.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0011\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0016\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001b\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001a2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001a2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010 \u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b \u0010!J%\u0010\"\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\"\u0010#JA\u0010'\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010%2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b'\u0010(J9\u0010*\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020)2\b\u0010&\u001a\u0004\u0018\u00010%2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b*\u0010+JA\u0010-\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020,2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010%2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b-\u0010.J3\u00101\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\r2\u0006\u0010\u0015\u001a\u0002002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b1\u00102J8\u00107\u001a\u00020\u000b2\u0006\u00104\u001a\u0002032\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002ø\u0001\u0000¢\u0006\u0004\b5\u00106J>\u0010<\u001a\u00020\u000b2\u0006\u00104\u001a\u0002032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u00109\u001a\u0002082\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002ø\u0001\u0000¢\u0006\u0004\b:\u0010;J+\u0010>\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020=2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b>\u0010?J\u0019\u0010C\u001a\u00020@*\u00020\rH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bA\u0010BJC\u0010F\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020=2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010&\u001a\u0004\u0018\u00010%2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0000¢\u0006\u0004\bD\u0010EJ/\u0010L\u001a\u000208*\u00020\u00042\u0006\u0010\u0006\u001a\u00020G2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010I\u001a\u0004\u0018\u00010HH\u0000¢\u0006\u0004\bJ\u0010K\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, m3636d2 = {"Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;", "", "<init>", "()V", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "Landroid/view/inputmethod/SelectGesture;", "gesture", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "textSelectionManager", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/EditCommand;", "", "editCommandConsumer", "", "performSelectGesture", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)I", "textFieldSelectionManager", "previewSelectGesture", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "Landroid/view/inputmethod/DeleteGesture;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "performDeleteGesture", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;)I", "previewDeleteGesture", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "Landroid/view/inputmethod/SelectRangeGesture;", "performSelectRangeGesture", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)I", "previewSelectRangeGesture", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "Landroid/view/inputmethod/DeleteRangeGesture;", "performDeleteRangeGesture", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;)I", "previewDeleteRangeGesture", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "Landroid/view/inputmethod/JoinOrSplitGesture;", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "performJoinOrSplitGesture", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/JoinOrSplitGesture;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I", "Landroid/view/inputmethod/InsertGesture;", "performInsertGesture", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/InsertGesture;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I", "Landroid/view/inputmethod/RemoveSpaceGesture;", "performRemoveSpaceGesture", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/RemoveSpaceGesture;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I", "offset", "", "performInsertionOnLegacyTextField", "(ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/text/TextRange;", "range", "performSelectionOnLegacyTextField-8ffj60Q", "(JLandroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)V", "performSelectionOnLegacyTextField", "", "adjustRange", "performDeletionOnLegacyTextField-vJH6DeI", "(JLandroidx/compose/ui/text/AnnotatedString;ZLkotlin/jvm/functions/Function1;)V", "performDeletionOnLegacyTextField", "Landroid/view/inputmethod/HandwritingGesture;", "fallbackOnLegacyTextField", "(Landroid/view/inputmethod/HandwritingGesture;Lkotlin/jvm/functions/Function1;)I", "Landroidx/compose/ui/text/TextGranularity;", "toTextGranularity-NUwxegE", "(I)I", "toTextGranularity", "performHandwritingGesture$foundation_release", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I", "performHandwritingGesture", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "previewHandwritingGesture$foundation_release", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroid/os/CancellationSignal;)Z", "previewHandwritingGesture", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class HandwritingGestureApi34 {
    public static final HandwritingGestureApi34 INSTANCE = new HandwritingGestureApi34();

    private HandwritingGestureApi34() {
    }

    public final int performHandwritingGesture$foundation_release(LegacyTextFieldState legacyTextFieldState, HandwritingGesture handwritingGesture, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration, Function1<? super EditCommand, Unit> function1) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return 3;
        }
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (!Intrinsics.areEqual(untransformedText, (layoutResult == null || (value = layoutResult.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return 3;
        }
        if (HandwritingGestureApi34$$ExternalSyntheticApiModelOutline0.m117m(handwritingGesture)) {
            return performSelectGesture(legacyTextFieldState, HandwritingGestureApi34$$ExternalSyntheticApiModelOutline1.m118m(handwritingGesture), textFieldSelectionManager, function1);
        }
        if (HandwritingGestureApi34$$ExternalSyntheticApiModelOutline2.m129m(handwritingGesture)) {
            return performDeleteGesture(legacyTextFieldState, HandwritingGestureApi34$$ExternalSyntheticApiModelOutline3.m140m(handwritingGesture), untransformedText, function1);
        }
        if (HandwritingGestureApi34$$ExternalSyntheticApiModelOutline4.m142m(handwritingGesture)) {
            return performSelectRangeGesture(legacyTextFieldState, HandwritingGestureApi34$$ExternalSyntheticApiModelOutline5.m143m(handwritingGesture), textFieldSelectionManager, function1);
        }
        if (HandwritingGestureApi34$$ExternalSyntheticApiModelOutline6.m144m(handwritingGesture)) {
            return performDeleteRangeGesture(legacyTextFieldState, HandwritingGestureApi34$$ExternalSyntheticApiModelOutline7.m145m(handwritingGesture), untransformedText, function1);
        }
        if (HandwritingGestureApi34$$ExternalSyntheticApiModelOutline17.m126m(handwritingGesture)) {
            return performJoinOrSplitGesture(legacyTextFieldState, HandwritingGestureApi34$$ExternalSyntheticApiModelOutline18.m127m(handwritingGesture), untransformedText, viewConfiguration, function1);
        }
        if (HandwritingGestureApi34$$ExternalSyntheticApiModelOutline13.m122m(handwritingGesture)) {
            return performInsertGesture(legacyTextFieldState, HandwritingGestureApi34$$ExternalSyntheticApiModelOutline14.m123m(handwritingGesture), viewConfiguration, function1);
        }
        if (HandwritingGestureApi34$$ExternalSyntheticApiModelOutline15.m124m(handwritingGesture)) {
            return performRemoveSpaceGesture(legacyTextFieldState, HandwritingGestureApi34$$ExternalSyntheticApiModelOutline16.m125m(handwritingGesture), untransformedText, viewConfiguration, function1);
        }
        return 2;
    }

    public final boolean previewHandwritingGesture$foundation_release(LegacyTextFieldState legacyTextFieldState, PreviewableHandwritingGesture previewableHandwritingGesture, final TextFieldSelectionManager textFieldSelectionManager, CancellationSignal cancellationSignal) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return false;
        }
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (!Intrinsics.areEqual(untransformedText, (layoutResult == null || (value = layoutResult.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return false;
        }
        if (HandwritingGestureApi34$$ExternalSyntheticApiModelOutline0.m117m(previewableHandwritingGesture)) {
            previewSelectGesture(legacyTextFieldState, HandwritingGestureApi34$$ExternalSyntheticApiModelOutline1.m118m(previewableHandwritingGesture), textFieldSelectionManager);
        } else if (HandwritingGestureApi34$$ExternalSyntheticApiModelOutline2.m129m(previewableHandwritingGesture)) {
            previewDeleteGesture(legacyTextFieldState, HandwritingGestureApi34$$ExternalSyntheticApiModelOutline3.m140m(previewableHandwritingGesture), textFieldSelectionManager);
        } else if (HandwritingGestureApi34$$ExternalSyntheticApiModelOutline4.m142m(previewableHandwritingGesture)) {
            previewSelectRangeGesture(legacyTextFieldState, HandwritingGestureApi34$$ExternalSyntheticApiModelOutline5.m143m(previewableHandwritingGesture), textFieldSelectionManager);
        } else {
            if (!HandwritingGestureApi34$$ExternalSyntheticApiModelOutline6.m144m(previewableHandwritingGesture)) {
                return false;
            }
            previewDeleteRangeGesture(legacyTextFieldState, HandwritingGestureApi34$$ExternalSyntheticApiModelOutline7.m145m(previewableHandwritingGesture), textFieldSelectionManager);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$$ExternalSyntheticLambda31
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                HandwritingGestureApi34.previewHandwritingGesture$lambda$9(textFieldSelectionManager);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void previewHandwritingGesture$lambda$9(TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.clearPreviewHighlight$foundation_release();
        }
    }

    private final int performSelectGesture(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager, Function1<? super EditCommand, Unit> function1) {
        long jM5470getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m5470getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m5457toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m7640getCollapsedimpl(jM5470getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallbackOnLegacyTextField(HandwritingGestureApi34$$ExternalSyntheticApiModelOutline24.m134m(selectGesture), function1);
        }
        m5456performSelectionOnLegacyTextField8ffj60Q(jM5470getRangeForScreenRectOH9lIzo, textFieldSelectionManager, function1);
        return 1;
    }

    private final void previewSelectGesture(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m5534setSelectionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m5470getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m5457toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter()));
        }
    }

    private final int performDeleteGesture(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, AnnotatedString annotatedString, Function1<? super EditCommand, Unit> function1) {
        int iM5457toTextGranularityNUwxegE = m5457toTextGranularityNUwxegE(deleteGesture.getGranularity());
        long jM5470getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m5470getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), iM5457toTextGranularityNUwxegE, TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m7640getCollapsedimpl(jM5470getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallbackOnLegacyTextField(HandwritingGestureApi34$$ExternalSyntheticApiModelOutline24.m134m(deleteGesture), function1);
        }
        m5455performDeletionOnLegacyTextFieldvJH6DeI(jM5470getRangeForScreenRectOH9lIzo, annotatedString, TextGranularity.m7613equalsimpl0(iM5457toTextGranularityNUwxegE, TextGranularity.INSTANCE.m7615getWordDRrd7Zo()), function1);
        return 1;
    }

    private final void previewDeleteGesture(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m5533setDeletionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m5470getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), m5457toTextGranularityNUwxegE(deleteGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter()));
        }
    }

    private final int performSelectRangeGesture(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager, Function1<? super EditCommand, Unit> function1) {
        long jM5471getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m5471getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m5457toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m7640getCollapsedimpl(jM5471getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallbackOnLegacyTextField(HandwritingGestureApi34$$ExternalSyntheticApiModelOutline24.m134m(selectRangeGesture), function1);
        }
        m5456performSelectionOnLegacyTextField8ffj60Q(jM5471getRangeForScreenRectsO048IG0, textFieldSelectionManager, function1);
        return 1;
    }

    private final void previewSelectRangeGesture(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m5534setSelectionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m5471getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m5457toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter()));
        }
    }

    private final int performDeleteRangeGesture(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, AnnotatedString annotatedString, Function1<? super EditCommand, Unit> function1) {
        int iM5457toTextGranularityNUwxegE = m5457toTextGranularityNUwxegE(deleteRangeGesture.getGranularity());
        long jM5471getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m5471getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), iM5457toTextGranularityNUwxegE, TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m7640getCollapsedimpl(jM5471getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallbackOnLegacyTextField(HandwritingGestureApi34$$ExternalSyntheticApiModelOutline24.m134m(deleteRangeGesture), function1);
        }
        m5455performDeletionOnLegacyTextFieldvJH6DeI(jM5471getRangeForScreenRectsO048IG0, annotatedString, TextGranularity.m7613equalsimpl0(iM5457toTextGranularityNUwxegE, TextGranularity.INSTANCE.m7615getWordDRrd7Zo()), function1);
        return 1;
    }

    private final void previewDeleteRangeGesture(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m5533setDeletionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m5471getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), m5457toTextGranularityNUwxegE(deleteRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter()));
        }
    }

    private final int performJoinOrSplitGesture(LegacyTextFieldState legacyTextFieldState, JoinOrSplitGesture joinOrSplitGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, Function1<? super EditCommand, Unit> function1) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        if (viewConfiguration != null) {
            int iM5466getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m5466getOffsetForHandwritingGestured4ec7I(legacyTextFieldState, HandwritingGesture_androidKt.toOffset(joinOrSplitGesture.getJoinOrSplitPoint()), viewConfiguration);
            if (iM5466getOffsetForHandwritingGestured4ec7I != -1 && ((layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null || !HandwritingGesture_androidKt.isBiDiBoundary(value, iM5466getOffsetForHandwritingGestured4ec7I))) {
                long jRangeOfWhitespaces = HandwritingGesture_androidKt.rangeOfWhitespaces(annotatedString, iM5466getOffsetForHandwritingGestured4ec7I);
                if (TextRange.m7640getCollapsedimpl(jRangeOfWhitespaces)) {
                    performInsertionOnLegacyTextField(TextRange.m7646getStartimpl(jRangeOfWhitespaces), PlaceholderUtils.XXShortPlaceholderText, function1);
                } else {
                    m5455performDeletionOnLegacyTextFieldvJH6DeI(jRangeOfWhitespaces, annotatedString, false, function1);
                }
                return 1;
            }
            return fallbackOnLegacyTextField(HandwritingGestureApi34$$ExternalSyntheticApiModelOutline24.m134m(joinOrSplitGesture), function1);
        }
        return fallbackOnLegacyTextField(HandwritingGestureApi34$$ExternalSyntheticApiModelOutline24.m134m(joinOrSplitGesture), function1);
    }

    private final int performInsertGesture(LegacyTextFieldState legacyTextFieldState, InsertGesture insertGesture, ViewConfiguration viewConfiguration, Function1<? super EditCommand, Unit> function1) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        if (viewConfiguration != null) {
            int iM5466getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m5466getOffsetForHandwritingGestured4ec7I(legacyTextFieldState, HandwritingGesture_androidKt.toOffset(insertGesture.getInsertionPoint()), viewConfiguration);
            if (iM5466getOffsetForHandwritingGestured4ec7I == -1 || ((layoutResult = legacyTextFieldState.getLayoutResult()) != null && (value = layoutResult.getValue()) != null && HandwritingGesture_androidKt.isBiDiBoundary(value, iM5466getOffsetForHandwritingGestured4ec7I))) {
                return fallbackOnLegacyTextField(HandwritingGestureApi34$$ExternalSyntheticApiModelOutline24.m134m(insertGesture), function1);
            }
            performInsertionOnLegacyTextField(iM5466getOffsetForHandwritingGestured4ec7I, insertGesture.getTextToInsert(), function1);
            return 1;
        }
        return fallbackOnLegacyTextField(HandwritingGestureApi34$$ExternalSyntheticApiModelOutline24.m134m(insertGesture), function1);
    }

    private final int performRemoveSpaceGesture(LegacyTextFieldState legacyTextFieldState, RemoveSpaceGesture removeSpaceGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, Function1<? super EditCommand, Unit> function1) {
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        long jM5468getRangeForRemoveSpaceGesture5iVPX68 = HandwritingGesture_androidKt.m5468getRangeForRemoveSpaceGesture5iVPX68(layoutResult != null ? layoutResult.getValue() : null, HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getStartPoint()), HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getEndPoint()), legacyTextFieldState.getLayoutCoordinates(), viewConfiguration);
        if (TextRange.m7640getCollapsedimpl(jM5468getRangeForRemoveSpaceGesture5iVPX68)) {
            return INSTANCE.fallbackOnLegacyTextField(HandwritingGestureApi34$$ExternalSyntheticApiModelOutline24.m134m(removeSpaceGesture), function1);
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = -1;
        String strReplace = new Regex("\\s+").replace(TextRange2.m7653substringFDrldGo(annotatedString, jM5468getRangeForRemoveSpaceGesture5iVPX68), new Function1<MatchResult, CharSequence>() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$performRemoveSpaceGesture$newText$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(MatchResult matchResult) {
                Ref.IntRef intRef3 = intRef;
                if (intRef3.element == -1) {
                    intRef3.element = matchResult.getRange().getFirst();
                }
                intRef2.element = matchResult.getRange().getLast() + 1;
                return "";
            }
        });
        if (intRef.element == -1 || intRef2.element == -1) {
            return fallbackOnLegacyTextField(HandwritingGestureApi34$$ExternalSyntheticApiModelOutline24.m134m(removeSpaceGesture), function1);
        }
        int iM7646getStartimpl = TextRange.m7646getStartimpl(jM5468getRangeForRemoveSpaceGesture5iVPX68) + intRef.element;
        int iM7646getStartimpl2 = TextRange.m7646getStartimpl(jM5468getRangeForRemoveSpaceGesture5iVPX68) + intRef2.element;
        String strSubstring = strReplace.substring(intRef.element, strReplace.length() - (TextRange.m7642getLengthimpl(jM5468getRangeForRemoveSpaceGesture5iVPX68) - intRef2.element));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        function1.invoke(HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(iM7646getStartimpl, iM7646getStartimpl2), new CommitTextCommand(strSubstring, 1)));
        return 1;
    }

    private final void performInsertionOnLegacyTextField(int offset, String text, Function1<? super EditCommand, Unit> editCommandConsumer) {
        editCommandConsumer.invoke(HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(offset, offset), new CommitTextCommand(text, 1)));
    }

    /* renamed from: performSelectionOnLegacyTextField-8ffj60Q, reason: not valid java name */
    private final void m5456performSelectionOnLegacyTextField8ffj60Q(long range, TextFieldSelectionManager textSelectionManager, Function1<? super EditCommand, Unit> editCommandConsumer) {
        editCommandConsumer.invoke(new SetSelectionCommand(TextRange.m7646getStartimpl(range), TextRange.m7641getEndimpl(range)));
        if (textSelectionManager != null) {
            textSelectionManager.enterSelectionMode$foundation_release(true);
        }
    }

    /* renamed from: performDeletionOnLegacyTextField-vJH6DeI, reason: not valid java name */
    private final void m5455performDeletionOnLegacyTextFieldvJH6DeI(long range, AnnotatedString text, boolean adjustRange, Function1<? super EditCommand, Unit> editCommandConsumer) {
        if (adjustRange) {
            range = HandwritingGesture_androidKt.m5463adjustHandwritingDeleteGestureRange72CqOWE(range, text);
        }
        editCommandConsumer.invoke(HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(TextRange.m7641getEndimpl(range), TextRange.m7641getEndimpl(range)), new DeleteSurroundingTextCommand(TextRange.m7642getLengthimpl(range), 0)));
    }

    private final int fallbackOnLegacyTextField(HandwritingGesture gesture, Function1<? super EditCommand, Unit> editCommandConsumer) {
        String fallbackText = gesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        editCommandConsumer.invoke(new CommitTextCommand(fallbackText, 1));
        return 5;
    }

    /* renamed from: toTextGranularity-NUwxegE, reason: not valid java name */
    private final int m5457toTextGranularityNUwxegE(int i) {
        if (i == 1) {
            return TextGranularity.INSTANCE.m7615getWordDRrd7Zo();
        }
        if (i == 2) {
            return TextGranularity.INSTANCE.m7614getCharacterDRrd7Zo();
        }
        return TextGranularity.INSTANCE.m7614getCharacterDRrd7Zo();
    }
}
