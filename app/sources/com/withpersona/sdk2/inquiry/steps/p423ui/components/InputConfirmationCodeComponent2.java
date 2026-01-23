package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.content.Context;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroup2;
import com.google.android.material.textfield.TextInputLayout;
import com.squareup.workflow1.p415ui.TextController;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputConfirmationCode;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ContextUtils3;
import com.withpersona.sdk2.inquiry.shared.TextChangeListener;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.inputConfirmation.InputConfirmationComponentUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2Ui2faAuthBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextInputLayoutStyling;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* compiled from: InputConfirmationCodeComponent.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\r\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u000f\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00112\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;", "config", "Landroidx/constraintlayout/widget/ConstraintLayout;", "makeView", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/EditText;", "editText", "Lkotlin/Function0;", "", "moveToPreviousEditText", "setupDeleteOnEmptyEditTextListener", "(Landroid/widget/EditText;Lkotlin/jvm/functions/Function0;)V", "setupFocusChangeListener", "(Landroid/widget/EditText;)V", "", "originalString", "setNewValue", "(Landroid/widget/EditText;Ljava/lang/String;)V", "code", "", "editTexts", "pasteCode", "(Ljava/lang/String;Ljava/util/List;)V", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputConfirmationCodeComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class InputConfirmationCodeComponent2 {
    public static final ConstraintLayout makeView(InputConfirmationCodeComponent inputConfirmationCodeComponent, UiComponentHelper uiComponentHelper, final InputConfirmationCode config) {
        final InputConfirmationCodeComponent inputConfirmationCodeComponent2;
        Intrinsics.checkNotNullParameter(inputConfirmationCodeComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final Pi2Ui2faAuthBinding pi2Ui2faAuthBindingInflate = Pi2Ui2faAuthBinding.inflate(uiComponentHelper.getLayoutInflater());
        String textValue = inputConfirmationCodeComponent.getTextController().getTextValue();
        final List listListOf = CollectionsKt.listOf((Object[]) new EditText[]{pi2Ui2faAuthBindingInflate.first.getEditText(), pi2Ui2faAuthBindingInflate.second.getEditText(), pi2Ui2faAuthBindingInflate.third.getEditText(), pi2Ui2faAuthBindingInflate.fourth.getEditText()});
        for (IndexedValue indexedValue : CollectionsKt.withIndex(listListOf)) {
            int index = indexedValue.getIndex();
            final EditText editText = (EditText) indexedValue.component2();
            final EditText editText2 = (EditText) CollectionsKt.getOrNull(listListOf, index - 1);
            final EditText editText3 = (EditText) CollectionsKt.getOrNull(listListOf, index + 1);
            Character orNull = StringsKt.getOrNull(textValue, index);
            if (orNull != null) {
                char cCharValue = orNull.charValue();
                if (editText != null) {
                    editText.setText(String.valueOf(cCharValue));
                }
            }
            if (editText != null) {
                inputConfirmationCodeComponent2 = inputConfirmationCodeComponent;
                TextChangeListener.setTextChangedListener(editText, (Function1<? super String, Unit>) new Function1() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputConfirmationCodeComponentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InputConfirmationCodeComponent2.makeView$lambda$6$lambda$3$lambda$1(inputConfirmationCodeComponent2, pi2Ui2faAuthBindingInflate, listListOf, editText, editText2, editText3, (String) obj);
                    }
                });
            } else {
                inputConfirmationCodeComponent2 = inputConfirmationCodeComponent;
            }
            if (editText2 != null) {
                setupDeleteOnEmptyEditTextListener(editText, new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputConfirmationCodeComponentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InputConfirmationCodeComponent2.makeView$lambda$6$lambda$3$lambda$2(editText2);
                    }
                });
            }
            setupFocusChangeListener(editText);
            inputConfirmationCodeComponent = inputConfirmationCodeComponent2;
        }
        uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputConfirmationCodeComponentKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InputConfirmationCodeComponent2.makeView$lambda$6$lambda$5(pi2Ui2faAuthBindingInflate, config);
            }
        });
        ConstraintLayout root = pi2Ui2faAuthBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$6$lambda$3$lambda$1(InputConfirmationCodeComponent inputConfirmationCodeComponent, Pi2Ui2faAuthBinding pi2Ui2faAuthBinding, List list, EditText editText, EditText editText2, EditText editText3, String newText) {
        Context context;
        Intrinsics.checkNotNullParameter(newText, "newText");
        TextController textController = inputConfirmationCodeComponent.getTextController();
        InputConfirmationComponentUtils inputConfirmationComponentUtils = InputConfirmationComponentUtils.INSTANCE;
        ConstraintLayout root = pi2Ui2faAuthBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        textController.setTextValue(inputConfirmationComponentUtils.getConfirmationCode(root));
        if (newText.length() >= list.size()) {
            pasteCode(newText, list);
        } else if (newText.length() > 1) {
            setNewValue(editText, newText);
        } else if (StringsKt.isBlank(newText) && editText2 != null) {
            editText2.requestFocus();
            editText2.setSelection(editText2.length());
        } else if (!StringsKt.isBlank(newText) && editText3 != null) {
            editText3.requestFocus();
        } else if (!StringsKt.isBlank(newText)) {
            inputConfirmationCodeComponent.getSubmitCodeHelper().getSubmitCode().invoke();
            EditText editText4 = pi2Ui2faAuthBinding.fourth.getEditText();
            if (editText4 != null && (context = editText4.getContext()) != null) {
                ContextUtils3.hideKeyboard(context);
            }
            EditText editText5 = pi2Ui2faAuthBinding.fourth.getEditText();
            if (editText5 != null) {
                editText5.clearFocus();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$6$lambda$3$lambda$2(EditText editText) {
        editText.requestFocus();
        editText.setSelection(editText.length());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$6$lambda$5(Pi2Ui2faAuthBinding pi2Ui2faAuthBinding, InputConfirmationCode inputConfirmationCode) {
        ConstraintLayout root = pi2Ui2faAuthBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        Sequence<TextInputLayout> sequenceFilter = SequencesKt.filter(ViewGroup2.getChildren(root), new Function1<Object, Boolean>() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputConfirmationCodeComponentKt$makeView$lambda$6$lambda$5$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof TextInputLayout);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        for (TextInputLayout textInputLayout : sequenceFilter) {
            InputTextBasedComponentStyle styles = inputConfirmationCode.getStyles();
            if (styles != null) {
                TextInputLayoutStyling.style(textInputLayout, styles);
            }
        }
        return Unit.INSTANCE;
    }

    private static final void setupDeleteOnEmptyEditTextListener(final EditText editText, final Function0<Unit> function0) {
        if (editText != null) {
            editText.setOnKeyListener(new View.OnKeyListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputConfirmationCodeComponentKt$$ExternalSyntheticLambda4
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    return InputConfirmationCodeComponent2.setupDeleteOnEmptyEditTextListener$lambda$7(editText, function0, view, i, keyEvent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupDeleteOnEmptyEditTextListener$lambda$7(EditText editText, Function0 function0, View view, int i, KeyEvent keyEvent) {
        if (i != 67 || keyEvent.getAction() != 0) {
            return false;
        }
        Editable text = editText.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() != 0) {
            return false;
        }
        function0.invoke();
        return true;
    }

    private static final void setupFocusChangeListener(final EditText editText) {
        if (editText != null) {
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputConfirmationCodeComponentKt$$ExternalSyntheticLambda3
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    InputConfirmationCodeComponent2.setupFocusChangeListener$lambda$8(editText, view, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupFocusChangeListener$lambda$8(EditText editText, View view, boolean z) {
        if (z) {
            Editable text = editText.getText();
            editText.setSelection(text != null ? text.length() : 0);
        }
    }

    private static final void setNewValue(EditText editText, String str) {
        if (editText.getSelectionStart() == 1) {
            editText.setText(String.valueOf(StringsKt.first(str)));
        } else {
            editText.setText(String.valueOf(StringsKt.last(str)));
        }
    }

    private static final void pasteCode(String str, List<? extends EditText> list) {
        if (str.length() >= list.size()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                int length = (str.length() - list.size()) + i;
                EditText editText = list.get(i);
                if (editText != null) {
                    editText.setText(String.valueOf(str.charAt(length)));
                }
            }
        }
    }
}
