package androidx.compose.p011ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;

/* compiled from: AutofillUtils.android.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014JG\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b#\u0010!J\u0017\u0010$\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b$\u0010!J\u001f\u0010'\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(J%\u0010+\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0)H\u0007¢\u0006\u0004\b+\u0010,J'\u00100\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0006H\u0007¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0006H\u0007¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u001fH\u0007¢\u0006\u0004\b8\u00109J\u001f\u0010;\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u001fH\u0007¢\u0006\u0004\b;\u00109J\u001f\u0010=\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u000eH\u0007¢\u0006\u0004\b=\u0010>J\u001f\u0010@\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u001fH\u0007¢\u0006\u0004\b@\u00109J\u001f\u0010B\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u001fH\u0007¢\u0006\u0004\bB\u00109J\u001f\u0010D\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u001fH\u0007¢\u0006\u0004\bD\u00109J\u001f\u0010F\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\u001fH\u0007¢\u0006\u0004\bF\u00109J\u001f\u0010H\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u001fH\u0007¢\u0006\u0004\bH\u00109J\u001f\u0010I\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0006H\u0007¢\u0006\u0004\bI\u00104J\u001f\u0010K\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u001fH\u0007¢\u0006\u0004\bK\u00109J\u001f\u0010M\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u001fH\u0007¢\u0006\u0004\bM\u00109J\u001f\u0010O\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010N\u001a\u00020%H\u0007¢\u0006\u0004\bO\u0010(J\u001f\u0010Q\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u0006H\u0007¢\u0006\u0004\bQ\u00104J\u0017\u0010R\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000eH\u0007¢\u0006\u0004\bT\u0010U¨\u0006V"}, m3636d2 = {"Landroidx/compose/ui/autofill/AutofillApi26Helper;", "", "<init>", "()V", "Landroid/view/ViewStructure;", "structure", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "newChild", "(Landroid/view/ViewStructure;I)Landroid/view/ViewStructure;", "num", "addChildCount", "(Landroid/view/ViewStructure;I)I", "id", "", "packageName", "typeName", "entryName", "", "setId", "(Landroid/view/ViewStructure;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "left", "top", "scrollX", "scrollY", "width", "height", "setDimens", "(Landroid/view/ViewStructure;IIIIII)V", "Landroid/view/autofill/AutofillValue;", "value", "", "isDate", "(Landroid/view/autofill/AutofillValue;)Z", "isList", "isText", "isToggle", "", "contentDescription", "setContentDescription", "(Landroid/view/ViewStructure;Ljava/lang/CharSequence;)V", "", "hints", "setAutofillHints", "(Landroid/view/ViewStructure;[Ljava/lang/String;)V", "Landroid/view/autofill/AutofillId;", "parent", "virtualId", "setAutofillId", "(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillId;I)V", "type", "setAutofillType", "(Landroid/view/ViewStructure;I)V", "setAutofillValue", "(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillValue;)V", "checkable", "setCheckable", "(Landroid/view/ViewStructure;Z)V", "checked", "setChecked", "classname", "setClassName", "(Landroid/view/ViewStructure;Ljava/lang/String;)V", "clickable", "setClickable", "isSensitive", "setDataIsSensitive", "enabled", "setEnabled", "focusable", "setFocusable", "focused", "setFocused", "setInputType", "longClickable", "setLongClickable", "isSelected", "setSelected", "text", "setText", "visibility", "setVisibility", "textValue", "(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;", "getAutofillTextValue", "(Ljava/lang/String;)Landroid/view/autofill/AutofillValue;", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class AutofillApi26Helper {
    public static final AutofillApi26Helper INSTANCE = new AutofillApi26Helper();

    private AutofillApi26Helper() {
    }

    public final ViewStructure newChild(ViewStructure structure, int index) {
        return structure.newChild(index);
    }

    public final int addChildCount(ViewStructure structure, int num) {
        return structure.addChildCount(num);
    }

    public final void setId(ViewStructure structure, int id, String packageName, String typeName, String entryName) {
        structure.setId(id, packageName, typeName, entryName);
    }

    public final void setDimens(ViewStructure structure, int left, int top, int scrollX, int scrollY, int width, int height) {
        structure.setDimens(left, top, scrollX, scrollY, width, height);
    }

    public final boolean isDate(AutofillValue value) {
        return value.isDate();
    }

    public final boolean isList(AutofillValue value) {
        return value.isList();
    }

    public final boolean isText(AutofillValue value) {
        return value.isText();
    }

    public final boolean isToggle(AutofillValue value) {
        return value.isToggle();
    }

    public final void setContentDescription(ViewStructure structure, CharSequence contentDescription) {
        structure.setContentDescription(contentDescription);
    }

    public final void setAutofillHints(ViewStructure structure, String[] hints) {
        structure.setAutofillHints(hints);
    }

    public final void setAutofillId(ViewStructure structure, AutofillId parent, int virtualId) {
        structure.setAutofillId(parent, virtualId);
    }

    public final void setAutofillType(ViewStructure structure, int type2) {
        structure.setAutofillType(type2);
    }

    public final void setAutofillValue(ViewStructure structure, AutofillValue value) {
        structure.setAutofillValue(value);
    }

    public final void setCheckable(ViewStructure structure, boolean checkable) {
        structure.setCheckable(checkable);
    }

    public final void setChecked(ViewStructure structure, boolean checked) {
        structure.setChecked(checked);
    }

    public final void setClassName(ViewStructure structure, String classname) {
        structure.setClassName(classname);
    }

    public final void setClickable(ViewStructure structure, boolean clickable) {
        structure.setClickable(clickable);
    }

    public final void setDataIsSensitive(ViewStructure structure, boolean isSensitive) {
        structure.setDataIsSensitive(isSensitive);
    }

    public final void setEnabled(ViewStructure structure, boolean enabled) {
        structure.setEnabled(enabled);
    }

    public final void setFocusable(ViewStructure structure, boolean focusable) {
        structure.setFocusable(focusable);
    }

    public final void setFocused(ViewStructure structure, boolean focused) {
        structure.setFocused(focused);
    }

    public final void setInputType(ViewStructure structure, int type2) {
        structure.setInputType(type2);
    }

    public final void setLongClickable(ViewStructure structure, boolean longClickable) {
        structure.setLongClickable(longClickable);
    }

    public final void setSelected(ViewStructure structure, boolean isSelected) {
        structure.setSelected(isSelected);
    }

    public final void setText(ViewStructure structure, CharSequence text) {
        structure.setText(text);
    }

    public final void setVisibility(ViewStructure structure, int visibility) {
        structure.setVisibility(visibility);
    }

    public final CharSequence textValue(AutofillValue value) {
        return value.getTextValue();
    }

    public final AutofillValue getAutofillTextValue(String value) {
        return AutofillValue.forText(value);
    }
}
