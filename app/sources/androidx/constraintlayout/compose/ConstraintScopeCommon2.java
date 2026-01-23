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
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, m3636d2 = {"Landroidx/constraintlayout/compose/BaseHorizontalAnchorable;", "Landroidx/constraintlayout/compose/HorizontalAnchorable;", "Landroidx/constraintlayout/core/parser/CLObject;", "containerObject", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "<init>", "(Landroidx/constraintlayout/core/parser/CLObject;I)V", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "anchor", "Landroidx/compose/ui/unit/Dp;", GoldFeature.MARGIN, "goneMargin", "", "linkTo-VpY3zN4", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FF)V", "linkTo", "Landroidx/constraintlayout/core/parser/CLObject;", "", "anchorName", "Ljava/lang/String;", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.constraintlayout.compose.BaseHorizontalAnchorable, reason: use source file name */
/* loaded from: classes4.dex */
public abstract class ConstraintScopeCommon2 implements ConstraintScopeCommon5 {
    private final String anchorName;
    private final CLObject containerObject;

    public ConstraintScopeCommon2(CLObject cLObject, int i) {
        this.containerObject = cLObject;
        this.anchorName = ConstraintScopeCommon.INSTANCE.horizontalAnchorIndexToAnchorName(i);
    }

    @Override // androidx.constraintlayout.compose.ConstraintScopeCommon5
    /* renamed from: linkTo-VpY3zN4, reason: not valid java name */
    public final void mo8117linkToVpY3zN4(ConstraintLayoutBaseScope.HorizontalAnchor anchor, float margin, float goneMargin) {
        String strHorizontalAnchorIndexToAnchorName = ConstraintScopeCommon.INSTANCE.horizontalAnchorIndexToAnchorName(anchor.getIndex());
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.add(CLString.from(anchor.getId().toString()));
        cLArray.add(CLString.from(strHorizontalAnchorIndexToAnchorName));
        cLArray.add(new CLNumber(margin));
        cLArray.add(new CLNumber(goneMargin));
        this.containerObject.put(this.anchorName, cLArray);
    }
}
