package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class VerticalChainReference extends ChainReference {
    public VerticalChainReference(State state) {
        super(state, State.Helper.VERTICAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        Iterator<Object> it = this.mReferences.iterator();
        while (it.hasNext()) {
            this.mHelperState.constraints(it.next()).clearVertical();
        }
        Iterator<Object> it2 = this.mReferences.iterator();
        ConstraintReference constraintReference = null;
        ConstraintReference constraintReference2 = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            ConstraintReference constraintReferenceConstraints = this.mHelperState.constraints(next);
            if (constraintReference2 == null) {
                Object obj = this.mTopToTop;
                if (obj != null) {
                    constraintReferenceConstraints.topToTop(obj).margin(this.mMarginTop).marginGone(this.mMarginTopGone);
                } else {
                    Object obj2 = this.mTopToBottom;
                    if (obj2 != null) {
                        constraintReferenceConstraints.topToBottom(obj2).margin(this.mMarginTop).marginGone(this.mMarginTopGone);
                    } else {
                        String string2 = constraintReferenceConstraints.getKey().toString();
                        constraintReferenceConstraints.topToTop(State.PARENT).margin(Float.valueOf(getPreMargin(string2))).marginGone(Float.valueOf(getPreGoneMargin(string2)));
                    }
                }
                constraintReference2 = constraintReferenceConstraints;
            }
            if (constraintReference != null) {
                String string3 = constraintReference.getKey().toString();
                String string4 = constraintReferenceConstraints.getKey().toString();
                constraintReference.bottomToTop(constraintReferenceConstraints.getKey()).margin(Float.valueOf(getPostMargin(string3))).marginGone(Float.valueOf(getPostGoneMargin(string3)));
                constraintReferenceConstraints.topToBottom(constraintReference.getKey()).margin(Float.valueOf(getPreMargin(string4))).marginGone(Float.valueOf(getPreGoneMargin(string4)));
            }
            float weight = getWeight(next.toString());
            if (weight != -1.0f) {
                constraintReferenceConstraints.setVerticalChainWeight(weight);
            }
            constraintReference = constraintReferenceConstraints;
        }
        if (constraintReference != null) {
            Object obj3 = this.mBottomToTop;
            if (obj3 != null) {
                constraintReference.bottomToTop(obj3).margin(this.mMarginBottom).marginGone(this.mMarginBottomGone);
            } else {
                Object obj4 = this.mBottomToBottom;
                if (obj4 != null) {
                    constraintReference.bottomToBottom(obj4).margin(this.mMarginBottom).marginGone(this.mMarginBottomGone);
                } else {
                    String string5 = constraintReference.getKey().toString();
                    constraintReference.bottomToBottom(State.PARENT).margin(Float.valueOf(getPostMargin(string5))).marginGone(Float.valueOf(getPostGoneMargin(string5)));
                }
            }
        }
        if (constraintReference2 == null) {
            return;
        }
        float f = this.mBias;
        if (f != 0.5f) {
            constraintReference2.verticalBias(f);
        }
        int i = C20611.$SwitchMap$androidx$constraintlayout$core$state$State$Chain[this.mStyle.ordinal()];
        if (i == 1) {
            constraintReference2.setVerticalChainStyle(0);
        } else if (i == 2) {
            constraintReference2.setVerticalChainStyle(1);
        } else {
            if (i != 3) {
                return;
            }
            constraintReference2.setVerticalChainStyle(2);
        }
    }

    /* renamed from: androidx.constraintlayout.core.state.helpers.VerticalChainReference$1 */
    static /* synthetic */ class C20611 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Chain;

        static {
            int[] iArr = new int[State.Chain.values().length];
            $SwitchMap$androidx$constraintlayout$core$state$State$Chain = iArr;
            try {
                iArr[State.Chain.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Chain[State.Chain.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Chain[State.Chain.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
