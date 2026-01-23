package com.robinhood.android.productmarketing;

import android.content.Context;
import android.content.res.TypedArray;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.staticcontent.model.disclosure.DisclosureContent;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingPictogram;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.test.idler.TrackedListAdapter;
import com.robinhood.utils.DistinctObservableProperty;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.Transitions2;
import com.robinhood.utils.extensions.TypedArrays3;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: ProductMarketingView.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u000289B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u00102\u001a\u000203H\u0014J\u0010\u00104\u001a\u0002032\b\u00105\u001a\u0004\u0018\u000106J\b\u00107\u001a\u000203H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR+\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001f*\u0004\b#\u0010$R+\u0010'\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010!\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR$\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020,@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/productmarketing/ProductMarketingView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "featureAdapter", "Lcom/robinhood/android/productmarketing/ProductMarketingView$FeatureAdapter;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "titleTxt", "Landroid/widget/TextView;", "descriptionTxt", "disclosureTxt", "progressBar", "Landroid/widget/ProgressBar;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "transitionCompleteRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "<set-?>", "isLoading", "()Z", "setLoading", "(Z)V", "isLoading$delegate", "Lkotlin/properties/ReadWriteProperty;", "showPageTitle", "getShowPageTitle$delegate", "(Lcom/robinhood/android/productmarketing/ProductMarketingView;)Ljava/lang/Object;", "getShowPageTitle", "setShowPageTitle", "showProductDescription", "getShowProductDescription", "setShowProductDescription", "showProductDescription$delegate", "value", "Lcom/robinhood/android/productmarketing/ProductMarketingView$TextGravity;", "textGravity", "getTextGravity", "()Lcom/robinhood/android/productmarketing/ProductMarketingView$TextGravity;", "setTextGravity", "(Lcom/robinhood/android/productmarketing/ProductMarketingView$TextGravity;)V", "onAttachedToWindow", "", "bind", "content", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "refreshUi", "TextGravity", "FeatureAdapter", "lib-product-marketing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ProductMarketingView extends Hammer_ProductMarketingView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ProductMarketingView.class, "isLoading", "isLoading()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ProductMarketingView.class, "showProductDescription", "getShowProductDescription()Z", 0))};
    public static final int $stable = 8;
    private final TextView descriptionTxt;
    private final TextView disclosureTxt;
    private final FeatureAdapter featureAdapter;

    /* renamed from: isLoading$delegate, reason: from kotlin metadata */
    private final Interfaces3 isLoading;
    public Markwon markwon;
    private final ProgressBar progressBar;
    private final RecyclerView recyclerView;

    /* renamed from: showProductDescription$delegate, reason: from kotlin metadata */
    private final Interfaces3 showProductDescription;
    private TextGravity textGravity;
    private final TextView titleTxt;
    private final BehaviorRelay<Boolean> transitionCompleteRelay;

    public /* synthetic */ ProductMarketingView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProductMarketingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C25896R.layout.merge_product_marketing_view, true);
        this.featureAdapter = new FeatureAdapter();
        View viewFindViewById = findViewById(C25896R.id.feature_view_recycler_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.recyclerView = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = findViewById(C25896R.id.feature_view_product_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.titleTxt = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C25896R.id.feature_view_product_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.descriptionTxt = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(C25896R.id.feature_view_disclosure);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.disclosureTxt = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(C25896R.id.feature_view_progress_bar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.progressBar = (ProgressBar) viewFindViewById5;
        BehaviorRelay<Boolean> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.transitionCompleteRelay = behaviorRelayCreate;
        final Boolean bool = Boolean.FALSE;
        this.isLoading = new DistinctObservableProperty<Boolean>(bool) { // from class: com.robinhood.android.productmarketing.ProductMarketingView$special$$inlined$distinctObservable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                newValue.getClass();
                this.refreshUi();
            }
        };
        final Boolean bool2 = Boolean.TRUE;
        this.showProductDescription = new DistinctObservableProperty<Boolean>(bool2) { // from class: com.robinhood.android.productmarketing.ProductMarketingView$special$$inlined$distinctObservable$2
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                newValue.getClass();
                this.refreshUi();
            }
        };
        this.textGravity = TextGravity.START;
        int[] ProductMarketingView = C25896R.styleable.ProductMarketingView;
        Intrinsics.checkNotNullExpressionValue(ProductMarketingView, "ProductMarketingView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ProductMarketingView, 0, 0);
        setShowPageTitle(typedArrayObtainStyledAttributes.getBoolean(C25896R.styleable.ProductMarketingView_showPageTitle, true));
        setShowProductDescription(typedArrayObtainStyledAttributes.getBoolean(C25896R.styleable.ProductMarketingView_showProductDescription, true));
        Integer intOrNull = TypedArrays3.getIntOrNull(typedArrayObtainStyledAttributes, C25896R.styleable.ProductMarketingView_textGravity);
        TextGravity textGravity = intOrNull != null ? TextGravity.values()[intOrNull.intValue()] : null;
        setTextGravity(textGravity == null ? TextGravity.CENTER_HORIZONTAL : textGravity);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    private final boolean isLoading() {
        return ((Boolean) this.isLoading.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    private final void setLoading(boolean z) {
        this.isLoading.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final boolean getShowPageTitle() {
        return this.titleTxt.getVisibility() == 0;
    }

    public final void setShowPageTitle(boolean z) {
        this.titleTxt.setVisibility(z ? 0 : 8);
    }

    public final boolean getShowProductDescription() {
        return ((Boolean) this.showProductDescription.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public final void setShowProductDescription(boolean z) {
        this.showProductDescription.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public final TextGravity getTextGravity() {
        return this.textGravity;
    }

    public final void setTextGravity(TextGravity value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.textGravity = value;
        this.titleTxt.setGravity(value.getIntValue());
        this.descriptionTxt.setGravity(value.getIntValue());
        this.disclosureTxt.setGravity(value.getIntValue());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.setAdapter(this.featureAdapter);
        recyclerView.setItemAnimator(null);
    }

    public final void bind(ProductMarketingContent content) {
        if (content == null) {
            setLoading(true);
            return;
        }
        setLoading(false);
        this.featureAdapter.submitList(content.getFeatures());
        this.titleTxt.setText(content.getPageTitle());
        this.descriptionTxt.setText(content.getProductDescription());
        TextView textView = this.disclosureTxt;
        DisclosureContent disclosure = content.getDisclosure();
        TextViewsKt.setVisibilityText(textView, disclosure != null ? disclosure.getContent() : null);
        refreshUi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void refreshUi() {
        boolean z;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.productmarketing.ProductMarketingView$refreshUi$$inlined$beginDelayedTransition$1
                @Override // android.transition.Transition.TransitionListener
                public void onTransitionCancel(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionPause(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionResume(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionStart(Transition transition) {
                    IdlingResourceCounters2.increment(IdlingResourceType.DELAYED_TRANSITION);
                }
            });
            transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.productmarketing.ProductMarketingView$refreshUi$$inlined$beginDelayedTransition$2
                @Override // android.transition.Transition.TransitionListener
                public void onTransitionCancel(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionPause(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionResume(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionStart(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition) {
                    IdlingResourceCounters2.decrement(IdlingResourceType.DELAYED_TRANSITION);
                }
            });
            Transitions2.add(transitionSet, new AutoTransition());
            transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.productmarketing.ProductMarketingView$refreshUi$lambda$6$$inlined$doOnStart$1
                @Override // android.transition.Transition.TransitionListener
                public void onTransitionCancel(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionPause(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionResume(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionStart(Transition transition) {
                    this.this$0.transitionCompleteRelay.accept(Boolean.FALSE);
                }
            });
            transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.productmarketing.ProductMarketingView$refreshUi$lambda$6$$inlined$doOnEnd$1
                @Override // android.transition.Transition.TransitionListener
                public void onTransitionCancel(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionPause(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionResume(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionStart(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition) {
                    this.this$0.transitionCompleteRelay.accept(Boolean.TRUE);
                }
            });
            TransitionManager.beginDelayedTransition(viewGroup, transitionSet);
        }
        boolean zIsLoading = isLoading();
        this.progressBar.setVisibility(zIsLoading ? 0 : 8);
        this.recyclerView.setVisibility(!zIsLoading ? 0 : 8);
        this.descriptionTxt.setVisibility(!zIsLoading && getShowProductDescription() ? 0 : 8);
        TextView textView = this.disclosureTxt;
        if (!zIsLoading) {
            CharSequence text = textView.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            z = text.length() > 0;
        }
        textView.setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProductMarketingView.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/productmarketing/ProductMarketingView$TextGravity;", "", "intValue", "", "<init>", "(Ljava/lang/String;II)V", "getIntValue", "()I", "START", "CENTER_HORIZONTAL", "lib-product-marketing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TextGravity {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TextGravity[] $VALUES;
        private final int intValue;
        public static final TextGravity START = new TextGravity("START", 0, 8388611);
        public static final TextGravity CENTER_HORIZONTAL = new TextGravity("CENTER_HORIZONTAL", 1, 1);

        private static final /* synthetic */ TextGravity[] $values() {
            return new TextGravity[]{START, CENTER_HORIZONTAL};
        }

        public static EnumEntries<TextGravity> getEntries() {
            return $ENTRIES;
        }

        private TextGravity(String str, int i, int i2) {
            this.intValue = i2;
        }

        public final int getIntValue() {
            return this.intValue;
        }

        static {
            TextGravity[] textGravityArr$values = $values();
            $VALUES = textGravityArr$values;
            $ENTRIES = EnumEntries2.enumEntries(textGravityArr$values);
        }

        public static TextGravity valueOf(String str) {
            return (TextGravity) Enum.valueOf(TextGravity.class, str);
        }

        public static TextGravity[] values() {
            return (TextGravity[]) $VALUES.clone();
        }
    }

    /* compiled from: ProductMarketingView.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u001e\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\r\u001a\u00020\fH\u0016R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/productmarketing/ProductMarketingView$FeatureAdapter;", "Lcom/robinhood/test/idler/TrackedListAdapter;", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent$Feature;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Landroid/view/View;", "<init>", "()V", "viewTypes", "", "Lcom/robinhood/android/productmarketing/ProductMarketingView$FeatureAdapter$ViewType;", "[Lcom/robinhood/android/productmarketing/ProductMarketingView$FeatureAdapter$ViewType;", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "ViewType", "lib-product-marketing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class FeatureAdapter extends TrackedListAdapter<ProductMarketingContent.Feature, GenericViewHolder<? extends View>> {
        private final ViewType[] viewTypes;

        /* compiled from: ProductMarketingView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ViewType.values().length];
                try {
                    iArr[ViewType.LEGACY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ViewType.RDS_VALUE_PROP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public FeatureAdapter() {
            super(DiffCallbacks.INSTANCE.byEquality(new PropertyReference1Impl() { // from class: com.robinhood.android.productmarketing.ProductMarketingView.FeatureAdapter.1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
                public Object get(Object obj) {
                    return ((ProductMarketingContent.Feature) obj).getIdentifier();
                }
            }));
            this.viewTypes = ViewType.values();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            ProductMarketingPictogram pictogram = getItem(position).getPictogram();
            if (pictogram instanceof ProductMarketingPictogram.Legacy) {
                return ViewType.LEGACY.ordinal();
            }
            if (!(pictogram instanceof ProductMarketingPictogram.Pog) && !(pictogram instanceof ProductMarketingPictogram.Remote) && pictogram != null) {
                throw new NoWhenBranchMatchedException();
            }
            return ViewType.RDS_VALUE_PROP.ordinal();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public GenericViewHolder<View> onCreateViewHolder(ViewGroup parent, int viewType) {
            View viewInflate;
            Intrinsics.checkNotNullParameter(parent, "parent");
            int i = WhenMappings.$EnumSwitchMapping$0[this.viewTypes[viewType].ordinal()];
            if (i == 1) {
                viewInflate = SplashRowView.INSTANCE.inflate(parent);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                viewInflate = RdsRowView.ValuePropRowInflater.INSTANCE.inflate(parent);
            }
            return new GenericViewHolder<>(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(GenericViewHolder<? extends View> holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            ProductMarketingContent.Feature item = getItem(position);
            int i = WhenMappings.$EnumSwitchMapping$0[this.viewTypes[getItemViewType(position)].ordinal()];
            if (i == 1) {
                View view = holder.getView();
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.productmarketing.SplashRowView");
                SplashRowView splashRowView = (SplashRowView) view;
                splashRowView.setTitleText(item.getTitle());
                splashRowView.setDescriptionText(item.getDescription());
                ProductMarketingPictogram pictogram = item.getPictogram();
                Intrinsics.checkNotNull(pictogram, "null cannot be cast to non-null type com.robinhood.staticcontent.model.productmarketing.ProductMarketingPictogram.Legacy");
                ProductMarketingPictogram.Legacy legacy = (ProductMarketingPictogram.Legacy) pictogram;
                splashRowView.setIconDrawable(ViewsKt.getDrawable(splashRowView, legacy.getDayResId()));
                splashRowView.setIconDrawableNight(ViewsKt.getDrawable(splashRowView, legacy.getNightResId()));
                return;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            View view2 = holder.getView();
            Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsRowView");
            RdsRowView rdsRowView = (RdsRowView) view2;
            rdsRowView.setPrimaryText(item.getTitle());
            rdsRowView.setSecondaryText(item.getDescription());
            ProductMarketingPictogram pictogram2 = item.getPictogram();
            ProductMarketingPictogram.Pog pog = pictogram2 instanceof ProductMarketingPictogram.Pog ? (ProductMarketingPictogram.Pog) pictogram2 : null;
            if (pog == null) {
                rdsRowView.setPogPictogram(null);
                rdsRowView.setLeadingIconDrawable(ViewsKt.getDrawable(rdsRowView, C20690R.drawable.ic_rds_sparkle_bullet_24dp));
            } else {
                rdsRowView.setPogPictogram(ViewsKt.getDrawable(rdsRowView, pog.getResId()));
                rdsRowView.setLeadingIconDrawable(null);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ProductMarketingView.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/productmarketing/ProductMarketingView$FeatureAdapter$ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "LEGACY", "RDS_VALUE_PROP", "lib-product-marketing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        private static final class ViewType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ ViewType[] $VALUES;
            public static final ViewType LEGACY = new ViewType("LEGACY", 0);
            public static final ViewType RDS_VALUE_PROP = new ViewType("RDS_VALUE_PROP", 1);

            private static final /* synthetic */ ViewType[] $values() {
                return new ViewType[]{LEGACY, RDS_VALUE_PROP};
            }

            public static EnumEntries<ViewType> getEntries() {
                return $ENTRIES;
            }

            private ViewType(String str, int i) {
            }

            static {
                ViewType[] viewTypeArr$values = $values();
                $VALUES = viewTypeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(viewTypeArr$values);
            }

            public static ViewType valueOf(String str) {
                return (ViewType) Enum.valueOf(ViewType.class, str);
            }

            public static ViewType[] values() {
                return (ViewType[]) $VALUES.clone();
            }
        }
    }
}
