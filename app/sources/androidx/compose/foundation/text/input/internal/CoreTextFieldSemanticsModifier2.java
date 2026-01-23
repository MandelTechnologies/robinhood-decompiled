package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p011ui.autofill.ContentDataType;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.node.DelegatableNode2;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.SemanticsModifierNode;
import androidx.compose.p011ui.node.SemanticsModifierNode2;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRange2;
import androidx.compose.p011ui.text.input.CommitTextCommand;
import androidx.compose.p011ui.text.input.DeleteAllCommand;
import androidx.compose.p011ui.text.input.EditCommand;
import androidx.compose.p011ui.text.input.FinishComposingTextCommand;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.p011ui.text.input.ImeOptions;
import androidx.compose.p011ui.text.input.OffsetMapping;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.input.TextInputService3;
import androidx.compose.p011ui.text.input.TransformedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: CoreTextFieldSemanticsModifier.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b1\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\u0019*\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ]\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010\u0016R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010/\u001a\u0004\b4\u00101\"\u0004\b5\u00103R\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010/\u001a\u0004\b\f\u00101\"\u0004\b6\u00103R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u00101¨\u0006M"}, m3636d2 = {"Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/text/input/TransformedText;", "transformedText", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "state", "", "readOnly", "enabled", "isPassword", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "<init>", "(Landroidx/compose/ui/text/input/TransformedText;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/LegacyTextFieldState;ZZZLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/focus/FocusRequester;)V", "", "text", "", "handleTextUpdateFromSemantics", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Ljava/lang/String;ZZ)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "updateNodeSemantics", "Landroidx/compose/ui/text/input/TransformedText;", "getTransformedText", "()Landroidx/compose/ui/text/input/TransformedText;", "setTransformedText", "(Landroidx/compose/ui/text/input/TransformedText;)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "getValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getState", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "setState", "(Landroidx/compose/foundation/text/LegacyTextFieldState;)V", "Z", "getReadOnly", "()Z", "setReadOnly", "(Z)V", "getEnabled", "setEnabled", "setPassword", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "setOffsetMapping", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "setManager", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "Landroidx/compose/ui/text/input/ImeOptions;", "getImeOptions", "()Landroidx/compose/ui/text/input/ImeOptions;", "setImeOptions", "(Landroidx/compose/ui/text/input/ImeOptions;)V", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "getShouldMergeDescendantSemantics", "shouldMergeDescendantSemantics", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode, reason: use source file name */
/* loaded from: classes4.dex */
public final class CoreTextFieldSemanticsModifier2 extends DelegatingNode implements SemanticsModifierNode {
    private boolean enabled;
    private FocusRequester focusRequester;
    private ImeOptions imeOptions;
    private boolean isPassword;
    private TextFieldSelectionManager manager;
    private OffsetMapping offsetMapping;
    private boolean readOnly;
    private LegacyTextFieldState state;
    private TransformedText transformedText;
    private TextFieldValue value;

    @Override // androidx.compose.p011ui.node.SemanticsModifierNode
    /* renamed from: getShouldMergeDescendantSemantics */
    public boolean getMergeDescendants() {
        return true;
    }

    public final TextFieldValue getValue() {
        return this.value;
    }

    public final LegacyTextFieldState getState() {
        return this.state;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final TextFieldSelectionManager getManager() {
        return this.manager;
    }

    public final ImeOptions getImeOptions() {
        return this.imeOptions;
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public CoreTextFieldSemanticsModifier2(TransformedText transformedText, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, boolean z, boolean z2, boolean z3, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, FocusRequester focusRequester) {
        this.transformedText = transformedText;
        this.value = textFieldValue;
        this.state = legacyTextFieldState;
        this.readOnly = z;
        this.enabled = z2;
        this.isPassword = z3;
        this.offsetMapping = offsetMapping;
        this.manager = textFieldSelectionManager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
        textFieldSelectionManager.setRequestAutofillAction$foundation_release(new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.1
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
                DelegatableNode2.requestAutofill(CoreTextFieldSemanticsModifier2.this);
            }
        });
    }

    @Override // androidx.compose.p011ui.node.SemanticsModifierNode
    public void applySemantics(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setInputText(semanticsPropertyReceiver, this.value.getText());
        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, this.transformedText.getText());
        SemanticsPropertiesKt.m7497setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, this.value.getSelection());
        SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, ContentDataType.INSTANCE.getText());
        SemanticsPropertiesKt.onAutofillText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(AnnotatedString annotatedString) {
                CoreTextFieldSemanticsModifier2.this.getState().setJustAutofilled(true);
                CoreTextFieldSemanticsModifier2.this.getState().setAutofillHighlightOn(true);
                CoreTextFieldSemanticsModifier2 coreTextFieldSemanticsModifier2 = CoreTextFieldSemanticsModifier2.this;
                coreTextFieldSemanticsModifier2.handleTextUpdateFromSemantics(coreTextFieldSemanticsModifier2.getState(), annotatedString.getText(), CoreTextFieldSemanticsModifier2.this.getReadOnly(), CoreTextFieldSemanticsModifier2.this.getEnabled());
                return Boolean.TRUE;
            }
        }, 1, null);
        if (!this.enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        if (this.isPassword) {
            SemanticsPropertiesKt.password(semanticsPropertyReceiver);
        }
        boolean z = this.enabled && !this.readOnly;
        SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(List<TextLayoutResult> list) {
                boolean z2;
                if (CoreTextFieldSemanticsModifier2.this.getState().getLayoutResult() != null) {
                    TextLayoutResultProxy layoutResult = CoreTextFieldSemanticsModifier2.this.getState().getLayoutResult();
                    Intrinsics.checkNotNull(layoutResult);
                    list.add(layoutResult.getValue());
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        }, 1, null);
        if (z) {
            SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(AnnotatedString annotatedString) {
                    CoreTextFieldSemanticsModifier2 coreTextFieldSemanticsModifier2 = CoreTextFieldSemanticsModifier2.this;
                    coreTextFieldSemanticsModifier2.handleTextUpdateFromSemantics(coreTextFieldSemanticsModifier2.getState(), annotatedString.getText(), CoreTextFieldSemanticsModifier2.this.getReadOnly(), CoreTextFieldSemanticsModifier2.this.getEnabled());
                    return Boolean.TRUE;
                }
            }, 1, null);
            SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(AnnotatedString annotatedString) {
                    Unit unit;
                    if (CoreTextFieldSemanticsModifier2.this.getReadOnly() || !CoreTextFieldSemanticsModifier2.this.getEnabled()) {
                        return Boolean.FALSE;
                    }
                    TextInputService3 inputSession = CoreTextFieldSemanticsModifier2.this.getState().getInputSession();
                    if (inputSession != null) {
                        CoreTextFieldSemanticsModifier2 coreTextFieldSemanticsModifier2 = CoreTextFieldSemanticsModifier2.this;
                        TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)}), coreTextFieldSemanticsModifier2.getState().getProcessor(), coreTextFieldSemanticsModifier2.getState().getOnValueChange(), inputSession);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        CoreTextFieldSemanticsModifier2 coreTextFieldSemanticsModifier22 = CoreTextFieldSemanticsModifier2.this;
                        coreTextFieldSemanticsModifier22.getState().getOnValueChange().invoke(new TextFieldValue(StringsKt.replaceRange(coreTextFieldSemanticsModifier22.getValue().getText(), TextRange.m7646getStartimpl(coreTextFieldSemanticsModifier22.getValue().getSelection()), TextRange.m7641getEndimpl(coreTextFieldSemanticsModifier22.getValue().getSelection()), annotatedString).toString(), TextRange2.TextRange(TextRange.m7646getStartimpl(coreTextFieldSemanticsModifier22.getValue().getSelection()) + annotatedString.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                    }
                    return Boolean.TRUE;
                }
            }, 1, null);
        }
        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.5
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
            }

            public final Boolean invoke(int i, int i2, boolean z2) {
                if (!z2) {
                    i = CoreTextFieldSemanticsModifier2.this.getOffsetMapping().transformedToOriginal(i);
                }
                if (!z2) {
                    i2 = CoreTextFieldSemanticsModifier2.this.getOffsetMapping().transformedToOriginal(i2);
                }
                boolean z3 = false;
                if (CoreTextFieldSemanticsModifier2.this.getEnabled() && (i != TextRange.m7646getStartimpl(CoreTextFieldSemanticsModifier2.this.getValue().getSelection()) || i2 != TextRange.m7641getEndimpl(CoreTextFieldSemanticsModifier2.this.getValue().getSelection()))) {
                    if (Math.min(i, i2) >= 0 && Math.max(i, i2) <= CoreTextFieldSemanticsModifier2.this.getValue().getText().length()) {
                        if (z2 || i == i2) {
                            CoreTextFieldSemanticsModifier2.this.getManager().exitSelectionMode$foundation_release();
                        } else {
                            TextFieldSelectionManager.enterSelectionMode$foundation_release$default(CoreTextFieldSemanticsModifier2.this.getManager(), false, 1, null);
                        }
                        CoreTextFieldSemanticsModifier2.this.getState().getOnValueChange().invoke(new TextFieldValue(CoreTextFieldSemanticsModifier2.this.getValue().getText(), TextRange2.TextRange(i, i2), (TextRange) null, 4, (DefaultConstructorMarker) null));
                        z3 = true;
                    } else {
                        CoreTextFieldSemanticsModifier2.this.getManager().exitSelectionMode$foundation_release();
                    }
                }
                return Boolean.valueOf(z3);
            }
        }, 1, null);
        SemanticsPropertiesKt.m7494onImeAction9UiTYpY$default(semanticsPropertyReceiver, this.imeOptions.getImeAction(), null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                CoreTextFieldSemanticsModifier2.this.getState().getOnImeActionPerformed().invoke(ImeAction.m7739boximpl(CoreTextFieldSemanticsModifier2.this.getImeOptions().getImeAction()));
                return Boolean.TRUE;
            }
        }, 2, null);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                CoreTextFieldKt.tapToFocus(CoreTextFieldSemanticsModifier2.this.getState(), CoreTextFieldSemanticsModifier2.this.getFocusRequester(), !CoreTextFieldSemanticsModifier2.this.getReadOnly());
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.8
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                TextFieldSelectionManager.enterSelectionMode$foundation_release$default(CoreTextFieldSemanticsModifier2.this.getManager(), false, 1, null);
                return Boolean.TRUE;
            }
        }, 1, null);
        if (!TextRange.m7640getCollapsedimpl(this.value.getSelection()) && !this.isPassword) {
            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.9
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    TextFieldSelectionManager.copy$foundation_release$default(CoreTextFieldSemanticsModifier2.this.getManager(), false, 1, null);
                    return Boolean.TRUE;
                }
            }, 1, null);
            if (this.enabled && !this.readOnly) {
                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.10
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        CoreTextFieldSemanticsModifier2.this.getManager().cut$foundation_release();
                        return Boolean.TRUE;
                    }
                }, 1, null);
            }
        }
        if (!this.enabled || this.readOnly) {
            return;
        }
        SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.11
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                CoreTextFieldSemanticsModifier2.this.getManager().paste$foundation_release();
                return Boolean.TRUE;
            }
        }, 1, null);
    }

    public final void updateNodeSemantics(TransformedText transformedText, TextFieldValue value, LegacyTextFieldState state, boolean readOnly, boolean enabled, boolean isPassword, OffsetMapping offsetMapping, TextFieldSelectionManager manager, ImeOptions imeOptions, FocusRequester focusRequester) {
        boolean z = this.enabled;
        boolean z2 = false;
        boolean z3 = z && !this.readOnly;
        boolean z4 = this.isPassword;
        ImeOptions imeOptions2 = this.imeOptions;
        TextFieldSelectionManager textFieldSelectionManager = this.manager;
        if (enabled && !readOnly) {
            z2 = true;
        }
        this.transformedText = transformedText;
        this.value = value;
        this.state = state;
        this.readOnly = readOnly;
        this.enabled = enabled;
        this.offsetMapping = offsetMapping;
        this.manager = manager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
        if (enabled != z || z2 != z3 || !Intrinsics.areEqual(imeOptions, imeOptions2) || isPassword != z4 || !TextRange.m7640getCollapsedimpl(value.getSelection())) {
            SemanticsModifierNode2.invalidateSemantics(this);
        }
        if (Intrinsics.areEqual(manager, textFieldSelectionManager)) {
            return;
        }
        manager.setRequestAutofillAction$foundation_release(new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.updateNodeSemantics.1
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
                DelegatableNode2.requestAutofill(CoreTextFieldSemanticsModifier2.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTextUpdateFromSemantics(LegacyTextFieldState state, String text, boolean readOnly, boolean enabled) {
        Unit unit;
        if (readOnly || !enabled) {
            return;
        }
        TextInputService3 inputSession = state.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(text, 1)}), state.getProcessor(), state.getOnValueChange(), inputSession);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            state.getOnValueChange().invoke(new TextFieldValue(text, TextRange2.TextRange(text.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
        }
    }
}
