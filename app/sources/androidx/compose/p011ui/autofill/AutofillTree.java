package androidx.compose.p011ui.autofill;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: AutofillTree.kt */
@Deprecated
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Landroidx/compose/ui/autofill/AutofillTree;", "", "<init>", "()V", "", "id", "", "value", "", "performAutofill", "(ILjava/lang/String;)Lkotlin/Unit;", "", "Landroidx/compose/ui/autofill/AutofillNode;", "children", "Ljava/util/Map;", "getChildren", "()Ljava/util/Map;", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class AutofillTree {
    private final Map<Integer, Autofill2> children = new LinkedHashMap();

    public final Map<Integer, Autofill2> getChildren() {
        return this.children;
    }

    public final Unit performAutofill(int id, String value) {
        Function1<String, Unit> onFill;
        Autofill2 autofill2 = this.children.get(Integer.valueOf(id));
        if (autofill2 == null || (onFill = autofill2.getOnFill()) == null) {
            return null;
        }
        onFill.invoke(value);
        return Unit.INSTANCE;
    }
}
