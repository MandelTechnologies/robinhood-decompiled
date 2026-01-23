package androidx.constraintlayout.compose;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.core.parser.CLObject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* compiled from: ConstrainScope.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\bH\b\u0007\u0018\u00002\u00020\u0001:\u0006\u0097\u0001\u0098\u0001\u0099\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006JR\u0010\u0014\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0003\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013JR\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\n2\b\b\u0003\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u001cJ\u0094\u0001\u0010\u0014\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\n2\b\b\u0003\u0010\u001d\u001a\u00020\u000f2\b\b\u0003\u0010\u001e\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\b\b\u0003\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\b\b\u0003\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b'\u0010&R\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010.\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\b\u001a\u0002028\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u00105R\u0017\u00106\u001a\u0002028\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u0017\u0010\u0016\u001a\u0002088\u0006¢\u0006\f\n\u0004\b\u0016\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\t\u001a\u0002028\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b<\u00105R\u0017\u0010=\u001a\u0002028\u0006¢\u0006\f\n\u0004\b=\u00103\u001a\u0004\b>\u00105R\u0017\u0010\u0017\u001a\u0002088\u0006¢\u0006\f\n\u0004\b\u0017\u00109\u001a\u0004\b?\u0010;R\u0017\u0010A\u001a\u00020@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR+\u0010M\u001a\u00020E2\u0006\u0010F\u001a\u00020E8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR+\u0010Q\u001a\u00020E2\u0006\u0010F\u001a\u00020E8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bN\u0010H\u001a\u0004\bO\u0010J\"\u0004\bP\u0010LR+\u0010Y\u001a\u00020R2\u0006\u0010F\u001a\u00020R8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR*\u0010[\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u000f8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R+\u0010e\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010^\"\u0004\bd\u0010`R+\u0010i\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bf\u0010b\u001a\u0004\bg\u0010^\"\u0004\bh\u0010`R+\u0010m\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bj\u0010b\u001a\u0004\bk\u0010^\"\u0004\bl\u0010`R+\u0010q\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bn\u0010b\u001a\u0004\bo\u0010^\"\u0004\bp\u0010`R+\u0010u\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\br\u0010b\u001a\u0004\bs\u0010^\"\u0004\bt\u0010`R1\u0010z\u001a\u00020\n2\u0006\u0010F\u001a\u00020\n8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010^\"\u0004\by\u0010`R1\u0010~\u001a\u00020\n2\u0006\u0010F\u001a\u00020\n8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b{\u0010w\u001a\u0004\b|\u0010^\"\u0004\b}\u0010`R4\u0010\u0082\u0001\u001a\u00020\n2\u0006\u0010F\u001a\u00020\n8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0014\n\u0004\b\u007f\u0010w\u001a\u0005\b\u0080\u0001\u0010^\"\u0005\b\u0081\u0001\u0010`R/\u0010\u0086\u0001\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010b\u001a\u0005\b\u0084\u0001\u0010^\"\u0005\b\u0085\u0001\u0010`R/\u0010\u008a\u0001\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010b\u001a\u0005\b\u0088\u0001\u0010^\"\u0005\b\u0089\u0001\u0010`R/\u0010\u008e\u0001\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010b\u001a\u0005\b\u008c\u0001\u0010^\"\u0005\b\u008d\u0001\u0010`R/\u0010\u0092\u0001\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010b\u001a\u0005\b\u0090\u0001\u0010^\"\u0005\b\u0091\u0001\u0010`R,\u0010\u001d\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u000f8\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0004\b\u001d\u0010\\\u001a\u0005\b\u0093\u0001\u0010^\"\u0005\b\u0094\u0001\u0010`R,\u0010\u001e\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u000f8\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0004\b\u001e\u0010\\\u001a\u0005\b\u0095\u0001\u0010^\"\u0005\b\u0096\u0001\u0010`\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u009a\u0001"}, m3636d2 = {"Landroidx/constraintlayout/compose/ConstrainScope;", "", "id", "Landroidx/constraintlayout/core/parser/CLObject;", "containerObject", "<init>", "(Ljava/lang/Object;Landroidx/constraintlayout/core/parser/CLObject;)V", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "start", "end", "Landroidx/compose/ui/unit/Dp;", "startMargin", "endMargin", "startGoneMargin", "endGoneMargin", "", "bias", "", "linkTo-8ZKsbrE", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;FFFFF)V", "linkTo", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "top", "bottom", "topMargin", "bottomMargin", "topGoneMargin", "bottomGoneMargin", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FFFFF)V", "horizontalBias", "verticalBias", "linkTo-R7zmacU", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FFFFFFFFFF)V", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "other", "centerTo", "(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;)V", "centerHorizontallyTo", "(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;F)V", "centerVerticallyTo", "Ljava/lang/Object;", "getId$constraintlayout_compose_release", "()Ljava/lang/Object;", "Landroidx/constraintlayout/core/parser/CLObject;", "getContainerObject$constraintlayout_compose_release", "()Landroidx/constraintlayout/core/parser/CLObject;", "parent", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "getParent", "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "Landroidx/constraintlayout/compose/VerticalAnchorable;", "Landroidx/constraintlayout/compose/VerticalAnchorable;", "getStart", "()Landroidx/constraintlayout/compose/VerticalAnchorable;", "absoluteLeft", "getAbsoluteLeft", "Landroidx/constraintlayout/compose/HorizontalAnchorable;", "Landroidx/constraintlayout/compose/HorizontalAnchorable;", "getTop", "()Landroidx/constraintlayout/compose/HorizontalAnchorable;", "getEnd", "absoluteRight", "getAbsoluteRight", "getBottom", "Landroidx/constraintlayout/compose/BaselineAnchorable;", "baseline", "Landroidx/constraintlayout/compose/BaselineAnchorable;", "getBaseline", "()Landroidx/constraintlayout/compose/BaselineAnchorable;", "Landroidx/constraintlayout/compose/Dimension;", "<set-?>", "width$delegate", "Landroidx/constraintlayout/compose/ConstrainScope$DimensionProperty;", "getWidth", "()Landroidx/constraintlayout/compose/Dimension;", "setWidth", "(Landroidx/constraintlayout/compose/Dimension;)V", "width", "height$delegate", "getHeight", "setHeight", "height", "Landroidx/constraintlayout/compose/Visibility;", "visibility$delegate", "Landroidx/constraintlayout/compose/ConstrainScope$visibility$2;", "getVisibility", "()Landroidx/constraintlayout/compose/Visibility;", "setVisibility", "(Landroidx/constraintlayout/compose/Visibility;)V", "visibility", "value", "alpha", "F", "getAlpha", "()F", "setAlpha", "(F)V", "scaleX$delegate", "Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;", "getScaleX", "setScaleX", "scaleX", "scaleY$delegate", "getScaleY", "setScaleY", "scaleY", "rotationX$delegate", "getRotationX", "setRotationX", "rotationX", "rotationY$delegate", "getRotationY", "setRotationY", "rotationY", "rotationZ$delegate", "getRotationZ", "setRotationZ", "rotationZ", "translationX$delegate", "Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;", "getTranslationX-D9Ej5fM", "setTranslationX-0680j_4", "translationX", "translationY$delegate", "getTranslationY-D9Ej5fM", "setTranslationY-0680j_4", "translationY", "translationZ$delegate", "getTranslationZ-D9Ej5fM", "setTranslationZ-0680j_4", "translationZ", "pivotX$delegate", "getPivotX", "setPivotX", "pivotX", "pivotY$delegate", "getPivotY", "setPivotY", "pivotY", "horizontalChainWeight$delegate", "getHorizontalChainWeight", "setHorizontalChainWeight", "horizontalChainWeight", "verticalChainWeight$delegate", "getVerticalChainWeight", "setVerticalChainWeight", "verticalChainWeight", "getHorizontalBias", "setHorizontalBias", "getVerticalBias", "setVerticalBias", "DimensionProperty", "DpProperty", "FloatProperty", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ConstrainScope {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "visibility", "getVisibility()Landroidx/constraintlayout/compose/Visibility;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "scaleX", "getScaleX()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "scaleY", "getScaleY()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "rotationX", "getRotationX()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "rotationY", "getRotationY()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "rotationZ", "getRotationZ()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "translationX", "getTranslationX-D9Ej5fM()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "translationY", "getTranslationY-D9Ej5fM()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "pivotX", "getPivotX()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "pivotY", "getPivotY()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "horizontalChainWeight", "getHorizontalChainWeight()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "verticalChainWeight", "getVerticalChainWeight()F", 0))};
    private final ConstraintScopeCommon6 absoluteLeft;
    private final ConstraintScopeCommon6 absoluteRight;
    private float alpha;
    private final ConstraintScopeCommon4 baseline;
    private final ConstraintScopeCommon5 bottom;
    private final CLObject containerObject;
    private final ConstraintScopeCommon6 end;

    /* renamed from: height$delegate, reason: from kotlin metadata */
    private final DimensionProperty height;
    private float horizontalBias;

    /* renamed from: horizontalChainWeight$delegate, reason: from kotlin metadata */
    private final FloatProperty horizontalChainWeight;
    private final Object id;
    private final ConstraintLayoutBaseScope4 parent = new ConstraintLayoutBaseScope4("parent");

    /* renamed from: pivotX$delegate, reason: from kotlin metadata */
    private final FloatProperty pivotX;

    /* renamed from: pivotY$delegate, reason: from kotlin metadata */
    private final FloatProperty pivotY;

    /* renamed from: rotationX$delegate, reason: from kotlin metadata */
    private final FloatProperty rotationX;

    /* renamed from: rotationY$delegate, reason: from kotlin metadata */
    private final FloatProperty rotationY;

    /* renamed from: rotationZ$delegate, reason: from kotlin metadata */
    private final FloatProperty rotationZ;

    /* renamed from: scaleX$delegate, reason: from kotlin metadata */
    private final FloatProperty scaleX;

    /* renamed from: scaleY$delegate, reason: from kotlin metadata */
    private final FloatProperty scaleY;
    private final ConstraintScopeCommon6 start;
    private final ConstraintScopeCommon5 top;

    /* renamed from: translationX$delegate, reason: from kotlin metadata */
    private final DpProperty translationX;

    /* renamed from: translationY$delegate, reason: from kotlin metadata */
    private final DpProperty translationY;

    /* renamed from: translationZ$delegate, reason: from kotlin metadata */
    private final DpProperty translationZ;
    private float verticalBias;

    /* renamed from: verticalChainWeight$delegate, reason: from kotlin metadata */
    private final FloatProperty verticalChainWeight;

    /* renamed from: visibility$delegate, reason: from kotlin metadata */
    private final ConstrainScope2 visibility;

    /* renamed from: width$delegate, reason: from kotlin metadata */
    private final DimensionProperty width;

    /* JADX WARN: Type inference failed for: r15v3, types: [androidx.constraintlayout.compose.ConstrainScope$visibility$2] */
    public ConstrainScope(Object obj, CLObject cLObject) {
        this.id = obj;
        this.containerObject = cLObject;
        this.start = new ConstrainScope5(-2, cLObject);
        this.absoluteLeft = new ConstrainScope5(0, cLObject);
        this.top = new ConstrainScope4(0, cLObject);
        this.end = new ConstrainScope5(-1, cLObject);
        this.absoluteRight = new ConstrainScope5(1, cLObject);
        this.bottom = new ConstrainScope4(1, cLObject);
        this.baseline = new ConstrainScope3(cLObject);
        Dimension.Companion companion = Dimension.INSTANCE;
        this.width = new DimensionProperty(companion.getWrapContent());
        this.height = new DimensionProperty(companion.getWrapContent());
        final ConstraintLayoutBaseScope9 visible = ConstraintLayoutBaseScope9.INSTANCE.getVisible();
        this.visibility = new ObservableProperty<ConstraintLayoutBaseScope9>(visible) { // from class: androidx.constraintlayout.compose.ConstrainScope$visibility$2
            @Override // kotlin.properties.ObservableProperty
            public /* bridge */ /* synthetic */ void afterChange(KProperty kProperty, ConstraintLayoutBaseScope9 constraintLayoutBaseScope9, ConstraintLayoutBaseScope9 constraintLayoutBaseScope92) {
                afterChange2((KProperty<?>) kProperty, constraintLayoutBaseScope9, constraintLayoutBaseScope92);
            }

            /* renamed from: afterChange, reason: avoid collision after fix types in other method */
            protected void afterChange2(KProperty<?> property, ConstraintLayoutBaseScope9 oldValue, ConstraintLayoutBaseScope9 newValue) {
                this.this$0.getContainerObject().putString(property.getName(), newValue.getName());
            }
        };
        this.alpha = 1.0f;
        this.scaleX = new FloatProperty(this, 1.0f, null, 2, null);
        int i = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        this.scaleY = new FloatProperty(this, 1.0f, str, i, defaultConstructorMarker);
        float f = 0.0f;
        this.rotationX = new FloatProperty(this, f, str, i, defaultConstructorMarker);
        this.rotationY = new FloatProperty(this, f, str, i, defaultConstructorMarker);
        this.rotationZ = new FloatProperty(this, f, str, i, defaultConstructorMarker);
        float f2 = 0;
        this.translationX = new DpProperty(this, C2002Dp.m7995constructorimpl(f2), str, i, defaultConstructorMarker);
        this.translationY = new DpProperty(this, C2002Dp.m7995constructorimpl(f2), str, i, defaultConstructorMarker);
        this.translationZ = new DpProperty(this, C2002Dp.m7995constructorimpl(f2), str, i, defaultConstructorMarker);
        float f3 = 0.5f;
        this.pivotX = new FloatProperty(this, f3, str, i, defaultConstructorMarker);
        this.pivotY = new FloatProperty(this, f3, str, i, defaultConstructorMarker);
        this.horizontalChainWeight = new FloatProperty(Float.NaN, "hWeight");
        this.verticalChainWeight = new FloatProperty(Float.NaN, "vWeight");
        this.horizontalBias = 0.5f;
        this.verticalBias = 0.5f;
    }

    /* renamed from: getContainerObject$constraintlayout_compose_release, reason: from getter */
    public final CLObject getContainerObject() {
        return this.containerObject;
    }

    public final ConstraintLayoutBaseScope4 getParent() {
        return this.parent;
    }

    public final ConstraintScopeCommon6 getStart() {
        return this.start;
    }

    public final ConstraintScopeCommon5 getTop() {
        return this.top;
    }

    public final ConstraintScopeCommon6 getEnd() {
        return this.end;
    }

    public final ConstraintScopeCommon5 getBottom() {
        return this.bottom;
    }

    public final ConstraintScopeCommon4 getBaseline() {
        return this.baseline;
    }

    public final void setWidth(Dimension dimension) {
        this.width.setValue(this, $$delegatedProperties[0], dimension);
    }

    public final void setHeight(Dimension dimension) {
        this.height.setValue(this, $$delegatedProperties[1], dimension);
    }

    public final void setVisibility(ConstraintLayoutBaseScope9 constraintLayoutBaseScope9) {
        setValue(this, $$delegatedProperties[2], constraintLayoutBaseScope9);
    }

    public final void setHorizontalBias(float f) {
        this.horizontalBias = f;
        if (Float.isNaN(f)) {
            return;
        }
        this.containerObject.putNumber("hBias", f);
    }

    public final void setVerticalBias(float f) {
        this.verticalBias = f;
        if (Float.isNaN(f)) {
            return;
        }
        this.containerObject.putNumber("vBias", f);
    }

    /* renamed from: linkTo-8ZKsbrE, reason: not valid java name */
    public final void m8133linkTo8ZKsbrE(ConstraintLayoutBaseScope.VerticalAnchor start, ConstraintLayoutBaseScope.VerticalAnchor end, float startMargin, float endMargin, float startGoneMargin, float endGoneMargin, float bias) {
        this.start.mo8118linkToVpY3zN4(start, startMargin, startGoneMargin);
        this.end.mo8118linkToVpY3zN4(end, endMargin, endGoneMargin);
        this.containerObject.putNumber("hRtlBias", bias);
    }

    /* renamed from: linkTo-8ZKsbrE, reason: not valid java name */
    public final void m8132linkTo8ZKsbrE(ConstraintLayoutBaseScope.HorizontalAnchor top, ConstraintLayoutBaseScope.HorizontalAnchor bottom, float topMargin, float bottomMargin, float topGoneMargin, float bottomGoneMargin, float bias) {
        this.top.mo8117linkToVpY3zN4(top, topMargin, topGoneMargin);
        this.bottom.mo8117linkToVpY3zN4(bottom, bottomMargin, bottomGoneMargin);
        this.containerObject.putNumber("vBias", bias);
    }

    /* renamed from: linkTo-R7zmacU, reason: not valid java name */
    public final void m8134linkToR7zmacU(ConstraintLayoutBaseScope.VerticalAnchor start, ConstraintLayoutBaseScope.HorizontalAnchor top, ConstraintLayoutBaseScope.VerticalAnchor end, ConstraintLayoutBaseScope.HorizontalAnchor bottom, float startMargin, float topMargin, float endMargin, float bottomMargin, float startGoneMargin, float topGoneMargin, float endGoneMargin, float bottomGoneMargin, float horizontalBias, float verticalBias) {
        m8133linkTo8ZKsbrE(start, end, startMargin, endMargin, startGoneMargin, endGoneMargin, horizontalBias);
        m8132linkTo8ZKsbrE(top, bottom, topMargin, bottomMargin, topGoneMargin, bottomGoneMargin, verticalBias);
    }

    public final void centerTo(ConstraintLayoutBaseScope4 other) {
        m8131linkToR7zmacU$default(this, other.getStart(), other.getTop(), other.getEnd(), other.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 16368, null);
    }

    public static /* synthetic */ void centerHorizontallyTo$default(ConstrainScope constrainScope, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.5f;
        }
        constrainScope.centerHorizontallyTo(constraintLayoutBaseScope4, f);
    }

    public final void centerHorizontallyTo(ConstraintLayoutBaseScope4 other, float bias) {
        m8130linkTo8ZKsbrE$default(this, other.getStart(), other.getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, bias, 60, (Object) null);
    }

    public static /* synthetic */ void centerVerticallyTo$default(ConstrainScope constrainScope, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.5f;
        }
        constrainScope.centerVerticallyTo(constraintLayoutBaseScope4, f);
    }

    public final void centerVerticallyTo(ConstraintLayoutBaseScope4 other, float bias) {
        m8129linkTo8ZKsbrE$default(this, other.getTop(), other.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, bias, 60, (Object) null);
    }

    /* compiled from: ConstrainScope.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0014¨\u0006\u000b"}, m3636d2 = {"Landroidx/constraintlayout/compose/ConstrainScope$DimensionProperty;", "Lkotlin/properties/ObservableProperty;", "Landroidx/constraintlayout/compose/Dimension;", "initialValue", "(Landroidx/constraintlayout/compose/ConstrainScope;Landroidx/constraintlayout/compose/Dimension;)V", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    private final class DimensionProperty extends ObservableProperty<Dimension> {
        public DimensionProperty(Dimension dimension) {
            super(dimension);
        }

        @Override // kotlin.properties.ObservableProperty
        public /* bridge */ /* synthetic */ void afterChange(KProperty kProperty, Dimension dimension, Dimension dimension2) {
            afterChange2((KProperty<?>) kProperty, dimension, dimension2);
        }

        /* renamed from: afterChange, reason: avoid collision after fix types in other method */
        protected void afterChange2(KProperty<?> property, Dimension oldValue, Dimension newValue) {
            CLObject containerObject = ConstrainScope.this.getContainerObject();
            String name = property.getName();
            Intrinsics.checkNotNull(newValue, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
            containerObject.put(name, ((DimensionDescription) newValue).asCLElement$constraintlayout_compose_release());
        }
    }

    /* compiled from: ConstrainScope.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;", "Lkotlin/properties/ObservableProperty;", "", "initialValue", "nameOverride", "", "(Landroidx/constraintlayout/compose/ConstrainScope;FLjava/lang/String;)V", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    private final class FloatProperty extends ObservableProperty<Float> {
        private final String nameOverride;

        public FloatProperty(float f, String str) {
            super(Float.valueOf(f));
            this.nameOverride = str;
        }

        public /* synthetic */ FloatProperty(ConstrainScope constrainScope, float f, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, (i & 2) != 0 ? null : str);
        }

        @Override // kotlin.properties.ObservableProperty
        public /* bridge */ /* synthetic */ void afterChange(KProperty kProperty, Float f, Float f2) {
            afterChange((KProperty<?>) kProperty, f.floatValue(), f2.floatValue());
        }

        protected void afterChange(KProperty<?> property, float oldValue, float newValue) {
            if (Float.isNaN(newValue)) {
                return;
            }
            CLObject containerObject = ConstrainScope.this.getContainerObject();
            String name = this.nameOverride;
            if (name == null) {
                name = property.getName();
            }
            containerObject.putNumber(name, newValue);
        }
    }

    /* compiled from: ConstrainScope.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J.\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0014ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, m3636d2 = {"Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;", "Lkotlin/properties/ObservableProperty;", "Landroidx/compose/ui/unit/Dp;", "initialValue", "nameOverride", "", "(Landroidx/constraintlayout/compose/ConstrainScope;FLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "afterChange-VpY3zN4", "(Lkotlin/reflect/KProperty;FF)V", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    private final class DpProperty extends ObservableProperty<C2002Dp> {
        private final String nameOverride;

        public /* synthetic */ DpProperty(ConstrainScope constrainScope, float f, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, str);
        }

        private DpProperty(float f, String str) {
            super(C2002Dp.m7993boximpl(f));
            this.nameOverride = str;
        }

        public /* synthetic */ DpProperty(ConstrainScope constrainScope, float f, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(constrainScope, f, (i & 2) != 0 ? null : str, null);
        }

        @Override // kotlin.properties.ObservableProperty
        public /* bridge */ /* synthetic */ void afterChange(KProperty kProperty, C2002Dp c2002Dp, C2002Dp c2002Dp2) {
            m8135afterChangeVpY3zN4(kProperty, c2002Dp.getValue(), c2002Dp2.getValue());
        }

        /* renamed from: afterChange-VpY3zN4, reason: not valid java name */
        protected void m8135afterChangeVpY3zN4(KProperty<?> property, float oldValue, float newValue) {
            if (Float.isNaN(newValue)) {
                return;
            }
            CLObject containerObject = ConstrainScope.this.getContainerObject();
            String name = this.nameOverride;
            if (name == null) {
                name = property.getName();
            }
            containerObject.putNumber(name, newValue);
        }
    }

    /* renamed from: linkTo-8ZKsbrE$default, reason: not valid java name */
    public static /* synthetic */ void m8130linkTo8ZKsbrE$default(ConstrainScope constrainScope, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, float f, float f2, float f3, float f4, float f5, int i, Object obj) {
        if ((i & 4) != 0) {
            f = C2002Dp.m7995constructorimpl(0);
        }
        float f6 = f;
        if ((i & 8) != 0) {
            f2 = C2002Dp.m7995constructorimpl(0);
        }
        float f7 = f2;
        if ((i & 16) != 0) {
            f3 = C2002Dp.m7995constructorimpl(0);
        }
        constrainScope.m8133linkTo8ZKsbrE(verticalAnchor, verticalAnchor2, f6, f7, f3, (i & 32) != 0 ? C2002Dp.m7995constructorimpl(0) : f4, (i & 64) != 0 ? 0.5f : f5);
    }

    /* renamed from: linkTo-8ZKsbrE$default, reason: not valid java name */
    public static /* synthetic */ void m8129linkTo8ZKsbrE$default(ConstrainScope constrainScope, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor2, float f, float f2, float f3, float f4, float f5, int i, Object obj) {
        if ((i & 4) != 0) {
            f = C2002Dp.m7995constructorimpl(0);
        }
        float f6 = f;
        if ((i & 8) != 0) {
            f2 = C2002Dp.m7995constructorimpl(0);
        }
        float f7 = f2;
        if ((i & 16) != 0) {
            f3 = C2002Dp.m7995constructorimpl(0);
        }
        constrainScope.m8132linkTo8ZKsbrE(horizontalAnchor, horizontalAnchor2, f6, f7, f3, (i & 32) != 0 ? C2002Dp.m7995constructorimpl(0) : f4, (i & 64) != 0 ? 0.5f : f5);
    }

    /* renamed from: linkTo-R7zmacU$default, reason: not valid java name */
    public static /* synthetic */ void m8131linkToR7zmacU$default(ConstrainScope constrainScope, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, int i, Object obj) {
        constrainScope.m8134linkToR7zmacU(verticalAnchor, horizontalAnchor, verticalAnchor2, horizontalAnchor2, (i & 16) != 0 ? C2002Dp.m7995constructorimpl(0) : f, (i & 32) != 0 ? C2002Dp.m7995constructorimpl(0) : f2, (i & 64) != 0 ? C2002Dp.m7995constructorimpl(0) : f3, (i & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : f4, (i & 256) != 0 ? C2002Dp.m7995constructorimpl(0) : f5, (i & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : f6, (i & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : f7, (i & 2048) != 0 ? C2002Dp.m7995constructorimpl(0) : f8, (i & 4096) != 0 ? 0.5f : f9, (i & 8192) != 0 ? 0.5f : f10);
    }
}
