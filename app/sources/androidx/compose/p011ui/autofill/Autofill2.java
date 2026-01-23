package androidx.compose.p011ui.autofill;

import androidx.compose.p011ui.geometry.Rect;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Autofill.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dJ\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R%\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m3636d2 = {"Landroidx/compose/ui/autofill/AutofillNode;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "Landroidx/compose/ui/autofill/AutofillType;", "autofillTypes", "Ljava/util/List;", "getAutofillTypes", "()Ljava/util/List;", "Landroidx/compose/ui/geometry/Rect;", "boundingBox", "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "()Landroidx/compose/ui/geometry/Rect;", "setBoundingBox", "(Landroidx/compose/ui/geometry/Rect;)V", "Lkotlin/Function1;", "", "", "onFill", "Lkotlin/jvm/functions/Function1;", "getOnFill", "()Lkotlin/jvm/functions/Function1;", "Companion", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
@SourceDebugExtension
/* renamed from: androidx.compose.ui.autofill.AutofillNode, reason: use source file name */
/* loaded from: classes4.dex */
public final class Autofill2 {
    public static final int $stable;
    private static final Object lock;
    private final List<AutofillType> autofillTypes;
    private Rect boundingBox;
    private final Function1<String, Unit> onFill;

    public final List<AutofillType> getAutofillTypes() {
        return this.autofillTypes;
    }

    public final Rect getBoundingBox() {
        return this.boundingBox;
    }

    public final Function1<String, Unit> getOnFill() {
        return this.onFill;
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        $stable = 8;
        lock = companion;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Autofill2)) {
            return false;
        }
        Autofill2 autofill2 = (Autofill2) other;
        return Intrinsics.areEqual(this.autofillTypes, autofill2.autofillTypes) && Intrinsics.areEqual(this.boundingBox, autofill2.boundingBox) && this.onFill == autofill2.onFill;
    }

    public int hashCode() {
        int iHashCode = this.autofillTypes.hashCode() * 31;
        Rect rect = this.boundingBox;
        int iHashCode2 = (iHashCode + (rect != null ? rect.hashCode() : 0)) * 31;
        Function1<String, Unit> function1 = this.onFill;
        return iHashCode2 + (function1 != null ? function1.hashCode() : 0);
    }
}
