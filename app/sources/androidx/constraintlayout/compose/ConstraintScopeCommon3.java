package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLString;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;

/* compiled from: ConstraintScopeCommon.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, m3636d2 = {"Landroidx/constraintlayout/compose/BaseVerticalAnchorable;", "Landroidx/constraintlayout/compose/VerticalAnchorable;", "containerObject", "Landroidx/constraintlayout/core/parser/CLObject;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "(Landroidx/constraintlayout/core/parser/CLObject;I)V", "anchorName", "", "linkTo", "", "anchor", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", GoldFeature.MARGIN, "Landroidx/compose/ui/unit/Dp;", "goneMargin", "linkTo-VpY3zN4", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;FF)V", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.constraintlayout.compose.BaseVerticalAnchorable, reason: use source file name */
/* loaded from: classes4.dex */
public abstract class ConstraintScopeCommon3 implements ConstraintScopeCommon6 {
    private final String anchorName;
    private final CLObject containerObject;

    public ConstraintScopeCommon3(CLObject cLObject, int i) {
        this.containerObject = cLObject;
        this.anchorName = ConstraintScopeCommon.INSTANCE.verticalAnchorIndexToAnchorName(i);
    }

    @Override // androidx.constraintlayout.compose.ConstraintScopeCommon6
    /* renamed from: linkTo-VpY3zN4, reason: not valid java name */
    public final void mo8118linkToVpY3zN4(ConstraintLayoutBaseScope.VerticalAnchor anchor, float margin, float goneMargin) {
        String strVerticalAnchorIndexToAnchorName = ConstraintScopeCommon.INSTANCE.verticalAnchorIndexToAnchorName(anchor.getIndex());
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.add(CLString.from(anchor.getId().toString()));
        cLArray.add(CLString.from(strVerticalAnchorIndexToAnchorName));
        cLArray.add(new CLNumber(margin));
        cLArray.add(new CLNumber(goneMargin));
        this.containerObject.put(this.anchorName, cLArray);
    }
}
