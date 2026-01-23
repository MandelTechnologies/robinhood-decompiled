package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.handwriting.StylusHandwriting2;
import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifier;
import androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode3;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter_androidKt;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.SelectionGestures3;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandles2;
import androidx.compose.foundation.text.selection.SelectionHandles3;
import androidx.compose.foundation.text.selection.SelectionHandles5;
import androidx.compose.foundation.text.selection.SimpleLayout;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColors2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.input.key.KeyEvent;
import androidx.compose.p011ui.input.key.KeyInputModifier2;
import androidx.compose.p011ui.input.pointer.PointerIcon5;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.AlignmentLineKt;
import androidx.compose.p011ui.layout.IntrinsicMeasurable;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.Clipboard;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.SoftwareKeyboardController;
import androidx.compose.p011ui.platform.TextToolbar;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.input.ImeOptions;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.p011ui.text.input.OffsetMapping;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.input.TextInputService;
import androidx.compose.p011ui.text.input.TextInputService3;
import androidx.compose.p011ui.text.input.TransformedText;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.input.VisualTransformation2;
import androidx.compose.p011ui.text.style.ResolvedTextDirection;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl2;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import com.plaid.internal.EnumC7081g;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples3;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: CoreTextField.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001aò\u0001\u0010#\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00112)\b\u0002\u0010 \u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!H\u0001¢\u0006\u0004\b#\u0010$\u001a-\u0010(\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cH\u0003¢\u0006\u0004\b(\u0010)\u001a#\u0010,\u001a\u00020\u0005*\u00020\u00052\u0006\u0010+\u001a\u00020*2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b,\u0010-\u001a'\u00101\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u0011H\u0000¢\u0006\u0004\b1\u00102\u001a7\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u0002032\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108\u001a\u0017\u00109\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b9\u0010:\u001a4\u0010?\u001a\u00020\u0003*\u00020;2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\u000b2\u0006\u00106\u001a\u000205H\u0080@¢\u0006\u0004\b?\u0010@\u001a\u001f\u0010B\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%2\u0006\u0010A\u001a\u00020\u0011H\u0003¢\u0006\u0004\bB\u0010C\u001a\u0017\u0010D\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\bD\u0010E\u001a'\u0010F\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\bF\u0010G¨\u0006I²\u0006\f\u0010H\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, m3636d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/ui/text/TextLayoutResult;", "onTextLayout", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "enabled", "readOnly", "Lkotlin/Function0;", "Lkotlin/ParameterName;", "name", "innerTextField", "decorationBox", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "textScrollerPosition", "CoreTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/foundation/text/TextFieldScrollerPosition;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "content", "CoreTextFieldRootBox", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "state", "previewKeyEventToDeselectOnBack", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "allowKeyboard", "tapToFocus", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/focus/FocusRequester;Z)V", "Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "startInputSession", "(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/text/input/OffsetMapping;)V", "endInputSession", "(Landroidx/compose/foundation/text/LegacyTextFieldState;)V", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "Landroidx/compose/foundation/text/TextDelegate;", "textDelegate", "textLayoutResult", "bringSelectionEndIntoView", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "show", "SelectionToolbarAndHandles", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLandroidx/compose/runtime/Composer;I)V", "TextFieldCursorHandle", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "notifyFocusedRect", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;)V", "writeable", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CoreTextFieldKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CoreTextField$lambda$11(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0903  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0946  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x099b  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x09f8  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0a4b  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0a91  */
    /* JADX WARN: Removed duplicated region for block: B:497:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CoreTextField(final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, Modifier modifier, TextStyle textStyle, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> function12, InteractionSource3 interactionSource3, Brush brush, boolean z, int i, int i2, ImeOptions imeOptions, KeyboardActions keyboardActions, boolean z2, boolean z3, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, TextFieldScrollerPosition textFieldScrollerPosition, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        Modifier modifier2;
        int i8;
        TextStyle textStyle2;
        int i9;
        VisualTransformation visualTransformation2;
        int i10;
        Function1<? super TextLayoutResult, Unit> function13;
        int i11;
        InteractionSource3 interactionSource32;
        int i12;
        final Brush brush2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        final boolean z4;
        final boolean z5;
        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function32;
        final TextFieldScrollerPosition textFieldScrollerPosition2;
        final VisualTransformation visualTransformation3;
        final InteractionSource3 interactionSource33;
        final Function1<? super TextLayoutResult, Unit> function14;
        Composer composer2;
        final TextStyle textStyle3;
        final Modifier modifier3;
        final int i27;
        final int i28;
        final ImeOptions imeOptions2;
        final KeyboardActions keyboardActions2;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composer3;
        Brush solidColor;
        ImeOptions imeOptions3;
        KeyboardActions keyboardActions3;
        boolean z7;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3M5343getLambda1$foundation_release;
        VisualTransformation visualTransformation4;
        Modifier modifier4;
        ImeOptions imeOptions4;
        boolean z8;
        final Function1<? super TextLayoutResult, Unit> function15;
        int i29;
        boolean z9;
        InteractionSource3 interactionSource34;
        int i30;
        int i31;
        TextFieldScrollerPosition textFieldScrollerPosition3;
        boolean z10;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        boolean z11;
        Orientation orientation;
        Modifier modifier5;
        TextStyle textStyle4;
        final Orientation orientation2;
        TextFieldScrollerPosition textFieldScrollerPosition4;
        InteractionSource3 interactionSource35;
        LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter;
        AnnotatedString annotatedString;
        TextStyle textStyle5;
        Density density;
        FontFamily.Resolver resolver;
        FocusManager focusManager;
        UndoManager undoManager;
        boolean z12;
        boolean zChangedInstance;
        Object objRememberedValue4;
        final LegacyTextFieldState legacyTextFieldState;
        TextInputService textInputService;
        final TextFieldValue textFieldValue2;
        ImeOptions imeOptions5;
        final TextFieldSelectionManager textFieldSelectionManager;
        BringIntoViewRequester bringIntoViewRequester;
        TextInputService textInputService2;
        boolean z13;
        boolean z14;
        Object objRememberedValue5;
        SnapshotState4 snapshotState4;
        final TextInputService textInputService3;
        boolean zChangedInstance2;
        Object objRememberedValue6;
        boolean zChangedInstance3;
        Object objRememberedValue7;
        final LegacyTextFieldState legacyTextFieldState2;
        FocusRequester focusRequester;
        boolean z15;
        final OffsetMapping offsetMapping;
        final boolean z16;
        boolean zChangedInstance4;
        Object objRememberedValue8;
        boolean zChangedInstance5;
        Object objRememberedValue9;
        boolean z17;
        boolean zChangedInstance6;
        Modifier modifier6;
        boolean zChangedInstance7;
        Object objRememberedValue10;
        final boolean z18;
        final LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter2;
        boolean zChanged;
        Object objRememberedValue11;
        final long value;
        boolean zChangedInstance8;
        Object objRememberedValue12;
        boolean z19;
        Composer composerStartRestartGroup = composer.startRestartGroup(-244533042);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(textFieldValue) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i6 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else {
                if ((i3 & 384) == 0) {
                    modifier2 = modifier;
                    i6 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        textStyle2 = textStyle;
                        i6 |= composerStartRestartGroup.changed(textStyle2) ? 2048 : 1024;
                    }
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else {
                        if ((i3 & 24576) == 0) {
                            visualTransformation2 = visualTransformation;
                            i6 |= composerStartRestartGroup.changed(visualTransformation2) ? 16384 : 8192;
                        }
                        i10 = i5 & 32;
                        if (i10 != 0) {
                            i6 |= 196608;
                            function13 = function12;
                        } else {
                            function13 = function12;
                            if ((i3 & 196608) == 0) {
                                i6 |= composerStartRestartGroup.changedInstance(function13) ? 131072 : 65536;
                            }
                        }
                        i11 = i5 & 64;
                        if (i11 != 0) {
                            i6 |= 1572864;
                            interactionSource32 = interactionSource3;
                        } else {
                            interactionSource32 = interactionSource3;
                            if ((i3 & 1572864) == 0) {
                                i6 |= composerStartRestartGroup.changed(interactionSource32) ? 1048576 : 524288;
                            }
                        }
                        i12 = i5 & 128;
                        if (i12 != 0) {
                            i6 |= 12582912;
                            brush2 = brush;
                        } else {
                            brush2 = brush;
                            if ((i3 & 12582912) == 0) {
                                i6 |= composerStartRestartGroup.changed(brush2) ? 8388608 : 4194304;
                            }
                        }
                        i13 = i5 & 256;
                        if (i13 != 0) {
                            i6 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i6 |= composerStartRestartGroup.changed(z) ? 67108864 : 33554432;
                        }
                        i14 = i5 & 512;
                        if (i14 == 0) {
                            if ((i3 & 805306368) == 0) {
                                i15 = i14;
                                i6 |= composerStartRestartGroup.changed(i) ? 536870912 : 268435456;
                            }
                            i16 = i5 & 1024;
                            if (i16 == 0) {
                                i18 = i4 | 6;
                                i17 = i16;
                            } else if ((i4 & 6) == 0) {
                                i17 = i16;
                                i18 = i4 | (composerStartRestartGroup.changed(i2) ? 4 : 2);
                            } else {
                                i17 = i16;
                                i18 = i4;
                            }
                            if ((i4 & 48) == 0) {
                                i18 |= ((i5 & 2048) == 0 && composerStartRestartGroup.changed(imeOptions)) ? 32 : 16;
                            }
                            int i32 = i18;
                            i19 = i5 & 4096;
                            if (i19 == 0) {
                                i20 = i32 | 384;
                            } else if ((i4 & 384) == 0) {
                                i20 = i32 | (composerStartRestartGroup.changed(keyboardActions) ? 256 : 128);
                            } else {
                                i20 = i32;
                            }
                            i21 = i5 & 8192;
                            if (i21 == 0) {
                                i22 = i20 | 3072;
                            } else {
                                int i33 = i20;
                                if ((i4 & 3072) == 0) {
                                    i22 = i33 | (composerStartRestartGroup.changed(z2) ? 2048 : 1024);
                                } else {
                                    i22 = i33;
                                }
                            }
                            i23 = i5 & 16384;
                            if (i23 == 0) {
                                i24 = i22 | 24576;
                            } else {
                                int i34 = i22;
                                if ((i4 & 24576) == 0) {
                                    i24 = i34 | (composerStartRestartGroup.changed(z3) ? 16384 : 8192);
                                } else {
                                    i24 = i34;
                                }
                            }
                            i25 = i5 & 32768;
                            if (i25 == 0) {
                                i24 |= 196608;
                            } else if ((i4 & 196608) == 0) {
                                i24 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
                            }
                            i26 = i5 & 65536;
                            if (i26 == 0) {
                                i24 |= 1572864;
                            } else if ((i4 & 1572864) == 0) {
                                i24 |= composerStartRestartGroup.changed(textFieldScrollerPosition) ? 1048576 : 524288;
                            }
                            if (composerStartRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i24 & 599187) != 599186, i6 & 1)) {
                                composerStartRestartGroup.skipToGroupEnd();
                                z4 = z;
                                z5 = z2;
                                function32 = function3;
                                textFieldScrollerPosition2 = textFieldScrollerPosition;
                                visualTransformation3 = visualTransformation2;
                                interactionSource33 = interactionSource32;
                                function14 = function13;
                                composer2 = composerStartRestartGroup;
                                textStyle3 = textStyle2;
                                modifier3 = modifier2;
                                i27 = i;
                                i28 = i2;
                                imeOptions2 = imeOptions;
                                keyboardActions2 = keyboardActions;
                                z6 = z3;
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if ((i3 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i7 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i8 != 0) {
                                        textStyle2 = TextStyle.INSTANCE.getDefault();
                                    }
                                    VisualTransformation none = i9 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation2;
                                    if (i10 != 0) {
                                        function13 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.1
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(TextLayoutResult textLayoutResult) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                invoke2(textLayoutResult);
                                                return Unit.INSTANCE;
                                            }
                                        };
                                    }
                                    if (i11 != 0) {
                                        interactionSource32 = null;
                                    }
                                    if (i12 != 0) {
                                        composer3 = composerStartRestartGroup;
                                        solidColor = new SolidColor(Color.INSTANCE.m6726getUnspecified0d7_KjU(), null);
                                    } else {
                                        composer3 = composerStartRestartGroup;
                                        solidColor = brush2;
                                    }
                                    boolean z20 = i13 != 0 ? true : z;
                                    int i35 = i15 != 0 ? Integer.MAX_VALUE : i;
                                    int i36 = i17 != 0 ? 1 : i2;
                                    if ((i5 & 2048) != 0) {
                                        imeOptions3 = ImeOptions.INSTANCE.getDefault();
                                        i24 &= -113;
                                    } else {
                                        imeOptions3 = imeOptions;
                                    }
                                    keyboardActions3 = i19 != 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                    boolean z21 = i21 != 0 ? true : z2;
                                    z7 = i23 != 0 ? false : z3;
                                    function3M5343getLambda1$foundation_release = i25 != 0 ? ComposableSingletons$CoreTextFieldKt.INSTANCE.m5343getLambda1$foundation_release() : function3;
                                    if (i26 != 0) {
                                        int i37 = i36;
                                        visualTransformation4 = none;
                                        modifier4 = modifier2;
                                        imeOptions4 = imeOptions3;
                                        z8 = z21;
                                        function15 = function13;
                                        i29 = i37;
                                        int i38 = i24;
                                        textFieldScrollerPosition3 = null;
                                        i31 = i38;
                                        int i39 = i35;
                                        z9 = z20;
                                        interactionSource34 = interactionSource32;
                                        i30 = i39;
                                        composer3.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            z10 = z9;
                                        } else {
                                            z10 = z9;
                                            ComposerKt.traceEventStart(-244533042, i6, i31, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:204)");
                                        }
                                        objRememberedValue = composer3.rememberedValue();
                                        companion = Composer.INSTANCE;
                                        if (objRememberedValue == companion.getEmpty()) {
                                            objRememberedValue = new FocusRequester();
                                            composer3.updateRememberedValue(objRememberedValue);
                                        }
                                        final FocusRequester focusRequester2 = (FocusRequester) objRememberedValue;
                                        objRememberedValue2 = composer3.rememberedValue();
                                        int i40 = i6;
                                        if (objRememberedValue2 == companion.getEmpty()) {
                                            objRememberedValue2 = LegacyPlatformTextInputServiceAdapter_androidKt.createLegacyPlatformTextInputServiceAdapter();
                                            composer3.updateRememberedValue(objRememberedValue2);
                                        }
                                        LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter3 = (LegacyPlatformTextInputServiceAdapter) objRememberedValue2;
                                        objRememberedValue3 = composer3.rememberedValue();
                                        Brush brush3 = solidColor;
                                        if (objRememberedValue3 == companion.getEmpty()) {
                                            objRememberedValue3 = new TextInputService(legacyPlatformTextInputServiceAdapter3);
                                            composer3.updateRememberedValue(objRememberedValue3);
                                        }
                                        final TextInputService textInputService4 = (TextInputService) objRememberedValue3;
                                        Density density2 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                        FontFamily.Resolver resolver2 = (FontFamily.Resolver) composer3.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                                        long selectionBackgroundColor = ((SelectionColors) composer3.consume(TextSelectionColors2.getLocalTextSelectionColors())).getSelectionBackgroundColor();
                                        FocusManager focusManager2 = (FocusManager) composer3.consume(CompositionLocalsKt.getLocalFocusManager());
                                        final WindowInfo windowInfo = (WindowInfo) composer3.consume(CompositionLocalsKt.getLocalWindowInfo());
                                        SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composer3.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                                        final int i41 = i29;
                                        if (i30 != 1) {
                                            z11 = z8;
                                            if (!z10 && imeOptions4.getSingleLine()) {
                                                orientation = Orientation.Horizontal;
                                            }
                                            Orientation orientation3 = orientation;
                                            if (textFieldScrollerPosition3 == null) {
                                                composer3.startReplaceGroup(-1705353356);
                                                Object[] objArr = {orientation3};
                                                Saver<TextFieldScrollerPosition, Object> saver = TextFieldScrollerPosition.INSTANCE.getSaver();
                                                textStyle4 = textStyle2;
                                                orientation2 = orientation3;
                                                boolean zChanged2 = composer3.changed(orientation2);
                                                Object objRememberedValue13 = composer3.rememberedValue();
                                                if (zChanged2) {
                                                    modifier5 = modifier4;
                                                } else {
                                                    modifier5 = modifier4;
                                                    if (objRememberedValue13 == companion.getEmpty()) {
                                                    }
                                                    textFieldScrollerPosition4 = (TextFieldScrollerPosition) RememberSaveable.m6426rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue13, composer3, 0, 4);
                                                    composer3.endReplaceGroup();
                                                }
                                                objRememberedValue13 = new Function0<TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final TextFieldScrollerPosition invoke() {
                                                        return new TextFieldScrollerPosition(orientation2, 0.0f, 2, null);
                                                    }
                                                };
                                                composer3.updateRememberedValue(objRememberedValue13);
                                                textFieldScrollerPosition4 = (TextFieldScrollerPosition) RememberSaveable.m6426rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue13, composer3, 0, 4);
                                                composer3.endReplaceGroup();
                                            } else {
                                                modifier5 = modifier4;
                                                textStyle4 = textStyle2;
                                                orientation2 = orientation3;
                                                composer3.startReplaceGroup(-1705354472);
                                                composer3.endReplaceGroup();
                                                textFieldScrollerPosition4 = textFieldScrollerPosition3;
                                            }
                                            if (textFieldScrollerPosition4.getOrientation() != orientation2) {
                                                StringBuilder sb = new StringBuilder();
                                                sb.append("Mismatching scroller orientation; ");
                                                sb.append(orientation2 == Orientation.Vertical ? "only single-line, non-wrap text fields can scroll horizontally" : "single-line, non-wrap text fields can only scroll horizontally");
                                                throw new IllegalArgumentException(sb.toString());
                                            }
                                            int i42 = i40 & 14;
                                            int i43 = i40 & 57344;
                                            final TextFieldScrollerPosition textFieldScrollerPosition5 = textFieldScrollerPosition4;
                                            boolean z22 = (i42 == 4) | (i43 == 16384);
                                            Object objRememberedValue14 = composer3.rememberedValue();
                                            if (z22 || objRememberedValue14 == companion.getEmpty()) {
                                                TransformedText transformedTextFilterWithValidation = ValidatingOffsetMapping2.filterWithValidation(visualTransformation4, textFieldValue.getText());
                                                TextRange composition = textFieldValue.getComposition();
                                                interactionSource35 = interactionSource34;
                                                legacyPlatformTextInputServiceAdapter = legacyPlatformTextInputServiceAdapter3;
                                                if (composition != null) {
                                                    TransformedText transformedTextM5417applyCompositionDecoration72CqOWE = TextFieldDelegate.INSTANCE.m5417applyCompositionDecoration72CqOWE(composition.getPackedValue(), transformedTextFilterWithValidation);
                                                    objRememberedValue14 = transformedTextM5417applyCompositionDecoration72CqOWE == null ? transformedTextFilterWithValidation : transformedTextM5417applyCompositionDecoration72CqOWE;
                                                    composer3.updateRememberedValue(objRememberedValue14);
                                                }
                                            } else {
                                                interactionSource35 = interactionSource34;
                                                legacyPlatformTextInputServiceAdapter = legacyPlatformTextInputServiceAdapter3;
                                            }
                                            TransformedText transformedText = (TransformedText) objRememberedValue14;
                                            AnnotatedString text = transformedText.getText();
                                            final OffsetMapping offsetMapping2 = transformedText.getOffsetMapping();
                                            RecomposeScopeImpl2 currentRecomposeScope = Composables.getCurrentRecomposeScope(composer3, 0);
                                            boolean zChanged3 = composer3.changed(softwareKeyboardController);
                                            Object objRememberedValue15 = composer3.rememberedValue();
                                            if (zChanged3 || objRememberedValue15 == companion.getEmpty()) {
                                                boolean z23 = z10;
                                                TextStyle textStyle6 = textStyle4;
                                                annotatedString = text;
                                                textStyle5 = textStyle6;
                                                z10 = z23;
                                                density = density2;
                                                resolver = resolver2;
                                                objRememberedValue15 = new LegacyTextFieldState(new TextDelegate(text, textStyle6, 0, 0, z23, 0, density2, resolver2, null, 300, null), currentRecomposeScope, softwareKeyboardController);
                                                composer3.updateRememberedValue(objRememberedValue15);
                                            } else {
                                                annotatedString = text;
                                                density = density2;
                                                resolver = resolver2;
                                                textStyle5 = textStyle4;
                                            }
                                            final LegacyTextFieldState legacyTextFieldState3 = (LegacyTextFieldState) objRememberedValue15;
                                            boolean z24 = z10;
                                            KeyboardActions keyboardActions4 = keyboardActions3;
                                            legacyTextFieldState3.m5367updatefnh65Uc(textFieldValue.getText(), annotatedString, textStyle5, z24, density, resolver, function1, keyboardActions4, focusManager2, selectionBackgroundColor);
                                            legacyTextFieldState3.getProcessor().reset(textFieldValue, legacyTextFieldState3.getInputSession());
                                            Object objRememberedValue16 = composer3.rememberedValue();
                                            if (objRememberedValue16 == companion.getEmpty()) {
                                                focusManager = focusManager2;
                                                objRememberedValue16 = new UndoManager(0, 1, null);
                                                composer3.updateRememberedValue(objRememberedValue16);
                                            } else {
                                                focusManager = focusManager2;
                                            }
                                            UndoManager undoManager2 = (UndoManager) objRememberedValue16;
                                            UndoManager.snapshotIfNeeded$default(undoManager2, textFieldValue, 0L, 2, null);
                                            Object objRememberedValue17 = composer3.rememberedValue();
                                            if (objRememberedValue17 == companion.getEmpty()) {
                                                objRememberedValue17 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer3);
                                                composer3.updateRememberedValue(objRememberedValue17);
                                            }
                                            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue17;
                                            Object objRememberedValue18 = composer3.rememberedValue();
                                            final int i44 = i30;
                                            if (objRememberedValue18 == companion.getEmpty()) {
                                                objRememberedValue18 = BringIntoViewRequesterKt.BringIntoViewRequester();
                                                composer3.updateRememberedValue(objRememberedValue18);
                                            }
                                            final BringIntoViewRequester bringIntoViewRequester2 = (BringIntoViewRequester) objRememberedValue18;
                                            Object objRememberedValue19 = composer3.rememberedValue();
                                            if (objRememberedValue19 == companion.getEmpty()) {
                                                objRememberedValue19 = new TextFieldSelectionManager(undoManager2);
                                                composer3.updateRememberedValue(objRememberedValue19);
                                            }
                                            final TextFieldSelectionManager textFieldSelectionManager2 = (TextFieldSelectionManager) objRememberedValue19;
                                            textFieldSelectionManager2.setOffsetMapping$foundation_release(offsetMapping2);
                                            textFieldSelectionManager2.setVisualTransformation$foundation_release(visualTransformation4);
                                            textFieldSelectionManager2.setOnValueChange$foundation_release(legacyTextFieldState3.getOnValueChange());
                                            textFieldSelectionManager2.setState$foundation_release(legacyTextFieldState3);
                                            textFieldSelectionManager2.setValue$foundation_release(textFieldValue);
                                            textFieldSelectionManager2.setClipboard$foundation_release((Clipboard) composer3.consume(CompositionLocalsKt.getLocalClipboard()));
                                            textFieldSelectionManager2.setCoroutineScope$foundation_release(coroutineScope);
                                            textFieldSelectionManager2.setTextToolbar((TextToolbar) composer3.consume(CompositionLocalsKt.getLocalTextToolbar()));
                                            textFieldSelectionManager2.setHapticFeedBack((HapticFeedback) composer3.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                                            textFieldSelectionManager2.setFocusRequester(focusRequester2);
                                            textFieldSelectionManager2.setEditable(!z7);
                                            textFieldSelectionManager2.setEnabled(z11);
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            int i45 = i31 & 7168;
                                            int i46 = i31;
                                            int i47 = i46 & 57344;
                                            boolean zChangedInstance9 = composer3.changedInstance(legacyTextFieldState3) | (i45 == 2048) | (i47 == 16384) | composer3.changedInstance(textInputService4) | (i42 == 4);
                                            int i48 = (i46 & 112) ^ 48;
                                            if (i48 <= 32 || !composer3.changed(imeOptions4)) {
                                                undoManager = undoManager2;
                                                if ((i46 & 48) != 32) {
                                                    z12 = false;
                                                }
                                                zChangedInstance = zChangedInstance9 | z12 | composer3.changedInstance(offsetMapping2) | composer3.changedInstance(coroutineScope) | composer3.changedInstance(bringIntoViewRequester2) | composer3.changedInstance(textFieldSelectionManager2);
                                                objRememberedValue4 = composer3.rememberedValue();
                                                if (!zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                                                    final boolean z25 = z11;
                                                    final ImeOptions imeOptions6 = imeOptions4;
                                                    final boolean z26 = z7;
                                                    objRememberedValue4 = new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                                                            invoke2(focusState);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(FocusState focusState) {
                                                            TextLayoutResultProxy layoutResult;
                                                            if (legacyTextFieldState3.getHasFocus() == focusState.isFocused()) {
                                                                return;
                                                            }
                                                            legacyTextFieldState3.setHasFocus(focusState.isFocused());
                                                            if (!legacyTextFieldState3.getHasFocus() || !z25 || z26) {
                                                                CoreTextFieldKt.endInputSession(legacyTextFieldState3);
                                                            } else {
                                                                CoreTextFieldKt.startInputSession(textInputService4, legacyTextFieldState3, textFieldValue, imeOptions6, offsetMapping2);
                                                            }
                                                            if (focusState.isFocused() && (layoutResult = legacyTextFieldState3.getLayoutResult()) != null) {
                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(bringIntoViewRequester2, textFieldValue, legacyTextFieldState3, layoutResult, offsetMapping2, null), 3, null);
                                                            }
                                                            if (focusState.isFocused()) {
                                                                return;
                                                            }
                                                            TextFieldSelectionManager.m5526deselect_kEHs6E$foundation_release$default(textFieldSelectionManager2, null, 1, null);
                                                        }
                                                    };
                                                    legacyTextFieldState = legacyTextFieldState3;
                                                    textInputService = textInputService4;
                                                    textFieldValue2 = textFieldValue;
                                                    imeOptions5 = imeOptions6;
                                                    textFieldSelectionManager = textFieldSelectionManager2;
                                                    bringIntoViewRequester = bringIntoViewRequester2;
                                                    composer3.updateRememberedValue(objRememberedValue4);
                                                } else {
                                                    textFieldValue2 = textFieldValue;
                                                    textInputService = textInputService4;
                                                    bringIntoViewRequester = bringIntoViewRequester2;
                                                    imeOptions5 = imeOptions4;
                                                    textFieldSelectionManager = textFieldSelectionManager2;
                                                    legacyTextFieldState = legacyTextFieldState3;
                                                }
                                                final VisualTransformation visualTransformation5 = visualTransformation4;
                                                InteractionSource3 interactionSource36 = interactionSource35;
                                                Modifier modifierTextFieldFocusModifier = TextFieldGestureModifiers.textFieldFocusModifier(companion2, z11, focusRequester2, interactionSource36, (Function1) objRememberedValue4);
                                                final boolean z27 = z11;
                                                SnapshotState4 snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf((z11 || z7) ? false : true), composer3, 0);
                                                Unit unit = Unit.INSTANCE;
                                                boolean zChanged4 = composer3.changed(snapshotState4RememberUpdatedState) | composer3.changedInstance(legacyTextFieldState) | composer3.changedInstance(textInputService) | composer3.changedInstance(textFieldSelectionManager);
                                                if (i48 > 32 || !composer3.changed(imeOptions5)) {
                                                    textInputService2 = textInputService;
                                                    if ((i46 & 48) != 32) {
                                                        z13 = false;
                                                    }
                                                    z14 = zChanged4 | z13;
                                                    objRememberedValue5 = composer3.rememberedValue();
                                                    if (z14 || objRememberedValue5 == companion.getEmpty()) {
                                                        objRememberedValue5 = new CoreTextFieldKt$CoreTextField$2$1(legacyTextFieldState, snapshotState4RememberUpdatedState, textInputService2, textFieldSelectionManager, imeOptions5, null);
                                                        snapshotState4 = snapshotState4RememberUpdatedState;
                                                        textInputService3 = textInputService2;
                                                        composer3.updateRememberedValue(objRememberedValue5);
                                                    } else {
                                                        snapshotState4 = snapshotState4RememberUpdatedState;
                                                        textInputService3 = textInputService2;
                                                    }
                                                    final ImeOptions imeOptions7 = imeOptions5;
                                                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer3, 6);
                                                    zChangedInstance2 = composer3.changedInstance(legacyTextFieldState);
                                                    objRememberedValue6 = composer3.rememberedValue();
                                                    if (!zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
                                                        objRememberedValue6 = new Function1<Boolean, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1$1
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                                                invoke(bool.booleanValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(boolean z28) {
                                                                legacyTextFieldState.setInTouchMode(z28);
                                                            }
                                                        };
                                                        composer3.updateRememberedValue(objRememberedValue6);
                                                    }
                                                    Modifier modifierUpdateSelectionTouchMode = SelectionGestures3.updateSelectionTouchMode(companion2, (Function1) objRememberedValue6);
                                                    zChangedInstance3 = (i47 != 16384) | composer3.changedInstance(legacyTextFieldState) | (i45 != 2048) | composer3.changedInstance(offsetMapping2) | composer3.changedInstance(textFieldSelectionManager);
                                                    objRememberedValue7 = composer3.rememberedValue();
                                                    if (!zChangedInstance3 || objRememberedValue7 == companion.getEmpty()) {
                                                        final LegacyTextFieldState legacyTextFieldState4 = legacyTextFieldState;
                                                        final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager;
                                                        final boolean z28 = z7;
                                                        objRememberedValue7 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                                                m5344invokek4lQ0M(offset.getPackedValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                                                            public final void m5344invokek4lQ0M(long j) {
                                                                CoreTextFieldKt.tapToFocus(legacyTextFieldState4, focusRequester2, !z28);
                                                                if (legacyTextFieldState4.getHasFocus() && z27) {
                                                                    if (legacyTextFieldState4.getHandleState() != HandleState.Selection) {
                                                                        TextLayoutResultProxy layoutResult = legacyTextFieldState4.getLayoutResult();
                                                                        if (layoutResult != null) {
                                                                            LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState4;
                                                                            TextFieldDelegate.INSTANCE.m5420setCursorOffsetULxng0E$foundation_release(j, layoutResult, legacyTextFieldState5.getProcessor(), offsetMapping2, legacyTextFieldState5.getOnValueChange());
                                                                            if (legacyTextFieldState5.getTextDelegate().getText().length() > 0) {
                                                                                legacyTextFieldState5.setHandleState(HandleState.Cursor);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    textFieldSelectionManager3.m5529deselect_kEHs6E$foundation_release(Offset.m6534boximpl(j));
                                                                }
                                                            }
                                                        };
                                                        legacyTextFieldState2 = legacyTextFieldState4;
                                                        focusRequester = focusRequester2;
                                                        z15 = z27;
                                                        offsetMapping = offsetMapping2;
                                                        composer3.updateRememberedValue(objRememberedValue7);
                                                    } else {
                                                        legacyTextFieldState2 = legacyTextFieldState;
                                                        z15 = z27;
                                                        offsetMapping = offsetMapping2;
                                                        focusRequester = focusRequester2;
                                                    }
                                                    z16 = z15;
                                                    FocusRequester focusRequester3 = focusRequester;
                                                    Modifier modifierPointerHoverIcon$default = PointerIcon5.pointerHoverIcon$default(SelectionGestures3.selectionGestureInput(TextFieldPressGestureFilter.tapPressTextFieldModifier(modifierUpdateSelectionTouchMode, interactionSource36, z15, (Function1) objRememberedValue7), textFieldSelectionManager.getMouseSelectionObserver(), textFieldSelectionManager.getTouchSelectionObserver()), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                                                    zChangedInstance4 = composer3.changedInstance(legacyTextFieldState2) | (i42 != 4) | composer3.changedInstance(offsetMapping);
                                                    objRememberedValue8 = composer3.rememberedValue();
                                                    if (!zChangedInstance4 || objRememberedValue8 == companion.getEmpty()) {
                                                        objRememberedValue8 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) throws Throwable {
                                                                invoke2(drawScope);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(DrawScope drawScope) throws Throwable {
                                                                TextLayoutResultProxy layoutResult = legacyTextFieldState2.getLayoutResult();
                                                                if (layoutResult != null) {
                                                                    TextFieldValue textFieldValue3 = textFieldValue2;
                                                                    LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState2;
                                                                    OffsetMapping offsetMapping3 = offsetMapping;
                                                                    TextFieldDelegate.INSTANCE.m5418drawQ1vqE60$foundation_release(drawScope.getDrawContext().getCanvas(), textFieldValue3, legacyTextFieldState5.m5363getSelectionPreviewHighlightRanged9O1mEE(), legacyTextFieldState5.m5360getDeletionPreviewHighlightRanged9O1mEE(), offsetMapping3, layoutResult.getValue(), legacyTextFieldState5.getHighlightPaint(), legacyTextFieldState5.getSelectionBackgroundColor());
                                                                }
                                                            }
                                                        };
                                                        composer3.updateRememberedValue(objRememberedValue8);
                                                    }
                                                    final Modifier modifierDrawBehind = DrawModifierKt.drawBehind(companion2, (Function1) objRememberedValue8);
                                                    zChangedInstance5 = (i45 != 2048) | composer3.changedInstance(legacyTextFieldState2) | composer3.changed(windowInfo) | composer3.changedInstance(textFieldSelectionManager) | (i42 != 4) | composer3.changedInstance(offsetMapping);
                                                    objRememberedValue9 = composer3.rememberedValue();
                                                    if (!zChangedInstance5 || objRememberedValue9 == companion.getEmpty()) {
                                                        final TextFieldValue textFieldValue3 = textFieldValue2;
                                                        final OffsetMapping offsetMapping3 = offsetMapping;
                                                        final LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState2;
                                                        final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager;
                                                        objRememberedValue9 = new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                                                invoke2(layoutCoordinates);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                                                                legacyTextFieldState5.setLayoutCoordinates(layoutCoordinates);
                                                                TextLayoutResultProxy layoutResult = legacyTextFieldState5.getLayoutResult();
                                                                if (layoutResult != null) {
                                                                    layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
                                                                }
                                                                if (z16) {
                                                                    if (legacyTextFieldState5.getHandleState() == HandleState.Selection) {
                                                                        if (legacyTextFieldState5.getShowFloatingToolbar() && windowInfo.isWindowFocused()) {
                                                                            textFieldSelectionManager4.showSelectionToolbar$foundation_release();
                                                                        } else {
                                                                            textFieldSelectionManager4.hideSelectionToolbar$foundation_release();
                                                                        }
                                                                        legacyTextFieldState5.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager4, true));
                                                                        legacyTextFieldState5.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager4, false));
                                                                        legacyTextFieldState5.setShowCursorHandle(TextRange.m7640getCollapsedimpl(textFieldValue3.getSelection()));
                                                                    } else if (legacyTextFieldState5.getHandleState() == HandleState.Cursor) {
                                                                        legacyTextFieldState5.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager4, true));
                                                                    }
                                                                    CoreTextFieldKt.notifyFocusedRect(legacyTextFieldState5, textFieldValue3, offsetMapping3);
                                                                    TextLayoutResultProxy layoutResult2 = legacyTextFieldState5.getLayoutResult();
                                                                    if (layoutResult2 != null) {
                                                                        LegacyTextFieldState legacyTextFieldState6 = legacyTextFieldState5;
                                                                        TextFieldValue textFieldValue4 = textFieldValue3;
                                                                        OffsetMapping offsetMapping4 = offsetMapping3;
                                                                        TextInputService3 inputSession = legacyTextFieldState6.getInputSession();
                                                                        if (inputSession == null || !legacyTextFieldState6.getHasFocus()) {
                                                                            return;
                                                                        }
                                                                        TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation_release(inputSession, textFieldValue4, offsetMapping4, layoutResult2);
                                                                    }
                                                                }
                                                            }
                                                        };
                                                        z17 = z16;
                                                        composer3.updateRememberedValue(objRememberedValue9);
                                                    } else {
                                                        z17 = z16;
                                                    }
                                                    final Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(companion2, (Function1) objRememberedValue9);
                                                    final OffsetMapping offsetMapping4 = offsetMapping;
                                                    boolean z29 = z17;
                                                    CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = new CoreTextFieldSemanticsModifier(transformedText, textFieldValue, legacyTextFieldState2, z7, z29, visualTransformation5 instanceof VisualTransformation2, offsetMapping4, textFieldSelectionManager, imeOptions7, focusRequester3);
                                                    final LegacyTextFieldState legacyTextFieldState6 = legacyTextFieldState2;
                                                    Modifier modifierCursor = TextFieldCursor.cursor(companion2, legacyTextFieldState6, textFieldValue, offsetMapping4, brush3, (z29 || z7 || !windowInfo.isWindowFocused() || legacyTextFieldState2.hasHighlight()) ? false : true);
                                                    zChangedInstance6 = composer3.changedInstance(textFieldSelectionManager);
                                                    Object objRememberedValue20 = composer3.rememberedValue();
                                                    if (zChangedInstance6) {
                                                        modifier6 = modifierCursor;
                                                        if (objRememberedValue20 == companion.getEmpty()) {
                                                        }
                                                        EffectsKt.DisposableEffect(textFieldSelectionManager, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue20, composer3, 0);
                                                        zChangedInstance7 = ((i48 > 32 && composer3.changed(imeOptions7)) || (i46 & 48) == 32) | composer3.changedInstance(legacyTextFieldState6) | composer3.changedInstance(textInputService3) | (i42 == 4);
                                                        objRememberedValue10 = composer3.rememberedValue();
                                                        if (zChangedInstance7 || objRememberedValue10 == companion.getEmpty()) {
                                                            objRememberedValue10 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                                    if (legacyTextFieldState6.getHasFocus()) {
                                                                        LegacyTextFieldState legacyTextFieldState7 = legacyTextFieldState6;
                                                                        legacyTextFieldState7.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(textInputService3, textFieldValue, legacyTextFieldState7.getProcessor(), imeOptions7, legacyTextFieldState6.getOnValueChange(), legacyTextFieldState6.getOnImeActionPerformed()));
                                                                    }
                                                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1$invoke$$inlined$onDispose$1
                                                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                                                        public void dispose() {
                                                                        }
                                                                    };
                                                                }
                                                            };
                                                            composer3.updateRememberedValue(objRememberedValue10);
                                                        }
                                                        EffectsKt.DisposableEffect(imeOptions7, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue10, composer3, (i46 >> 3) & 14);
                                                        Modifier modifierM5427textFieldKeyInput2WJ9YEU = TextFieldKeyInput3.m5427textFieldKeyInput2WJ9YEU(companion2, legacyTextFieldState6, textFieldSelectionManager, textFieldValue, legacyTextFieldState6.getOnValueChange(), !z7, i44 != 1, offsetMapping4, undoManager, imeOptions7.getImeAction());
                                                        Modifier modifierTextFieldMagnifier = companion2;
                                                        int keyboardType = imeOptions7.getKeyboardType();
                                                        KeyboardType.Companion companion3 = KeyboardType.INSTANCE;
                                                        z18 = KeyboardType.m7774equalsimpl0(keyboardType, companion3.m7783getPasswordPjHm6EE()) && !KeyboardType.m7774equalsimpl0(imeOptions7.getKeyboardType(), companion3.m7782getNumberPasswordPjHm6EE());
                                                        boolean zCoreTextField$lambda$11 = CoreTextField$lambda$11(snapshotState4);
                                                        legacyPlatformTextInputServiceAdapter2 = legacyPlatformTextInputServiceAdapter;
                                                        zChanged = composer3.changed(z18) | composer3.changedInstance(legacyPlatformTextInputServiceAdapter2);
                                                        objRememberedValue11 = composer3.rememberedValue();
                                                        if (!zChanged || objRememberedValue11 == companion.getEmpty()) {
                                                            objRememberedValue11 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(0);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function0
                                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                                    invoke2();
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2() {
                                                                    if (z18) {
                                                                        legacyPlatformTextInputServiceAdapter2.startStylusHandwriting();
                                                                    }
                                                                }
                                                            };
                                                            composer3.updateRememberedValue(objRememberedValue11);
                                                        }
                                                        Modifier modifierStylusHandwriting = StylusHandwriting2.stylusHandwriting(modifierTextFieldMagnifier, zCoreTextField$lambda$11, z18, (Function0) objRememberedValue11);
                                                        value = ((Color) composer3.consume(AutofillHighlight.getLocalAutofillHighlightColor())).getValue();
                                                        zChangedInstance8 = composer3.changedInstance(legacyTextFieldState6) | composer3.changed(value);
                                                        objRememberedValue12 = composer3.rememberedValue();
                                                        if (!zChangedInstance8 || objRememberedValue12 == companion.getEmpty()) {
                                                            objRememberedValue12 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawDecorationModifier$1$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                                                    invoke2(drawScope);
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2(DrawScope drawScope) {
                                                                    if (legacyTextFieldState6.getAutofillHighlightOn() || legacyTextFieldState6.getJustAutofilled()) {
                                                                        DrawScope.m6958drawRectnJ9OG0$default(drawScope, value, 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                                                                    }
                                                                }
                                                            };
                                                            composer3.updateRememberedValue(objRememberedValue12);
                                                        }
                                                        Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifier3.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(LegacyAdaptingPlatformTextInputModifierNode3.legacyTextInputAdapter(modifier5.then(DrawModifierKt.drawBehind(modifierTextFieldMagnifier, (Function1) objRememberedValue12)), legacyPlatformTextInputServiceAdapter2, legacyTextFieldState6, textFieldSelectionManager).then(modifierStylusHandwriting).then(modifierTextFieldFocusModifier), legacyTextFieldState6, focusManager), legacyTextFieldState6, textFieldSelectionManager).then(modifierM5427textFieldKeyInput2WJ9YEU), textFieldScrollerPosition5, interactionSource36, z29).then(modifierPointerHoverIcon$default).then(coreTextFieldSemanticsModifier), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                                                invoke2(layoutCoordinates);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                                                                TextLayoutResultProxy layoutResult = legacyTextFieldState6.getLayoutResult();
                                                                if (layoutResult == null) {
                                                                    return;
                                                                }
                                                                layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
                                                            }
                                                        });
                                                        z19 = !z29 && legacyTextFieldState6.getHasFocus() && legacyTextFieldState6.isInTouchMode() && windowInfo.isWindowFocused();
                                                        if (z19) {
                                                            modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(modifierTextFieldMagnifier, textFieldSelectionManager);
                                                        }
                                                        final BringIntoViewRequester bringIntoViewRequester3 = bringIntoViewRequester;
                                                        Composer composer4 = composer3;
                                                        final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager;
                                                        final boolean z30 = z7;
                                                        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function33 = function3M5343getLambda1$foundation_release;
                                                        final Modifier modifier7 = modifier6;
                                                        final TextStyle textStyle7 = textStyle5;
                                                        final Density density3 = density;
                                                        final boolean z31 = z19;
                                                        final Modifier modifier8 = modifierTextFieldMagnifier;
                                                        CoreTextFieldRootBox(modifierOnGloballyPositioned2, textFieldSelectionManager5, ComposableLambda3.rememberComposableLambda(-492537660, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                invoke(composer5, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Composer composer5, int i49) {
                                                                if (!composer5.shouldExecute((i49 & 3) != 2, i49 & 1)) {
                                                                    composer5.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-492537660, i49, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:555)");
                                                                }
                                                                Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function34 = function33;
                                                                final LegacyTextFieldState legacyTextFieldState7 = legacyTextFieldState6;
                                                                final TextStyle textStyle8 = textStyle7;
                                                                final int i50 = i41;
                                                                final int i51 = i44;
                                                                final TextFieldScrollerPosition textFieldScrollerPosition6 = textFieldScrollerPosition5;
                                                                final TextFieldValue textFieldValue4 = textFieldValue;
                                                                final VisualTransformation visualTransformation6 = visualTransformation5;
                                                                final Modifier modifier9 = modifier7;
                                                                final Modifier modifier10 = modifierDrawBehind;
                                                                final Modifier modifier11 = modifierOnGloballyPositioned;
                                                                final Modifier modifier12 = modifier8;
                                                                final BringIntoViewRequester bringIntoViewRequester4 = bringIntoViewRequester3;
                                                                final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager5;
                                                                final boolean z32 = z31;
                                                                final boolean z33 = z30;
                                                                final Function1<TextLayoutResult, Unit> function16 = function15;
                                                                final OffsetMapping offsetMapping5 = offsetMapping4;
                                                                final Density density4 = density3;
                                                                function34.invoke(ComposableLambda3.rememberComposableLambda(-1835647873, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                    {
                                                                        super(2);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                                        invoke(composer6, num.intValue());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    public final void invoke(Composer composer6, int i52) {
                                                                        if (composer6.shouldExecute((i52 & 3) != 2, i52 & 1)) {
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventStart(-1835647873, i52, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:558)");
                                                                            }
                                                                            Modifier modifierHeightInLines = HeightInLinesModifier.heightInLines(SizeKt.m5158heightInVpY3zN4$default(Modifier.INSTANCE, legacyTextFieldState7.m5361getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle8, i50, i51);
                                                                            TextFieldScrollerPosition textFieldScrollerPosition7 = textFieldScrollerPosition6;
                                                                            TextFieldValue textFieldValue5 = textFieldValue4;
                                                                            VisualTransformation visualTransformation7 = visualTransformation6;
                                                                            boolean zChangedInstance10 = composer6.changedInstance(legacyTextFieldState7);
                                                                            final LegacyTextFieldState legacyTextFieldState8 = legacyTextFieldState7;
                                                                            Object objRememberedValue21 = composer6.rememberedValue();
                                                                            if (zChangedInstance10 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                                                                objRememberedValue21 = new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1$1
                                                                                    {
                                                                                        super(0);
                                                                                    }

                                                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                                                    @Override // kotlin.jvm.functions.Function0
                                                                                    public final TextLayoutResultProxy invoke() {
                                                                                        return legacyTextFieldState8.getLayoutResult();
                                                                                    }
                                                                                };
                                                                                composer6.updateRememberedValue(objRememberedValue21);
                                                                            }
                                                                            Modifier modifierBringIntoViewRequester = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSize2.textFieldMinSize(TextFieldScroll_androidKt.textFieldScroll(modifierHeightInLines, textFieldScrollerPosition7, textFieldValue5, visualTransformation7, (Function0) objRememberedValue21).then(modifier9).then(modifier10), textStyle8).then(modifier11).then(modifier12), bringIntoViewRequester4);
                                                                            final TextFieldSelectionManager textFieldSelectionManager7 = textFieldSelectionManager6;
                                                                            final LegacyTextFieldState legacyTextFieldState9 = legacyTextFieldState7;
                                                                            final boolean z34 = z32;
                                                                            final boolean z35 = z33;
                                                                            final Function1<TextLayoutResult, Unit> function17 = function16;
                                                                            final TextFieldValue textFieldValue6 = textFieldValue4;
                                                                            final OffsetMapping offsetMapping6 = offsetMapping5;
                                                                            final Density density5 = density4;
                                                                            final int i53 = i51;
                                                                            SimpleLayout.SimpleLayout(modifierBringIntoViewRequester, ComposableLambda3.rememberComposableLambda(-1172467467, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                                {
                                                                                    super(2);
                                                                                }

                                                                                @Override // kotlin.jvm.functions.Function2
                                                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                                                    invoke(composer7, num.intValue());
                                                                                    return Unit.INSTANCE;
                                                                                }

                                                                                /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
                                                                                /*
                                                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                                                */
                                                                                public final void invoke(Composer composer7, int i54) {
                                                                                    boolean z36 = true;
                                                                                    if (!composer7.shouldExecute((i54 & 3) != 2, i54 & 1)) {
                                                                                        composer7.skipToGroupEnd();
                                                                                        return;
                                                                                    }
                                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                                        ComposerKt.traceEventStart(-1172467467, i54, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:579)");
                                                                                    }
                                                                                    final LegacyTextFieldState legacyTextFieldState10 = legacyTextFieldState9;
                                                                                    final Function1<TextLayoutResult, Unit> function18 = function17;
                                                                                    final TextFieldValue textFieldValue7 = textFieldValue6;
                                                                                    final OffsetMapping offsetMapping7 = offsetMapping6;
                                                                                    final Density density6 = density5;
                                                                                    final int i55 = i53;
                                                                                    MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                                                                        /* renamed from: measure-3p2s80s */
                                                                                        public MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                                                                                            Snapshot.Companion companion4 = Snapshot.INSTANCE;
                                                                                            LegacyTextFieldState legacyTextFieldState11 = legacyTextFieldState10;
                                                                                            Snapshot currentThreadSnapshot = companion4.getCurrentThreadSnapshot();
                                                                                            Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                                                                            Snapshot snapshotMakeCurrentNonObservable = companion4.makeCurrentNonObservable(currentThreadSnapshot);
                                                                                            try {
                                                                                                TextLayoutResultProxy layoutResult = legacyTextFieldState11.getLayoutResult();
                                                                                                TextLayoutResult value2 = layoutResult != null ? layoutResult.getValue() : null;
                                                                                                Tuples3<Integer, Integer, TextLayoutResult> tuples3M5419layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m5419layout_EkL_Y$foundation_release(legacyTextFieldState10.getTextDelegate(), j, measureScope.getLayoutDirection(), value2);
                                                                                                int iIntValue = tuples3M5419layout_EkL_Y$foundation_release.component1().intValue();
                                                                                                int iIntValue2 = tuples3M5419layout_EkL_Y$foundation_release.component2().intValue();
                                                                                                TextLayoutResult textLayoutResultComponent3 = tuples3M5419layout_EkL_Y$foundation_release.component3();
                                                                                                if (!Intrinsics.areEqual(value2, textLayoutResultComponent3)) {
                                                                                                    legacyTextFieldState10.setLayoutResult(new TextLayoutResultProxy(textLayoutResultComponent3, null, layoutResult != null ? layoutResult.getDecorationBoxCoordinates() : null, 2, null));
                                                                                                    function18.invoke(textLayoutResultComponent3);
                                                                                                    CoreTextFieldKt.notifyFocusedRect(legacyTextFieldState10, textFieldValue7, offsetMapping7);
                                                                                                }
                                                                                                legacyTextFieldState10.m5365setMinHeightForSingleLineField0680j_4(density6.mo5013toDpu2uoSUM(i55 == 1 ? TextDelegate2.ceilToIntPx(textLayoutResultComponent3.getLineBottom(0)) : 0));
                                                                                                return measureScope.layout(iIntValue, iIntValue2, MapsKt.mapOf(Tuples4.m3642to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(textLayoutResultComponent3.getFirstBaseline()))), Tuples4.m3642to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(textLayoutResultComponent3.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                                                    public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                                                    }

                                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                                                        invoke2(placementScope);
                                                                                                        return Unit.INSTANCE;
                                                                                                    }
                                                                                                });
                                                                                            } finally {
                                                                                                companion4.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                                                                                            }
                                                                                        }

                                                                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                                                                        public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i56) {
                                                                                            legacyTextFieldState10.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                                                            return legacyTextFieldState10.getTextDelegate().getMaxIntrinsicWidth();
                                                                                        }
                                                                                    };
                                                                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                                                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer7, 0);
                                                                                    CompositionLocalMap currentCompositionLocalMap = composer7.getCurrentCompositionLocalMap();
                                                                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer7, companion4);
                                                                                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                                                    Function0<ComposeUiNode> constructor = companion5.getConstructor();
                                                                                    if (composer7.getApplier() == null) {
                                                                                        Composables.invalidApplier();
                                                                                    }
                                                                                    composer7.startReusableNode();
                                                                                    if (composer7.getInserting()) {
                                                                                        composer7.createNode(constructor);
                                                                                    } else {
                                                                                        composer7.useNode();
                                                                                    }
                                                                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer7);
                                                                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicy, companion5.getSetMeasurePolicy());
                                                                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                                                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                                                                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                                    }
                                                                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                                                                                    composer7.endNode();
                                                                                    TextFieldSelectionManager textFieldSelectionManager8 = textFieldSelectionManager7;
                                                                                    if (legacyTextFieldState9.getHandleState() == HandleState.None || legacyTextFieldState9.getLayoutCoordinates() == null) {
                                                                                        z36 = false;
                                                                                    } else {
                                                                                        LayoutCoordinates layoutCoordinates = legacyTextFieldState9.getLayoutCoordinates();
                                                                                        Intrinsics.checkNotNull(layoutCoordinates);
                                                                                        if (!layoutCoordinates.isAttached() || !z34) {
                                                                                        }
                                                                                    }
                                                                                    CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager8, z36, composer7, 0);
                                                                                    if (legacyTextFieldState9.getHandleState() == HandleState.Cursor && !z35 && z34) {
                                                                                        composer7.startReplaceGroup(-7167858);
                                                                                        CoreTextFieldKt.TextFieldCursorHandle(textFieldSelectionManager7, composer7, 0);
                                                                                        composer7.endReplaceGroup();
                                                                                    } else {
                                                                                        composer7.startReplaceGroup(-7090978);
                                                                                        composer7.endReplaceGroup();
                                                                                    }
                                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                                        ComposerKt.traceEventEnd();
                                                                                    }
                                                                                }
                                                                            }, composer6, 54), composer6, 48, 0);
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventEnd();
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        composer6.skipToGroupEnd();
                                                                    }
                                                                }, composer5, 54), composer5, 6);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                            }
                                                        }, composer4, 54), composer4, 384);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                        visualTransformation3 = visualTransformation5;
                                                        composer2 = composer4;
                                                        i27 = i44;
                                                        function14 = function15;
                                                        z6 = z30;
                                                        textFieldScrollerPosition2 = textFieldScrollerPosition3;
                                                        brush2 = brush3;
                                                        imeOptions2 = imeOptions7;
                                                        interactionSource33 = interactionSource36;
                                                        z4 = z24;
                                                        keyboardActions2 = keyboardActions4;
                                                        i28 = i41;
                                                        z5 = z29;
                                                        modifier3 = modifier5;
                                                        textStyle3 = textStyle5;
                                                        function32 = function33;
                                                    } else {
                                                        modifier6 = modifierCursor;
                                                    }
                                                    objRememberedValue20 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                            final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager;
                                                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1$invoke$$inlined$onDispose$1
                                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                                public void dispose() {
                                                                    textFieldSelectionManager6.hideSelectionToolbar$foundation_release();
                                                                }
                                                            };
                                                        }
                                                    };
                                                    composer3.updateRememberedValue(objRememberedValue20);
                                                    EffectsKt.DisposableEffect(textFieldSelectionManager, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue20, composer3, 0);
                                                    if (i48 > 32) {
                                                        zChangedInstance7 = ((i48 > 32 && composer3.changed(imeOptions7)) || (i46 & 48) == 32) | composer3.changedInstance(legacyTextFieldState6) | composer3.changedInstance(textInputService3) | (i42 == 4);
                                                        objRememberedValue10 = composer3.rememberedValue();
                                                        if (zChangedInstance7) {
                                                            objRememberedValue10 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                                    if (legacyTextFieldState6.getHasFocus()) {
                                                                        LegacyTextFieldState legacyTextFieldState7 = legacyTextFieldState6;
                                                                        legacyTextFieldState7.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(textInputService3, textFieldValue, legacyTextFieldState7.getProcessor(), imeOptions7, legacyTextFieldState6.getOnValueChange(), legacyTextFieldState6.getOnImeActionPerformed()));
                                                                    }
                                                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1$invoke$$inlined$onDispose$1
                                                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                                                        public void dispose() {
                                                                        }
                                                                    };
                                                                }
                                                            };
                                                            composer3.updateRememberedValue(objRememberedValue10);
                                                            EffectsKt.DisposableEffect(imeOptions7, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue10, composer3, (i46 >> 3) & 14);
                                                            Modifier modifierM5427textFieldKeyInput2WJ9YEU2 = TextFieldKeyInput3.m5427textFieldKeyInput2WJ9YEU(companion2, legacyTextFieldState6, textFieldSelectionManager, textFieldValue, legacyTextFieldState6.getOnValueChange(), !z7, i44 != 1, offsetMapping4, undoManager, imeOptions7.getImeAction());
                                                            Modifier modifierTextFieldMagnifier2 = companion2;
                                                            int keyboardType2 = imeOptions7.getKeyboardType();
                                                            KeyboardType.Companion companion32 = KeyboardType.INSTANCE;
                                                            if (KeyboardType.m7774equalsimpl0(keyboardType2, companion32.m7783getPasswordPjHm6EE())) {
                                                                boolean zCoreTextField$lambda$112 = CoreTextField$lambda$11(snapshotState4);
                                                                legacyPlatformTextInputServiceAdapter2 = legacyPlatformTextInputServiceAdapter;
                                                                zChanged = composer3.changed(z18) | composer3.changedInstance(legacyPlatformTextInputServiceAdapter2);
                                                                objRememberedValue11 = composer3.rememberedValue();
                                                                if (!zChanged) {
                                                                    objRememberedValue11 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(0);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                                                            invoke2();
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                        public final void invoke2() {
                                                                            if (z18) {
                                                                                legacyPlatformTextInputServiceAdapter2.startStylusHandwriting();
                                                                            }
                                                                        }
                                                                    };
                                                                    composer3.updateRememberedValue(objRememberedValue11);
                                                                    Modifier modifierStylusHandwriting2 = StylusHandwriting2.stylusHandwriting(modifierTextFieldMagnifier2, zCoreTextField$lambda$112, z18, (Function0) objRememberedValue11);
                                                                    value = ((Color) composer3.consume(AutofillHighlight.getLocalAutofillHighlightColor())).getValue();
                                                                    zChangedInstance8 = composer3.changedInstance(legacyTextFieldState6) | composer3.changed(value);
                                                                    objRememberedValue12 = composer3.rememberedValue();
                                                                    if (!zChangedInstance8) {
                                                                        objRememberedValue12 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawDecorationModifier$1$1
                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            {
                                                                                super(1);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                                                                invoke2(drawScope);
                                                                                return Unit.INSTANCE;
                                                                            }

                                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                            public final void invoke2(DrawScope drawScope) {
                                                                                if (legacyTextFieldState6.getAutofillHighlightOn() || legacyTextFieldState6.getJustAutofilled()) {
                                                                                    DrawScope.m6958drawRectnJ9OG0$default(drawScope, value, 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                                                                                }
                                                                            }
                                                                        };
                                                                        composer3.updateRememberedValue(objRememberedValue12);
                                                                        Modifier modifierOnGloballyPositioned22 = OnGloballyPositionedModifier3.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(LegacyAdaptingPlatformTextInputModifierNode3.legacyTextInputAdapter(modifier5.then(DrawModifierKt.drawBehind(modifierTextFieldMagnifier2, (Function1) objRememberedValue12)), legacyPlatformTextInputServiceAdapter2, legacyTextFieldState6, textFieldSelectionManager).then(modifierStylusHandwriting2).then(modifierTextFieldFocusModifier), legacyTextFieldState6, focusManager), legacyTextFieldState6, textFieldSelectionManager).then(modifierM5427textFieldKeyInput2WJ9YEU2), textFieldScrollerPosition5, interactionSource36, z29).then(modifierPointerHoverIcon$default).then(coreTextFieldSemanticsModifier), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                                                                            {
                                                                                super(1);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                                                                invoke2(layoutCoordinates);
                                                                                return Unit.INSTANCE;
                                                                            }

                                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                                                                                TextLayoutResultProxy layoutResult = legacyTextFieldState6.getLayoutResult();
                                                                                if (layoutResult == null) {
                                                                                    return;
                                                                                }
                                                                                layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
                                                                            }
                                                                        });
                                                                        if (z29) {
                                                                            if (z19) {
                                                                            }
                                                                            final BringIntoViewRequester bringIntoViewRequester32 = bringIntoViewRequester;
                                                                            Composer composer42 = composer3;
                                                                            final TextFieldSelectionManager textFieldSelectionManager52 = textFieldSelectionManager;
                                                                            final boolean z302 = z7;
                                                                            final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function332 = function3M5343getLambda1$foundation_release;
                                                                            final Modifier modifier72 = modifier6;
                                                                            final TextStyle textStyle72 = textStyle5;
                                                                            final Density density32 = density;
                                                                            final boolean z312 = z19;
                                                                            final Modifier modifier82 = modifierTextFieldMagnifier2;
                                                                            CoreTextFieldRootBox(modifierOnGloballyPositioned22, textFieldSelectionManager52, ComposableLambda3.rememberComposableLambda(-492537660, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5
                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                                {
                                                                                    super(2);
                                                                                }

                                                                                @Override // kotlin.jvm.functions.Function2
                                                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                                    invoke(composer5, num.intValue());
                                                                                    return Unit.INSTANCE;
                                                                                }

                                                                                public final void invoke(Composer composer5, int i49) {
                                                                                    if (!composer5.shouldExecute((i49 & 3) != 2, i49 & 1)) {
                                                                                        composer5.skipToGroupEnd();
                                                                                        return;
                                                                                    }
                                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                                        ComposerKt.traceEventStart(-492537660, i49, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:555)");
                                                                                    }
                                                                                    Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function34 = function332;
                                                                                    final LegacyTextFieldState legacyTextFieldState7 = legacyTextFieldState6;
                                                                                    final TextStyle textStyle8 = textStyle72;
                                                                                    final int i50 = i41;
                                                                                    final int i51 = i44;
                                                                                    final TextFieldScrollerPosition textFieldScrollerPosition6 = textFieldScrollerPosition5;
                                                                                    final TextFieldValue textFieldValue4 = textFieldValue;
                                                                                    final VisualTransformation visualTransformation6 = visualTransformation5;
                                                                                    final Modifier modifier9 = modifier72;
                                                                                    final Modifier modifier10 = modifierDrawBehind;
                                                                                    final Modifier modifier11 = modifierOnGloballyPositioned;
                                                                                    final Modifier modifier12 = modifier82;
                                                                                    final BringIntoViewRequester bringIntoViewRequester4 = bringIntoViewRequester32;
                                                                                    final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager52;
                                                                                    final boolean z32 = z312;
                                                                                    final boolean z33 = z302;
                                                                                    final Function1<? super TextLayoutResult, Unit> function16 = function15;
                                                                                    final OffsetMapping offsetMapping5 = offsetMapping4;
                                                                                    final Density density4 = density32;
                                                                                    function34.invoke(ComposableLambda3.rememberComposableLambda(-1835647873, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1
                                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                        /* JADX WARN: Multi-variable type inference failed */
                                                                                        {
                                                                                            super(2);
                                                                                        }

                                                                                        @Override // kotlin.jvm.functions.Function2
                                                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                                                            invoke(composer6, num.intValue());
                                                                                            return Unit.INSTANCE;
                                                                                        }

                                                                                        public final void invoke(Composer composer6, int i52) {
                                                                                            if (composer6.shouldExecute((i52 & 3) != 2, i52 & 1)) {
                                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                                    ComposerKt.traceEventStart(-1835647873, i52, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:558)");
                                                                                                }
                                                                                                Modifier modifierHeightInLines = HeightInLinesModifier.heightInLines(SizeKt.m5158heightInVpY3zN4$default(Modifier.INSTANCE, legacyTextFieldState7.m5361getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle8, i50, i51);
                                                                                                TextFieldScrollerPosition textFieldScrollerPosition7 = textFieldScrollerPosition6;
                                                                                                TextFieldValue textFieldValue5 = textFieldValue4;
                                                                                                VisualTransformation visualTransformation7 = visualTransformation6;
                                                                                                boolean zChangedInstance10 = composer6.changedInstance(legacyTextFieldState7);
                                                                                                final LegacyTextFieldState legacyTextFieldState8 = legacyTextFieldState7;
                                                                                                Object objRememberedValue21 = composer6.rememberedValue();
                                                                                                if (zChangedInstance10 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                                                                                    objRememberedValue21 = new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1$1
                                                                                                        {
                                                                                                            super(0);
                                                                                                        }

                                                                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                                                                        @Override // kotlin.jvm.functions.Function0
                                                                                                        public final TextLayoutResultProxy invoke() {
                                                                                                            return legacyTextFieldState8.getLayoutResult();
                                                                                                        }
                                                                                                    };
                                                                                                    composer6.updateRememberedValue(objRememberedValue21);
                                                                                                }
                                                                                                Modifier modifierBringIntoViewRequester = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSize2.textFieldMinSize(TextFieldScroll_androidKt.textFieldScroll(modifierHeightInLines, textFieldScrollerPosition7, textFieldValue5, visualTransformation7, (Function0) objRememberedValue21).then(modifier9).then(modifier10), textStyle8).then(modifier11).then(modifier12), bringIntoViewRequester4);
                                                                                                final TextFieldSelectionManager textFieldSelectionManager7 = textFieldSelectionManager6;
                                                                                                final LegacyTextFieldState legacyTextFieldState9 = legacyTextFieldState7;
                                                                                                final boolean z34 = z32;
                                                                                                final boolean z35 = z33;
                                                                                                final Function1<? super TextLayoutResult, Unit> function17 = function16;
                                                                                                final TextFieldValue textFieldValue6 = textFieldValue4;
                                                                                                final OffsetMapping offsetMapping6 = offsetMapping5;
                                                                                                final Density density5 = density4;
                                                                                                final int i53 = i51;
                                                                                                SimpleLayout.SimpleLayout(modifierBringIntoViewRequester, ComposableLambda3.rememberComposableLambda(-1172467467, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                                                    {
                                                                                                        super(2);
                                                                                                    }

                                                                                                    @Override // kotlin.jvm.functions.Function2
                                                                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                                                                        invoke(composer7, num.intValue());
                                                                                                        return Unit.INSTANCE;
                                                                                                    }

                                                                                                    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
                                                                                                    /*
                                                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                                                    */
                                                                                                    public final void invoke(Composer composer7, int i54) {
                                                                                                        boolean z36 = true;
                                                                                                        if (!composer7.shouldExecute((i54 & 3) != 2, i54 & 1)) {
                                                                                                            composer7.skipToGroupEnd();
                                                                                                            return;
                                                                                                        }
                                                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                                                            ComposerKt.traceEventStart(-1172467467, i54, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:579)");
                                                                                                        }
                                                                                                        final LegacyTextFieldState legacyTextFieldState10 = legacyTextFieldState9;
                                                                                                        final Function1<? super TextLayoutResult, Unit> function18 = function17;
                                                                                                        final TextFieldValue textFieldValue7 = textFieldValue6;
                                                                                                        final OffsetMapping offsetMapping7 = offsetMapping6;
                                                                                                        final Density density6 = density5;
                                                                                                        final int i55 = i53;
                                                                                                        MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                                                                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                                                                                            /* renamed from: measure-3p2s80s */
                                                                                                            public MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                                                                                                                Snapshot.Companion companion4 = Snapshot.INSTANCE;
                                                                                                                LegacyTextFieldState legacyTextFieldState11 = legacyTextFieldState10;
                                                                                                                Snapshot currentThreadSnapshot = companion4.getCurrentThreadSnapshot();
                                                                                                                Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                                                                                                Snapshot snapshotMakeCurrentNonObservable = companion4.makeCurrentNonObservable(currentThreadSnapshot);
                                                                                                                try {
                                                                                                                    TextLayoutResultProxy layoutResult = legacyTextFieldState11.getLayoutResult();
                                                                                                                    TextLayoutResult value2 = layoutResult != null ? layoutResult.getValue() : null;
                                                                                                                    Tuples3<Integer, Integer, TextLayoutResult> tuples3M5419layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m5419layout_EkL_Y$foundation_release(legacyTextFieldState10.getTextDelegate(), j, measureScope.getLayoutDirection(), value2);
                                                                                                                    int iIntValue = tuples3M5419layout_EkL_Y$foundation_release.component1().intValue();
                                                                                                                    int iIntValue2 = tuples3M5419layout_EkL_Y$foundation_release.component2().intValue();
                                                                                                                    TextLayoutResult textLayoutResultComponent3 = tuples3M5419layout_EkL_Y$foundation_release.component3();
                                                                                                                    if (!Intrinsics.areEqual(value2, textLayoutResultComponent3)) {
                                                                                                                        legacyTextFieldState10.setLayoutResult(new TextLayoutResultProxy(textLayoutResultComponent3, null, layoutResult != null ? layoutResult.getDecorationBoxCoordinates() : null, 2, null));
                                                                                                                        function18.invoke(textLayoutResultComponent3);
                                                                                                                        CoreTextFieldKt.notifyFocusedRect(legacyTextFieldState10, textFieldValue7, offsetMapping7);
                                                                                                                    }
                                                                                                                    legacyTextFieldState10.m5365setMinHeightForSingleLineField0680j_4(density6.mo5013toDpu2uoSUM(i55 == 1 ? TextDelegate2.ceilToIntPx(textLayoutResultComponent3.getLineBottom(0)) : 0));
                                                                                                                    return measureScope.layout(iIntValue, iIntValue2, MapsKt.mapOf(Tuples4.m3642to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(textLayoutResultComponent3.getFirstBaseline()))), Tuples4.m3642to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(textLayoutResultComponent3.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                                                                        public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                                                                        }

                                                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                                                                            invoke2(placementScope);
                                                                                                                            return Unit.INSTANCE;
                                                                                                                        }
                                                                                                                    });
                                                                                                                } finally {
                                                                                                                    companion4.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                                                                                                                }
                                                                                                            }

                                                                                                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                                                                                            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i56) {
                                                                                                                legacyTextFieldState10.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                                                                                return legacyTextFieldState10.getTextDelegate().getMaxIntrinsicWidth();
                                                                                                            }
                                                                                                        };
                                                                                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                                                                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer7, 0);
                                                                                                        CompositionLocalMap currentCompositionLocalMap = composer7.getCurrentCompositionLocalMap();
                                                                                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer7, companion4);
                                                                                                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                                                                        Function0<ComposeUiNode> constructor = companion5.getConstructor();
                                                                                                        if (composer7.getApplier() == null) {
                                                                                                            Composables.invalidApplier();
                                                                                                        }
                                                                                                        composer7.startReusableNode();
                                                                                                        if (composer7.getInserting()) {
                                                                                                            composer7.createNode(constructor);
                                                                                                        } else {
                                                                                                            composer7.useNode();
                                                                                                        }
                                                                                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer7);
                                                                                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicy, companion5.getSetMeasurePolicy());
                                                                                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                                                                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                                                                                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                                                        }
                                                                                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                                                                                                        composer7.endNode();
                                                                                                        TextFieldSelectionManager textFieldSelectionManager8 = textFieldSelectionManager7;
                                                                                                        if (legacyTextFieldState9.getHandleState() == HandleState.None || legacyTextFieldState9.getLayoutCoordinates() == null) {
                                                                                                            z36 = false;
                                                                                                        } else {
                                                                                                            LayoutCoordinates layoutCoordinates = legacyTextFieldState9.getLayoutCoordinates();
                                                                                                            Intrinsics.checkNotNull(layoutCoordinates);
                                                                                                            if (!layoutCoordinates.isAttached() || !z34) {
                                                                                                            }
                                                                                                        }
                                                                                                        CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager8, z36, composer7, 0);
                                                                                                        if (legacyTextFieldState9.getHandleState() == HandleState.Cursor && !z35 && z34) {
                                                                                                            composer7.startReplaceGroup(-7167858);
                                                                                                            CoreTextFieldKt.TextFieldCursorHandle(textFieldSelectionManager7, composer7, 0);
                                                                                                            composer7.endReplaceGroup();
                                                                                                        } else {
                                                                                                            composer7.startReplaceGroup(-7090978);
                                                                                                            composer7.endReplaceGroup();
                                                                                                        }
                                                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                                                            ComposerKt.traceEventEnd();
                                                                                                        }
                                                                                                    }
                                                                                                }, composer6, 54), composer6, 48, 0);
                                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                                    ComposerKt.traceEventEnd();
                                                                                                    return;
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            composer6.skipToGroupEnd();
                                                                                        }
                                                                                    }, composer5, 54), composer5, 6);
                                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                                        ComposerKt.traceEventEnd();
                                                                                    }
                                                                                }
                                                                            }, composer42, 54), composer42, 384);
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                            }
                                                                            visualTransformation3 = visualTransformation5;
                                                                            composer2 = composer42;
                                                                            i27 = i44;
                                                                            function14 = function15;
                                                                            z6 = z302;
                                                                            textFieldScrollerPosition2 = textFieldScrollerPosition3;
                                                                            brush2 = brush3;
                                                                            imeOptions2 = imeOptions7;
                                                                            interactionSource33 = interactionSource36;
                                                                            z4 = z24;
                                                                            keyboardActions2 = keyboardActions4;
                                                                            i28 = i41;
                                                                            z5 = z29;
                                                                            modifier3 = modifier5;
                                                                            textStyle3 = textStyle5;
                                                                            function32 = function332;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        zChangedInstance7 = ((i48 > 32 && composer3.changed(imeOptions7)) || (i46 & 48) == 32) | composer3.changedInstance(legacyTextFieldState6) | composer3.changedInstance(textInputService3) | (i42 == 4);
                                                        objRememberedValue10 = composer3.rememberedValue();
                                                        if (zChangedInstance7) {
                                                        }
                                                    }
                                                } else {
                                                    textInputService2 = textInputService;
                                                }
                                                z13 = true;
                                                z14 = zChanged4 | z13;
                                                objRememberedValue5 = composer3.rememberedValue();
                                                if (z14) {
                                                    objRememberedValue5 = new CoreTextFieldKt$CoreTextField$2$1(legacyTextFieldState, snapshotState4RememberUpdatedState, textInputService2, textFieldSelectionManager, imeOptions5, null);
                                                    snapshotState4 = snapshotState4RememberUpdatedState;
                                                    textInputService3 = textInputService2;
                                                    composer3.updateRememberedValue(objRememberedValue5);
                                                    final ImeOptions imeOptions72 = imeOptions5;
                                                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer3, 6);
                                                    zChangedInstance2 = composer3.changedInstance(legacyTextFieldState);
                                                    objRememberedValue6 = composer3.rememberedValue();
                                                    if (!zChangedInstance2) {
                                                        objRememberedValue6 = new Function1<Boolean, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1$1
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                                                invoke(bool.booleanValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(boolean z282) {
                                                                legacyTextFieldState.setInTouchMode(z282);
                                                            }
                                                        };
                                                        composer3.updateRememberedValue(objRememberedValue6);
                                                        Modifier modifierUpdateSelectionTouchMode2 = SelectionGestures3.updateSelectionTouchMode(companion2, (Function1) objRememberedValue6);
                                                        zChangedInstance3 = (i47 != 16384) | composer3.changedInstance(legacyTextFieldState) | (i45 != 2048) | composer3.changedInstance(offsetMapping2) | composer3.changedInstance(textFieldSelectionManager);
                                                        objRememberedValue7 = composer3.rememberedValue();
                                                        if (zChangedInstance3) {
                                                            final LegacyTextFieldState legacyTextFieldState42 = legacyTextFieldState;
                                                            final TextFieldSelectionManager textFieldSelectionManager32 = textFieldSelectionManager;
                                                            final boolean z282 = z7;
                                                            objRememberedValue7 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                                                    m5344invokek4lQ0M(offset.getPackedValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                                                                public final void m5344invokek4lQ0M(long j) {
                                                                    CoreTextFieldKt.tapToFocus(legacyTextFieldState42, focusRequester2, !z282);
                                                                    if (legacyTextFieldState42.getHasFocus() && z27) {
                                                                        if (legacyTextFieldState42.getHandleState() != HandleState.Selection) {
                                                                            TextLayoutResultProxy layoutResult = legacyTextFieldState42.getLayoutResult();
                                                                            if (layoutResult != null) {
                                                                                LegacyTextFieldState legacyTextFieldState52 = legacyTextFieldState42;
                                                                                TextFieldDelegate.INSTANCE.m5420setCursorOffsetULxng0E$foundation_release(j, layoutResult, legacyTextFieldState52.getProcessor(), offsetMapping2, legacyTextFieldState52.getOnValueChange());
                                                                                if (legacyTextFieldState52.getTextDelegate().getText().length() > 0) {
                                                                                    legacyTextFieldState52.setHandleState(HandleState.Cursor);
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        textFieldSelectionManager32.m5529deselect_kEHs6E$foundation_release(Offset.m6534boximpl(j));
                                                                    }
                                                                }
                                                            };
                                                            legacyTextFieldState2 = legacyTextFieldState42;
                                                            focusRequester = focusRequester2;
                                                            z15 = z27;
                                                            offsetMapping = offsetMapping2;
                                                            composer3.updateRememberedValue(objRememberedValue7);
                                                            z16 = z15;
                                                            FocusRequester focusRequester32 = focusRequester;
                                                            Modifier modifierPointerHoverIcon$default2 = PointerIcon5.pointerHoverIcon$default(SelectionGestures3.selectionGestureInput(TextFieldPressGestureFilter.tapPressTextFieldModifier(modifierUpdateSelectionTouchMode2, interactionSource36, z15, (Function1) objRememberedValue7), textFieldSelectionManager.getMouseSelectionObserver(), textFieldSelectionManager.getTouchSelectionObserver()), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                                                            zChangedInstance4 = composer3.changedInstance(legacyTextFieldState2) | (i42 != 4) | composer3.changedInstance(offsetMapping);
                                                            objRememberedValue8 = composer3.rememberedValue();
                                                            if (!zChangedInstance4) {
                                                                objRememberedValue8 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1$1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(1);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) throws Throwable {
                                                                        invoke2(drawScope);
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                    public final void invoke2(DrawScope drawScope) throws Throwable {
                                                                        TextLayoutResultProxy layoutResult = legacyTextFieldState2.getLayoutResult();
                                                                        if (layoutResult != null) {
                                                                            TextFieldValue textFieldValue32 = textFieldValue2;
                                                                            LegacyTextFieldState legacyTextFieldState52 = legacyTextFieldState2;
                                                                            OffsetMapping offsetMapping32 = offsetMapping;
                                                                            TextFieldDelegate.INSTANCE.m5418drawQ1vqE60$foundation_release(drawScope.getDrawContext().getCanvas(), textFieldValue32, legacyTextFieldState52.m5363getSelectionPreviewHighlightRanged9O1mEE(), legacyTextFieldState52.m5360getDeletionPreviewHighlightRanged9O1mEE(), offsetMapping32, layoutResult.getValue(), legacyTextFieldState52.getHighlightPaint(), legacyTextFieldState52.getSelectionBackgroundColor());
                                                                        }
                                                                    }
                                                                };
                                                                composer3.updateRememberedValue(objRememberedValue8);
                                                                final Modifier modifierDrawBehind2 = DrawModifierKt.drawBehind(companion2, (Function1) objRememberedValue8);
                                                                zChangedInstance5 = (i45 != 2048) | composer3.changedInstance(legacyTextFieldState2) | composer3.changed(windowInfo) | composer3.changedInstance(textFieldSelectionManager) | (i42 != 4) | composer3.changedInstance(offsetMapping);
                                                                objRememberedValue9 = composer3.rememberedValue();
                                                                if (zChangedInstance5) {
                                                                    final TextFieldValue textFieldValue32 = textFieldValue2;
                                                                    final OffsetMapping offsetMapping32 = offsetMapping;
                                                                    final LegacyTextFieldState legacyTextFieldState52 = legacyTextFieldState2;
                                                                    final TextFieldSelectionManager textFieldSelectionManager42 = textFieldSelectionManager;
                                                                    objRememberedValue9 = new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(1);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                                                            invoke2(layoutCoordinates);
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                        public final void invoke2(LayoutCoordinates layoutCoordinates) {
                                                                            legacyTextFieldState52.setLayoutCoordinates(layoutCoordinates);
                                                                            TextLayoutResultProxy layoutResult = legacyTextFieldState52.getLayoutResult();
                                                                            if (layoutResult != null) {
                                                                                layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
                                                                            }
                                                                            if (z16) {
                                                                                if (legacyTextFieldState52.getHandleState() == HandleState.Selection) {
                                                                                    if (legacyTextFieldState52.getShowFloatingToolbar() && windowInfo.isWindowFocused()) {
                                                                                        textFieldSelectionManager42.showSelectionToolbar$foundation_release();
                                                                                    } else {
                                                                                        textFieldSelectionManager42.hideSelectionToolbar$foundation_release();
                                                                                    }
                                                                                    legacyTextFieldState52.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager42, true));
                                                                                    legacyTextFieldState52.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager42, false));
                                                                                    legacyTextFieldState52.setShowCursorHandle(TextRange.m7640getCollapsedimpl(textFieldValue32.getSelection()));
                                                                                } else if (legacyTextFieldState52.getHandleState() == HandleState.Cursor) {
                                                                                    legacyTextFieldState52.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager42, true));
                                                                                }
                                                                                CoreTextFieldKt.notifyFocusedRect(legacyTextFieldState52, textFieldValue32, offsetMapping32);
                                                                                TextLayoutResultProxy layoutResult2 = legacyTextFieldState52.getLayoutResult();
                                                                                if (layoutResult2 != null) {
                                                                                    LegacyTextFieldState legacyTextFieldState62 = legacyTextFieldState52;
                                                                                    TextFieldValue textFieldValue4 = textFieldValue32;
                                                                                    OffsetMapping offsetMapping42 = offsetMapping32;
                                                                                    TextInputService3 inputSession = legacyTextFieldState62.getInputSession();
                                                                                    if (inputSession == null || !legacyTextFieldState62.getHasFocus()) {
                                                                                        return;
                                                                                    }
                                                                                    TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation_release(inputSession, textFieldValue4, offsetMapping42, layoutResult2);
                                                                                }
                                                                            }
                                                                        }
                                                                    };
                                                                    z17 = z16;
                                                                    composer3.updateRememberedValue(objRememberedValue9);
                                                                    final Modifier modifierOnGloballyPositioned3 = OnGloballyPositionedModifier3.onGloballyPositioned(companion2, (Function1) objRememberedValue9);
                                                                    final OffsetMapping offsetMapping42 = offsetMapping;
                                                                    boolean z292 = z17;
                                                                    CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier2 = new CoreTextFieldSemanticsModifier(transformedText, textFieldValue, legacyTextFieldState2, z7, z292, visualTransformation5 instanceof VisualTransformation2, offsetMapping42, textFieldSelectionManager, imeOptions72, focusRequester32);
                                                                    if (z292) {
                                                                        final LegacyTextFieldState legacyTextFieldState62 = legacyTextFieldState2;
                                                                        Modifier modifierCursor2 = TextFieldCursor.cursor(companion2, legacyTextFieldState62, textFieldValue, offsetMapping42, brush3, (z292 || z7 || !windowInfo.isWindowFocused() || legacyTextFieldState2.hasHighlight()) ? false : true);
                                                                        zChangedInstance6 = composer3.changedInstance(textFieldSelectionManager);
                                                                        Object objRememberedValue202 = composer3.rememberedValue();
                                                                        if (zChangedInstance6) {
                                                                        }
                                                                        objRememberedValue202 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1
                                                                            {
                                                                                super(1);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                                                final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager;
                                                                                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1$invoke$$inlined$onDispose$1
                                                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                                                    public void dispose() {
                                                                                        textFieldSelectionManager6.hideSelectionToolbar$foundation_release();
                                                                                    }
                                                                                };
                                                                            }
                                                                        };
                                                                        composer3.updateRememberedValue(objRememberedValue202);
                                                                        EffectsKt.DisposableEffect(textFieldSelectionManager, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue202, composer3, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                undoManager = undoManager2;
                                            }
                                            z12 = true;
                                            zChangedInstance = zChangedInstance9 | z12 | composer3.changedInstance(offsetMapping2) | composer3.changedInstance(coroutineScope) | composer3.changedInstance(bringIntoViewRequester2) | composer3.changedInstance(textFieldSelectionManager2);
                                            objRememberedValue4 = composer3.rememberedValue();
                                            if (zChangedInstance) {
                                                final boolean z252 = z11;
                                                final ImeOptions imeOptions62 = imeOptions4;
                                                final boolean z262 = z7;
                                                objRememberedValue4 = new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                                                        invoke2(focusState);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(FocusState focusState) {
                                                        TextLayoutResultProxy layoutResult;
                                                        if (legacyTextFieldState3.getHasFocus() == focusState.isFocused()) {
                                                            return;
                                                        }
                                                        legacyTextFieldState3.setHasFocus(focusState.isFocused());
                                                        if (!legacyTextFieldState3.getHasFocus() || !z252 || z262) {
                                                            CoreTextFieldKt.endInputSession(legacyTextFieldState3);
                                                        } else {
                                                            CoreTextFieldKt.startInputSession(textInputService4, legacyTextFieldState3, textFieldValue, imeOptions62, offsetMapping2);
                                                        }
                                                        if (focusState.isFocused() && (layoutResult = legacyTextFieldState3.getLayoutResult()) != null) {
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(bringIntoViewRequester2, textFieldValue, legacyTextFieldState3, layoutResult, offsetMapping2, null), 3, null);
                                                        }
                                                        if (focusState.isFocused()) {
                                                            return;
                                                        }
                                                        TextFieldSelectionManager.m5526deselect_kEHs6E$foundation_release$default(textFieldSelectionManager2, null, 1, null);
                                                    }
                                                };
                                                legacyTextFieldState = legacyTextFieldState3;
                                                textInputService = textInputService4;
                                                textFieldValue2 = textFieldValue;
                                                imeOptions5 = imeOptions62;
                                                textFieldSelectionManager = textFieldSelectionManager2;
                                                bringIntoViewRequester = bringIntoViewRequester2;
                                                composer3.updateRememberedValue(objRememberedValue4);
                                                final VisualTransformation visualTransformation52 = visualTransformation4;
                                                InteractionSource3 interactionSource362 = interactionSource35;
                                                Modifier modifierTextFieldFocusModifier2 = TextFieldGestureModifiers.textFieldFocusModifier(companion2, z11, focusRequester2, interactionSource362, (Function1) objRememberedValue4);
                                                if (z11) {
                                                    final boolean z272 = z11;
                                                    SnapshotState4 snapshotState4RememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf((z11 || z7) ? false : true), composer3, 0);
                                                    Unit unit2 = Unit.INSTANCE;
                                                    boolean zChanged42 = composer3.changed(snapshotState4RememberUpdatedState2) | composer3.changedInstance(legacyTextFieldState) | composer3.changedInstance(textInputService) | composer3.changedInstance(textFieldSelectionManager);
                                                    if (i48 > 32) {
                                                        textInputService2 = textInputService;
                                                        if ((i46 & 48) != 32) {
                                                            z13 = true;
                                                        }
                                                        z14 = zChanged42 | z13;
                                                        objRememberedValue5 = composer3.rememberedValue();
                                                        if (z14) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            z11 = z8;
                                        }
                                        orientation = Orientation.Vertical;
                                        Orientation orientation32 = orientation;
                                        if (textFieldScrollerPosition3 == null) {
                                        }
                                        if (textFieldScrollerPosition4.getOrientation() != orientation2) {
                                        }
                                    } else {
                                        int i49 = i36;
                                        visualTransformation4 = none;
                                        modifier4 = modifier2;
                                        imeOptions4 = imeOptions3;
                                        z8 = z21;
                                        function15 = function13;
                                        i29 = i49;
                                        int i50 = i35;
                                        z9 = z20;
                                        interactionSource34 = interactionSource32;
                                        i30 = i50;
                                        i31 = i24;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i5 & 2048) != 0) {
                                        i24 &= -113;
                                    }
                                    Brush brush4 = brush2;
                                    visualTransformation4 = visualTransformation2;
                                    solidColor = brush4;
                                    keyboardActions3 = keyboardActions;
                                    z8 = z2;
                                    z7 = z3;
                                    function3M5343getLambda1$foundation_release = function3;
                                    composer3 = composerStartRestartGroup;
                                    interactionSource34 = interactionSource32;
                                    function15 = function13;
                                    modifier4 = modifier2;
                                    i31 = i24;
                                    z9 = z;
                                    i30 = i;
                                    i29 = i2;
                                    imeOptions4 = imeOptions;
                                }
                                textFieldScrollerPosition3 = textFieldScrollerPosition;
                                composer3.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                objRememberedValue = composer3.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                }
                                final FocusRequester focusRequester22 = (FocusRequester) objRememberedValue;
                                objRememberedValue2 = composer3.rememberedValue();
                                int i402 = i6;
                                if (objRememberedValue2 == companion.getEmpty()) {
                                }
                                LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter32 = (LegacyPlatformTextInputServiceAdapter) objRememberedValue2;
                                objRememberedValue3 = composer3.rememberedValue();
                                Brush brush32 = solidColor;
                                if (objRememberedValue3 == companion.getEmpty()) {
                                }
                                final TextInputService textInputService42 = (TextInputService) objRememberedValue3;
                                Density density22 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                FontFamily.Resolver resolver22 = (FontFamily.Resolver) composer3.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                                long selectionBackgroundColor2 = ((SelectionColors) composer3.consume(TextSelectionColors2.getLocalTextSelectionColors())).getSelectionBackgroundColor();
                                FocusManager focusManager22 = (FocusManager) composer3.consume(CompositionLocalsKt.getLocalFocusManager());
                                final WindowInfo windowInfo2 = (WindowInfo) composer3.consume(CompositionLocalsKt.getLocalWindowInfo());
                                SoftwareKeyboardController softwareKeyboardController2 = (SoftwareKeyboardController) composer3.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                                final int i412 = i29;
                                if (i30 != 1) {
                                }
                                orientation = Orientation.Vertical;
                                Orientation orientation322 = orientation;
                                if (textFieldScrollerPosition3 == null) {
                                }
                                if (textFieldScrollerPosition4.getOrientation() != orientation2) {
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.6
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i51) {
                                        CoreTextFieldKt.CoreTextField(textFieldValue, function1, modifier3, textStyle3, visualTransformation3, function14, interactionSource33, brush2, z4, i27, i28, imeOptions2, keyboardActions2, z5, z6, function32, textFieldScrollerPosition2, composer5, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), RecomposeScopeImpl4.updateChangedFlags(i4), i5);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i6 |= 805306368;
                        i15 = i14;
                        i16 = i5 & 1024;
                        if (i16 == 0) {
                        }
                        if ((i4 & 48) == 0) {
                        }
                        int i322 = i18;
                        i19 = i5 & 4096;
                        if (i19 == 0) {
                        }
                        i21 = i5 & 8192;
                        if (i21 == 0) {
                        }
                        i23 = i5 & 16384;
                        if (i23 == 0) {
                        }
                        i25 = i5 & 32768;
                        if (i25 == 0) {
                        }
                        i26 = i5 & 65536;
                        if (i26 == 0) {
                        }
                        if (composerStartRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i24 & 599187) != 599186, i6 & 1)) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    visualTransformation2 = visualTransformation;
                    i10 = i5 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i5 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 128;
                    if (i12 != 0) {
                    }
                    i13 = i5 & 256;
                    if (i13 != 0) {
                    }
                    i14 = i5 & 512;
                    if (i14 == 0) {
                    }
                    i15 = i14;
                    i16 = i5 & 1024;
                    if (i16 == 0) {
                    }
                    if ((i4 & 48) == 0) {
                    }
                    int i3222 = i18;
                    i19 = i5 & 4096;
                    if (i19 == 0) {
                    }
                    i21 = i5 & 8192;
                    if (i21 == 0) {
                    }
                    i23 = i5 & 16384;
                    if (i23 == 0) {
                    }
                    i25 = i5 & 32768;
                    if (i25 == 0) {
                    }
                    i26 = i5 & 65536;
                    if (i26 == 0) {
                    }
                    if (composerStartRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i24 & 599187) != 599186, i6 & 1)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                textStyle2 = textStyle;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                visualTransformation2 = visualTransformation;
                i10 = i5 & 32;
                if (i10 != 0) {
                }
                i11 = i5 & 64;
                if (i11 != 0) {
                }
                i12 = i5 & 128;
                if (i12 != 0) {
                }
                i13 = i5 & 256;
                if (i13 != 0) {
                }
                i14 = i5 & 512;
                if (i14 == 0) {
                }
                i15 = i14;
                i16 = i5 & 1024;
                if (i16 == 0) {
                }
                if ((i4 & 48) == 0) {
                }
                int i32222 = i18;
                i19 = i5 & 4096;
                if (i19 == 0) {
                }
                i21 = i5 & 8192;
                if (i21 == 0) {
                }
                i23 = i5 & 16384;
                if (i23 == 0) {
                }
                i25 = i5 & 32768;
                if (i25 == 0) {
                }
                i26 = i5 & 65536;
                if (i26 == 0) {
                }
                if (composerStartRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i24 & 599187) != 599186, i6 & 1)) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            textStyle2 = textStyle;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            visualTransformation2 = visualTransformation;
            i10 = i5 & 32;
            if (i10 != 0) {
            }
            i11 = i5 & 64;
            if (i11 != 0) {
            }
            i12 = i5 & 128;
            if (i12 != 0) {
            }
            i13 = i5 & 256;
            if (i13 != 0) {
            }
            i14 = i5 & 512;
            if (i14 == 0) {
            }
            i15 = i14;
            i16 = i5 & 1024;
            if (i16 == 0) {
            }
            if ((i4 & 48) == 0) {
            }
            int i322222 = i18;
            i19 = i5 & 4096;
            if (i19 == 0) {
            }
            i21 = i5 & 8192;
            if (i21 == 0) {
            }
            i23 = i5 & 16384;
            if (i23 == 0) {
            }
            i25 = i5 & 32768;
            if (i25 == 0) {
            }
            i26 = i5 & 65536;
            if (i26 == 0) {
            }
            if (composerStartRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i24 & 599187) != 599186, i6 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        modifier2 = modifier;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        textStyle2 = textStyle;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        visualTransformation2 = visualTransformation;
        i10 = i5 & 32;
        if (i10 != 0) {
        }
        i11 = i5 & 64;
        if (i11 != 0) {
        }
        i12 = i5 & 128;
        if (i12 != 0) {
        }
        i13 = i5 & 256;
        if (i13 != 0) {
        }
        i14 = i5 & 512;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i5 & 1024;
        if (i16 == 0) {
        }
        if ((i4 & 48) == 0) {
        }
        int i3222222 = i18;
        i19 = i5 & 4096;
        if (i19 == 0) {
        }
        i21 = i5 & 8192;
        if (i21 == 0) {
        }
        i23 = i5 & 16384;
        if (i23 == 0) {
        }
        i25 = i5 & 32768;
        if (i25 == 0) {
        }
        i26 = i5 & 65536;
        if (i26 == 0) {
        }
        if (composerStartRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i24 & 599187) != 599186, i6 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CoreTextFieldRootBox(final Modifier modifier, final TextFieldSelectionManager textFieldSelectionManager, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-20551815);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(textFieldSelectionManager) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-20551815, i2, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:668)");
            }
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ContextMenu_androidKt.ContextMenuArea(textFieldSelectionManager, function2, composerStartRestartGroup, (i2 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextFieldRootBox.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    CoreTextFieldKt.CoreTextFieldRootBox(modifier, textFieldSelectionManager, function2, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final Modifier previewKeyEventToDeselectOnBack(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final TextFieldSelectionManager textFieldSelectionManager) {
        return KeyInputModifier2.onPreviewKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.previewKeyEventToDeselectOnBack.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m5347invokeZmokQxo(keyEvent.getNativeKeyEvent());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m5347invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean z;
                if (legacyTextFieldState.getHandleState() == HandleState.Selection && KeyEventHelpers_androidKt.m5349cancelsTextSelectionZmokQxo(keyEvent)) {
                    z = true;
                    TextFieldSelectionManager.m5526deselect_kEHs6E$foundation_release$default(textFieldSelectionManager, null, 1, null);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public static final void tapToFocus(LegacyTextFieldState legacyTextFieldState, FocusRequester focusRequester, boolean z) {
        SoftwareKeyboardController keyboardController;
        if (!legacyTextFieldState.getHasFocus()) {
            FocusRequester.m6497requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        } else {
            if (!z || (keyboardController = legacyTextFieldState.getKeyboardController()) == null) {
                return;
            }
            keyboardController.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startInputSession(TextInputService textInputService, LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping) {
        legacyTextFieldState.setInputSession(TextFieldDelegate.INSTANCE.onFocus$foundation_release(textInputService, textFieldValue, legacyTextFieldState.getProcessor(), imeOptions, legacyTextFieldState.getOnValueChange(), legacyTextFieldState.getOnImeActionPerformed()));
        notifyFocusedRect(legacyTextFieldState, textFieldValue, offsetMapping);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endInputSession(LegacyTextFieldState legacyTextFieldState) {
        TextInputService3 inputSession = legacyTextFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.INSTANCE.onBlur$foundation_release(inputSession, legacyTextFieldState.getProcessor(), legacyTextFieldState.getOnValueChange());
        }
        legacyTextFieldState.setInputSession(null);
    }

    public static final Object bringSelectionEndIntoView(BringIntoViewRequester bringIntoViewRequester, TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, Continuation<? super Unit> continuation) {
        Rect rect;
        int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m7643getMaximpl(textFieldValue.getSelection()));
        if (iOriginalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
            rect = textLayoutResult.getBoundingBox(iOriginalToTransformed);
        } else if (iOriginalToTransformed != 0) {
            rect = textLayoutResult.getBoundingBox(iOriginalToTransformed - 1);
        } else {
            rect = new Rect(0.0f, 0.0f, 1.0f, (int) (TextFieldDelegate4.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null) & 4294967295L));
        }
        Object objBringIntoView = bringIntoViewRequester.bringIntoView(rect, continuation);
        return objBringIntoView == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objBringIntoView : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectionToolbarAndHandles(final TextFieldSelectionManager textFieldSelectionManager, final boolean z, Composer composer, final int i) {
        int i2;
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        Composer composerStartRestartGroup = composer.startRestartGroup(626339208);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(626339208, i2, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1018)");
            }
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1290924834);
                LegacyTextFieldState state = textFieldSelectionManager.getState();
                TextLayoutResult textLayoutResult = null;
                if (state != null && (layoutResult = state.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                    LegacyTextFieldState state2 = textFieldSelectionManager.getState();
                    if (!(state2 != null ? state2.getIsLayoutResultStale() : true)) {
                        textLayoutResult = value;
                    }
                }
                if (textLayoutResult == null) {
                    composerStartRestartGroup.startReplaceGroup(-1290601288);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1290601287);
                    if (!TextRange.m7640getCollapsedimpl(textFieldSelectionManager.getValue$foundation_release().getSelection())) {
                        composerStartRestartGroup.startReplaceGroup(-1685230508);
                        int iOriginalToTransformed = textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m7646getStartimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()));
                        int iOriginalToTransformed2 = textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m7641getEndimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()));
                        ResolvedTextDirection bidiRunDirection = textLayoutResult.getBidiRunDirection(iOriginalToTransformed);
                        ResolvedTextDirection bidiRunDirection2 = textLayoutResult.getBidiRunDirection(Math.max(iOriginalToTransformed2 - 1, 0));
                        LegacyTextFieldState state3 = textFieldSelectionManager.getState();
                        if (state3 != null && state3.getShowSelectionHandleStart()) {
                            composerStartRestartGroup.startReplaceGroup(-1684812473);
                            TextFieldSelectionManagerKt.TextFieldSelectionHandle(true, bidiRunDirection, textFieldSelectionManager, composerStartRestartGroup, ((i2 << 6) & 896) | 6);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1684548198);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        LegacyTextFieldState state4 = textFieldSelectionManager.getState();
                        if (state4 != null && state4.getShowSelectionHandleEnd()) {
                            composerStartRestartGroup.startReplaceGroup(-1684464312);
                            TextFieldSelectionManagerKt.TextFieldSelectionHandle(false, bidiRunDirection2, textFieldSelectionManager, composerStartRestartGroup, ((i2 << 6) & 896) | 6);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1684200998);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1684179174);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    LegacyTextFieldState state5 = textFieldSelectionManager.getState();
                    if (state5 != null) {
                        if (textFieldSelectionManager.isTextChanged$foundation_release()) {
                            state5.setShowFloatingToolbar(false);
                        }
                        if (state5.getHasFocus()) {
                            if (state5.getShowFloatingToolbar()) {
                                textFieldSelectionManager.showSelectionToolbar$foundation_release();
                            } else {
                                textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(651160447);
                composerStartRestartGroup.endReplaceGroup();
                textFieldSelectionManager.hideSelectionToolbar$foundation_release();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.SelectionToolbarAndHandles.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager, z, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void TextFieldCursorHandle(final TextFieldSelectionManager textFieldSelectionManager, Composer composer, final int i) {
        int i2;
        AnnotatedString transformedText$foundation_release;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1436003720);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1436003720, i2, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1065)");
            }
            LegacyTextFieldState state = textFieldSelectionManager.getState();
            if (state == null || !state.getShowCursorHandle() || (transformedText$foundation_release = textFieldSelectionManager.getTransformedText$foundation_release()) == null || transformedText$foundation_release.length() <= 0) {
                composerStartRestartGroup.startReplaceGroup(-288632802);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-289940723);
                boolean zChanged = composerStartRestartGroup.changed(textFieldSelectionManager);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = textFieldSelectionManager.cursorDragObserver$foundation_release();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final LongPressTextDragObserver2 longPressTextDragObserver2 = (LongPressTextDragObserver2) objRememberedValue;
                final long jM5531getCursorPositiontuRUvjQ$foundation_release = textFieldSelectionManager.m5531getCursorPositiontuRUvjQ$foundation_release((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity()));
                boolean zChanged2 = composerStartRestartGroup.changed(jM5531getCursorPositiontuRUvjQ$foundation_release);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new SelectionHandles2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1
                        @Override // androidx.compose.foundation.text.selection.SelectionHandles2
                        /* renamed from: provide-F1C5BW0, reason: not valid java name */
                        public final long mo5345provideF1C5BW0() {
                            return jM5531getCursorPositiontuRUvjQ$foundation_release;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                SelectionHandles2 selectionHandles2 = (SelectionHandles2) objRememberedValue2;
                Modifier.Companion companion = Modifier.INSTANCE;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(longPressTextDragObserver2) | composerStartRestartGroup.changedInstance(textFieldSelectionManager);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1

                        /* compiled from: CoreTextField.kt */
                        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", m3645f = "CoreTextField.kt", m3646l = {}, m3647m = "invokeSuspend")
                        /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1 */
                        static final class C13461 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ TextFieldSelectionManager $manager;
                            final /* synthetic */ LongPressTextDragObserver2 $observer;
                            final /* synthetic */ PointerInputScope $this_pointerInput;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C13461(PointerInputScope pointerInputScope, LongPressTextDragObserver2 longPressTextDragObserver2, TextFieldSelectionManager textFieldSelectionManager, Continuation<? super C13461> continuation) {
                                super(2, continuation);
                                this.$this_pointerInput = pointerInputScope;
                                this.$observer = longPressTextDragObserver2;
                                this.$manager = textFieldSelectionManager;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C13461 c13461 = new C13461(this.$this_pointerInput, this.$observer, this.$manager, continuation);
                                c13461.L$0 = obj;
                                return c13461;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((C13461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                                CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new AnonymousClass1(this.$this_pointerInput, this.$observer, null), 1, null);
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new AnonymousClass2(this.$this_pointerInput, this.$manager, null), 1, null);
                                return Unit.INSTANCE;
                            }

                            /* compiled from: CoreTextField.kt */
                            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", m3645f = "CoreTextField.kt", m3646l = {1078}, m3647m = "invokeSuspend")
                            /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1, reason: invalid class name */
                            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ LongPressTextDragObserver2 $observer;
                                final /* synthetic */ PointerInputScope $this_pointerInput;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(PointerInputScope pointerInputScope, LongPressTextDragObserver2 longPressTextDragObserver2, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$this_pointerInput = pointerInputScope;
                                    this.$observer = longPressTextDragObserver2;
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$this_pointerInput, this.$observer, continuation);
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
                                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                                        LongPressTextDragObserver2 longPressTextDragObserver2 = this.$observer;
                                        this.label = 1;
                                        if (LongPressTextDragObserver.detectDownAndDragGesturesWithObserver(pointerInputScope, longPressTextDragObserver2, this) == coroutine_suspended) {
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

                            /* compiled from: CoreTextField.kt */
                            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", m3645f = "CoreTextField.kt", m3646l = {1081}, m3647m = "invokeSuspend")
                            /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2, reason: invalid class name */
                            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ TextFieldSelectionManager $manager;
                                final /* synthetic */ PointerInputScope $this_pointerInput;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass2(PointerInputScope pointerInputScope, TextFieldSelectionManager textFieldSelectionManager, Continuation<? super AnonymousClass2> continuation) {
                                    super(2, continuation);
                                    this.$this_pointerInput = pointerInputScope;
                                    this.$manager = textFieldSelectionManager;
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass2(this.$this_pointerInput, this.$manager, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                                        final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
                                        Function1<Offset, Unit> function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.TextFieldCursorHandle.2.1.1.2.1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                                m5346invokek4lQ0M(offset.getPackedValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                                            public final void m5346invokek4lQ0M(long j) {
                                                textFieldSelectionManager.showSelectionToolbar$foundation_release();
                                            }
                                        };
                                        this.label = 1;
                                        if (TapGestureDetector4.detectTapGestures$default(pointerInputScope, null, null, null, function1, this, 7, null) == coroutine_suspended) {
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
                        }

                        @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                            Object objCoroutineScope = CoroutineScope2.coroutineScope(new C13461(pointerInputScope, longPressTextDragObserver2, textFieldSelectionManager, null), continuation);
                            return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, longPressTextDragObserver2, (PointerInputEventHandler) objRememberedValue3);
                boolean zChanged3 = composerStartRestartGroup.changed(jM5531getCursorPositiontuRUvjQ$foundation_release);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            semanticsPropertyReceiver.set(SelectionHandles5.getSelectionHandleInfoKey(), new SelectionHandleInfo(Handle.Cursor, jM5531getCursorPositiontuRUvjQ$foundation_release, SelectionHandles3.Middle, true, null));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                AndroidCursorHandle_androidKt.m5330CursorHandleUSBMPiE(selectionHandles2, SemanticsModifier6.semantics$default(modifierPointerInput, false, (Function1) objRememberedValue4, 1, null), 0L, composerStartRestartGroup, 0, 4);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.TextFieldCursorHandle.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    CoreTextFieldKt.TextFieldCursorHandle(textFieldSelectionManager, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyFocusedRect(LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
            if (layoutResult == null) {
                return;
            }
            TextInputService3 inputSession = legacyTextFieldState.getInputSession();
            if (inputSession == null) {
                return;
            }
            LayoutCoordinates layoutCoordinates = legacyTextFieldState.getLayoutCoordinates();
            if (layoutCoordinates == null) {
                return;
            }
            TextFieldDelegate.INSTANCE.notifyFocusedRect$foundation_release(textFieldValue, legacyTextFieldState.getTextDelegate(), layoutResult.getValue(), layoutCoordinates, inputSession, legacyTextFieldState.getHasFocus(), offsetMapping);
            Unit unit = Unit.INSTANCE;
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }
}
