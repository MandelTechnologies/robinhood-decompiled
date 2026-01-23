package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLString;
import com.robinhood.android.gold.contracts.GoldFeature;
import kotlin.Metadata;

/* compiled from: ConstrainScope.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, m3636d2 = {"Landroidx/constraintlayout/compose/ConstraintBaselineAnchorable;", "Landroidx/constraintlayout/compose/BaselineAnchorable;", "Landroidx/constraintlayout/core/parser/CLObject;", "containerObject", "<init>", "(Landroidx/constraintlayout/core/parser/CLObject;)V", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "anchor", "Landroidx/compose/ui/unit/Dp;", GoldFeature.MARGIN, "goneMargin", "", "linkTo-VpY3zN4", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;FF)V", "linkTo", "Landroidx/constraintlayout/core/parser/CLObject;", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.constraintlayout.compose.ConstraintBaselineAnchorable, reason: use source file name */
/* loaded from: classes4.dex */
final class ConstrainScope3 implements ConstraintScopeCommon4 {
    private final CLObject containerObject;

    public ConstrainScope3(CLObject cLObject) {
        this.containerObject = cLObject;
    }

    @Override // androidx.constraintlayout.compose.ConstraintScopeCommon4
    /* renamed from: linkTo-VpY3zN4 */
    public void mo8120linkToVpY3zN4(ConstraintLayoutBaseScope.BaselineAnchor anchor, float margin, float goneMargin) {
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.add(CLString.from(anchor.getId().toString()));
        cLArray.add(CLString.from("baseline"));
        cLArray.add(new CLNumber(margin));
        cLArray.add(new CLNumber(goneMargin));
        this.containerObject.put("baseline", cLArray);
    }
}
