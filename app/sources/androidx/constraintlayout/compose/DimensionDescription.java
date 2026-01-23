package androidx.constraintlayout.compose;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLObject;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001d\b\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\fJ\u000f\u0010\u0010\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, m3636d2 = {"Landroidx/constraintlayout/compose/DimensionDescription;", "Landroidx/constraintlayout/compose/Dimension$Coercible;", "Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "", "Landroidx/constraintlayout/compose/Dimension;", "Landroidx/compose/ui/unit/Dp;", "value", "", "valueSymbol", "<init>", "(Landroidx/compose/ui/unit/Dp;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/constraintlayout/core/parser/CLElement;", "asCLElement$constraintlayout_compose_release", "()Landroidx/constraintlayout/core/parser/CLElement;", "asCLElement", "Landroidx/constraintlayout/compose/DimensionSymbol;", "Landroidx/constraintlayout/compose/DimensionSymbol;", "min", "getMin$constraintlayout_compose_release", "()Landroidx/constraintlayout/compose/DimensionSymbol;", AnalyticsStrings.MAX_WELCOME_TAG, "getMax$constraintlayout_compose_release", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class DimensionDescription implements Dimension.Coercible, Dimension.MinCoercible, Dimension {
    private final DimensionSymbol max;
    private final DimensionSymbol min;
    private final DimensionSymbol valueSymbol;

    public /* synthetic */ DimensionDescription(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    private DimensionDescription(C2002Dp c2002Dp, String str) {
        this.valueSymbol = new DimensionSymbol(c2002Dp, str, "base", null);
        this.min = new DimensionSymbol(null, null, "min", null);
        this.max = new DimensionSymbol(null, null, AnalyticsStrings.MAX_WELCOME_TAG, null);
    }

    private DimensionDescription(float f) {
        this(C2002Dp.m7993boximpl(f), (String) null);
    }

    public DimensionDescription(String str) {
        this((C2002Dp) null, str);
    }

    /* renamed from: getMin$constraintlayout_compose_release, reason: from getter */
    public final DimensionSymbol getMin() {
        return this.min;
    }

    /* renamed from: getMax$constraintlayout_compose_release, reason: from getter */
    public final DimensionSymbol getMax() {
        return this.max;
    }

    public final CLElement asCLElement$constraintlayout_compose_release() {
        if (this.min.isUndefined() && this.max.isUndefined()) {
            return this.valueSymbol.asCLElement();
        }
        CLObject cLObject = new CLObject(new char[0]);
        if (!this.min.isUndefined()) {
            cLObject.put("min", this.min.asCLElement());
        }
        if (!this.max.isUndefined()) {
            cLObject.put(AnalyticsStrings.MAX_WELCOME_TAG, this.max.asCLElement());
        }
        cLObject.put("value", this.valueSymbol.asCLElement());
        return cLObject;
    }
}
