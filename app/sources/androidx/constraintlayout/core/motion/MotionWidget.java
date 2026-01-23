package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Set;

/* loaded from: classes4.dex */
public class MotionWidget implements TypedValues {
    Motion mMotion;
    private float mProgress;
    PropertySet mPropertySet;
    float mTransitionPathRotate;
    WidgetFrame mWidgetFrame;

    public static class Motion {
        public String mAnimateRelativeTo = null;
        public int mAnimateCircleAngleTo = 0;
        public String mTransitionEasing = null;
        public int mPathMotionArc = -1;
        public int mDrawPath = 0;
        public float mMotionStagger = Float.NaN;
        public int mPolarRelativeTo = -1;
        public float mPathRotate = Float.NaN;
        public float mQuantizeMotionPhase = Float.NaN;
        public int mQuantizeMotionSteps = -1;
        public String mQuantizeInterpolatorString = null;
        public int mQuantizeInterpolatorType = -3;
        public int mQuantizeInterpolatorID = -1;
    }

    public static class PropertySet {
        public int visibility = 4;
        public int mVisibilityMode = 0;
        public float alpha = 1.0f;
        public float mProgress = Float.NaN;
    }

    public MotionWidget findViewById(int i) {
        return null;
    }

    public MotionWidget getParent() {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, boolean z) {
        return false;
    }

    public MotionWidget() {
        this.mWidgetFrame = new WidgetFrame();
        this.mMotion = new Motion();
        this.mPropertySet = new PropertySet();
    }

    public void setVisibility(int i) {
        this.mPropertySet.visibility = i;
    }

    public void layout(int i, int i2, int i3, int i4) {
        setBounds(i, i2, i3, i4);
    }

    public String toString() {
        return this.mWidgetFrame.left + ", " + this.mWidgetFrame.top + ", " + this.mWidgetFrame.right + ", " + this.mWidgetFrame.bottom;
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        if (this.mWidgetFrame == null) {
            this.mWidgetFrame = new WidgetFrame((ConstraintWidget) null);
        }
        WidgetFrame widgetFrame = this.mWidgetFrame;
        widgetFrame.top = i2;
        widgetFrame.left = i;
        widgetFrame.right = i3;
        widgetFrame.bottom = i4;
    }

    public MotionWidget(WidgetFrame widgetFrame) {
        this.mWidgetFrame = new WidgetFrame();
        this.mMotion = new Motion();
        this.mPropertySet = new PropertySet();
        this.mWidgetFrame = widgetFrame;
    }

    public void updateMotion(TypedValues typedValues) {
        if (this.mWidgetFrame.getMotionProperties() != null) {
            this.mWidgetFrame.getMotionProperties().applyDelta(typedValues);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        if (setValueAttributes(i, i2)) {
            return true;
        }
        return setValueMotion(i, i2);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        if (setValueAttributes(i, f)) {
            return true;
        }
        return setValueMotion(i, f);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, String str) {
        if (i == 605) {
            this.mMotion.mAnimateRelativeTo = str;
            return true;
        }
        return setValueMotion(i, str);
    }

    public boolean setValueMotion(int i, int i2) {
        switch (i) {
            case 606:
                this.mMotion.mAnimateCircleAngleTo = i2;
                return true;
            case 607:
                this.mMotion.mPathMotionArc = i2;
                return true;
            case 608:
                this.mMotion.mDrawPath = i2;
                return true;
            case 609:
                this.mMotion.mPolarRelativeTo = i2;
                return true;
            case 610:
                this.mMotion.mQuantizeMotionSteps = i2;
                return true;
            case 611:
                this.mMotion.mQuantizeInterpolatorType = i2;
                return true;
            case 612:
                this.mMotion.mQuantizeInterpolatorID = i2;
                return true;
            default:
                return false;
        }
    }

    public boolean setValueMotion(int i, String str) {
        if (i == 603) {
            this.mMotion.mTransitionEasing = str;
            return true;
        }
        if (i != 604) {
            return false;
        }
        this.mMotion.mQuantizeInterpolatorString = str;
        return true;
    }

    public boolean setValueMotion(int i, float f) {
        switch (i) {
            case 600:
                this.mMotion.mMotionStagger = f;
                return true;
            case 601:
                this.mMotion.mPathRotate = f;
                return true;
            case 602:
                this.mMotion.mQuantizeMotionPhase = f;
                return true;
            default:
                return false;
        }
    }

    public boolean setValueAttributes(int i, float f) {
        switch (i) {
            case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE:
                this.mWidgetFrame.alpha = f;
                return true;
            case SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE:
                this.mWidgetFrame.translationX = f;
                return true;
            case SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE:
                this.mWidgetFrame.translationY = f;
                return true;
            case SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE:
                this.mWidgetFrame.translationZ = f;
                return true;
            case SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE:
            default:
                return false;
            case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE:
                this.mWidgetFrame.rotationX = f;
                return true;
            case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE:
                this.mWidgetFrame.rotationY = f;
                return true;
            case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE:
                this.mWidgetFrame.rotationZ = f;
                return true;
            case SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE:
                this.mWidgetFrame.scaleX = f;
                return true;
            case f2774x74902ae0:
                this.mWidgetFrame.scaleY = f;
                return true;
            case SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE:
                this.mWidgetFrame.pivotX = f;
                return true;
            case SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE:
                this.mWidgetFrame.pivotY = f;
                return true;
            case SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE:
                this.mProgress = f;
                return true;
            case 316:
                this.mTransitionPathRotate = f;
                return true;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        int id = TypedValues.AttributesType.getId(str);
        return id != -1 ? id : TypedValues.MotionType.getId(str);
    }

    public int getTop() {
        return this.mWidgetFrame.top;
    }

    public int getLeft() {
        return this.mWidgetFrame.left;
    }

    public int getBottom() {
        return this.mWidgetFrame.bottom;
    }

    public int getRight() {
        return this.mWidgetFrame.right;
    }

    public void setPivotX(float f) {
        this.mWidgetFrame.pivotX = f;
    }

    public void setPivotY(float f) {
        this.mWidgetFrame.pivotY = f;
    }

    public float getRotationX() {
        return this.mWidgetFrame.rotationX;
    }

    public float getRotationY() {
        return this.mWidgetFrame.rotationY;
    }

    public float getRotationZ() {
        return this.mWidgetFrame.rotationZ;
    }

    public void setRotationZ(float f) {
        this.mWidgetFrame.rotationZ = f;
    }

    public float getTranslationX() {
        return this.mWidgetFrame.translationX;
    }

    public float getTranslationY() {
        return this.mWidgetFrame.translationY;
    }

    public float getTranslationZ() {
        return this.mWidgetFrame.translationZ;
    }

    public float getScaleX() {
        return this.mWidgetFrame.scaleX;
    }

    public float getScaleY() {
        return this.mWidgetFrame.scaleY;
    }

    public int getVisibility() {
        return this.mPropertySet.visibility;
    }

    public float getPivotX() {
        return this.mWidgetFrame.pivotX;
    }

    public float getPivotY() {
        return this.mWidgetFrame.pivotY;
    }

    public float getAlpha() {
        return this.mWidgetFrame.alpha;
    }

    public int getX() {
        return this.mWidgetFrame.left;
    }

    public int getY() {
        return this.mWidgetFrame.top;
    }

    public int getWidth() {
        WidgetFrame widgetFrame = this.mWidgetFrame;
        return widgetFrame.right - widgetFrame.left;
    }

    public int getHeight() {
        WidgetFrame widgetFrame = this.mWidgetFrame;
        return widgetFrame.bottom - widgetFrame.top;
    }

    public WidgetFrame getWidgetFrame() {
        return this.mWidgetFrame;
    }

    public Set<String> getCustomAttributeNames() {
        return this.mWidgetFrame.getCustomAttributeNames();
    }

    public void setCustomAttribute(String str, int i, float f) {
        this.mWidgetFrame.setCustomAttribute(str, i, f);
    }

    public void setCustomAttribute(String str, int i, int i2) {
        this.mWidgetFrame.setCustomAttribute(str, i, i2);
    }

    public void setCustomAttribute(String str, int i, boolean z) {
        this.mWidgetFrame.setCustomAttribute(str, i, z);
    }

    public CustomVariable getCustomAttribute(String str) {
        return this.mWidgetFrame.getCustomAttribute(str);
    }
}
