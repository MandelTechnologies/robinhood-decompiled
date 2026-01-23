package com.robinhood.android.designsystem.selectioncontrol;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.jakewharton.rxbinding3.InitialValueObservable;
import com.jakewharton.rxbinding3.internal.mainThread;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.extensions.TypedArrays;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.row.component.RdsRowTextContainerView;
import com.robinhood.android.designsystem.viewstubholder.ViewStubHolder;
import com.robinhood.android.equitydetail.p123ui.statistics.StatisticsSection2;
import com.robinhood.utils.extensions.TypedArrays3;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RdsToggleView.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001VB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010J\u001a\u00020A2\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010LJ\u0010\u0010M\u001a\u00020A2\u0006\u0010N\u001a\u000203H\u0016J\b\u0010O\u001a\u000203H\u0016J\u001c\u0010P\u001a\u00020A2\u0014\u0010Q\u001a\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020A\u0018\u00010@J\u000e\u0010R\u001a\u00020A2\u0006\u0010S\u001a\u000203J\f\u0010T\u001a\b\u0012\u0004\u0012\u0002030UR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010!\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R(\u0010$\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR(\u0010'\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010 R(\u0010+\u001a\u0004\u0018\u00010*2\b\u0010\u000e\u001a\u0004\u0018\u00010*8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u00100\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR$\u00104\u001a\u0002032\u0006\u0010\u000e\u001a\u0002038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u00108\u001a\u0002032\u0006\u0010\u000e\u001a\u0002038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00105\"\u0004\b9\u00107R$\u0010:\u001a\u0002032\u0006\u0010\u000e\u001a\u0002038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u00105\"\u0004\b;\u00107R$\u0010<\u001a\u0002032\u0006\u0010\u000e\u001a\u0002038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u00105\"\u0004\b>\u00107R\u001c\u0010?\u001a\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020A\u0018\u00010@X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020CX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020EX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020GX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020IX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006W"}, m3636d2 = {"Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "leadingIconViewStubHolder", "Lcom/robinhood/android/designsystem/viewstubholder/ViewStubHolder;", "Landroid/widget/ImageView;", "numberPogViewStubHolder", "Lcom/robinhood/android/designsystem/pog/RdsPogView;", "pogViewStubHolder", "value", "", "primaryText", "getPrimaryText", "()Ljava/lang/CharSequence;", "setPrimaryText", "(Ljava/lang/CharSequence;)V", "Landroid/graphics/drawable/Drawable;", "primaryTextIcon", "getPrimaryTextIcon", "()Landroid/graphics/drawable/Drawable;", "setPrimaryTextIcon", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/content/res/ColorStateList;", "primaryTextIconTint", "getPrimaryTextIconTint", "()Landroid/content/res/ColorStateList;", "setPrimaryTextIconTint", "(Landroid/content/res/ColorStateList;)V", "secondaryText", "getSecondaryText", "setSecondaryText", "leadingIcon", "getLeadingIcon", "setLeadingIcon", "leadingIconTint", "getLeadingIconTint", "setLeadingIconTint", "", "pogNumber", "getPogNumber", "()Ljava/lang/Integer;", "setPogNumber", "(Ljava/lang/Integer;)V", "pogPictogram", "getPogPictogram", "setPogPictogram", "", "isChecked", "()Z", "setChecked", "(Z)V", "isLocked", "setLocked", "isLoading", "setLoading", "showBottomDivider", "getShowBottomDivider", "setShowBottomDivider", "onCheckedChangedListener", "Lkotlin/Function1;", "", "textContainer", "Lcom/robinhood/android/designsystem/row/component/RdsRowTextContainerView;", "switch", "Lcom/robinhood/android/designsystem/selectioncontrol/RdsSwitch;", "progressBar", "Landroid/widget/ProgressBar;", StatisticsSection2.DIVIDER, "Landroid/view/View;", "onPrimaryTextClick", "action", "Lkotlin/Function0;", "setEnabled", "enabled", "performClick", "onCheckedChanged", "listener", "setCheckedProgrammatically", "checked", "checkedChanges", "Lcom/jakewharton/rxbinding3/InitialValueObservable;", "CheckedChangeObservable", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class RdsToggleView extends RdsRippleContainerView {
    private final View divider;
    private ColorStateList leadingIconTint;
    private ViewStubHolder<ImageView> leadingIconViewStubHolder;
    private ViewStubHolder<RdsPogView> numberPogViewStubHolder;
    private Function1<? super Boolean, Unit> onCheckedChangedListener;
    private ViewStubHolder<RdsPogView> pogViewStubHolder;
    private final ProgressBar progressBar;
    private final RdsSwitch switch;
    private final RdsRowTextContainerView textContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsToggleView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C13997R.layout.merge_rds_toggle, this);
        View viewFindViewById = findViewById(C13997R.id.toggle_leading_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.leadingIconViewStubHolder = new ViewStubHolder<>((ViewStub) viewFindViewById);
        View viewFindViewById2 = findViewById(C13997R.id.toggle_number_pog);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.numberPogViewStubHolder = new ViewStubHolder<>((ViewStub) viewFindViewById2);
        View viewFindViewById3 = findViewById(C13997R.id.toggle_pog);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.pogViewStubHolder = new ViewStubHolder<>((ViewStub) viewFindViewById3);
        View viewFindViewById4 = findViewById(C13997R.id.toggle_text_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.textContainer = (RdsRowTextContainerView) viewFindViewById4;
        View viewFindViewById5 = findViewById(C13997R.id.toggle_switch);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.switch = (RdsSwitch) viewFindViewById5;
        View viewFindViewById6 = findViewById(C13997R.id.toggle_progress_bar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.progressBar = (ProgressBar) viewFindViewById6;
        View viewFindViewById7 = findViewById(C13997R.id.toggle_bottom_divider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.divider = viewFindViewById7;
        int[] RdsToggleView = C13997R.styleable.RdsToggleView;
        Intrinsics.checkNotNullExpressionValue(RdsToggleView, "RdsToggleView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsToggleView, 0, 0);
        setPrimaryText(typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsToggleView_primaryText));
        setPrimaryTextIcon(TypedArrays.getDrawableCompat(typedArrayObtainStyledAttributes, context, C13997R.styleable.RdsToggleView_primaryTextIcon));
        setPrimaryTextIconTint(typedArrayObtainStyledAttributes.getColorStateList(C13997R.styleable.RdsToggleView_primaryTextIconTint));
        setSecondaryText(typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsToggleView_secondaryText));
        setLeadingIcon(TypedArrays.getDrawableCompat(typedArrayObtainStyledAttributes, context, C13997R.styleable.RdsToggleView_leadingIcon));
        setLeadingIconTint(typedArrayObtainStyledAttributes.getColorStateList(C13997R.styleable.RdsToggleView_leadingIconTint));
        setPogNumber(TypedArrays3.getIntOrNull(typedArrayObtainStyledAttributes, C13997R.styleable.RdsToggleView_pogNumber));
        setPogPictogram(TypedArrays.getDrawableCompat(typedArrayObtainStyledAttributes, context, C13997R.styleable.RdsToggleView_pogPictogram));
        setChecked(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsToggleView_android_checked, isChecked()));
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsToggleView_android_enabled, isEnabled()));
        setLocked(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsToggleView_locked, isLocked()));
        setLoading(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsToggleView_loading, isLoading()));
        setShowBottomDivider(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsToggleView_showBottomDivider, getShowBottomDivider()));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final CharSequence getPrimaryText() {
        return this.textContainer.getPrimaryText();
    }

    public final void setPrimaryText(CharSequence charSequence) {
        this.textContainer.setPrimaryText(charSequence);
    }

    public final Drawable getPrimaryTextIcon() {
        return this.textContainer.getPrimaryTextIcon();
    }

    public final void setPrimaryTextIcon(Drawable drawable) {
        this.textContainer.setPrimaryTextIcon(drawable);
    }

    public final ColorStateList getPrimaryTextIconTint() {
        return this.textContainer.getPrimaryTextIconTint();
    }

    public final void setPrimaryTextIconTint(ColorStateList colorStateList) {
        this.textContainer.setPrimaryTextIconTint(colorStateList);
    }

    public final CharSequence getSecondaryText() {
        return this.textContainer.getSecondaryText();
    }

    public final void setSecondaryText(CharSequence charSequence) {
        this.textContainer.setSecondaryText(charSequence);
    }

    public final Drawable getLeadingIcon() {
        if (this.leadingIconViewStubHolder.isInflated()) {
            return ((ImageView) this.leadingIconViewStubHolder.get()).getDrawable();
        }
        return null;
    }

    public final void setLeadingIcon(Drawable drawable) {
        if (drawable != null || this.leadingIconViewStubHolder.isInflated()) {
            ImageView imageView = (ImageView) this.leadingIconViewStubHolder.get();
            imageView.setImageDrawable(drawable);
            imageView.setImageTintList(this.leadingIconTint);
            imageView.setVisibility(drawable != null ? 0 : 8);
            imageView.setEnabled(isEnabled());
        }
    }

    public final ColorStateList getLeadingIconTint() {
        return this.leadingIconTint;
    }

    public final void setLeadingIconTint(ColorStateList colorStateList) {
        this.leadingIconTint = colorStateList;
        if (this.leadingIconViewStubHolder.isInflated()) {
            ((ImageView) this.leadingIconViewStubHolder.get()).setImageTintList(colorStateList);
        }
    }

    public final Integer getPogNumber() {
        if (this.numberPogViewStubHolder.isInflated()) {
            return ((RdsPogView) this.numberPogViewStubHolder.get()).getNumber();
        }
        return null;
    }

    public final void setPogNumber(Integer num) {
        if (num != null || this.numberPogViewStubHolder.isInflated()) {
            RdsPogView rdsPogView = (RdsPogView) this.numberPogViewStubHolder.get();
            rdsPogView.setNumber(num);
            rdsPogView.setVisibility(num != null ? 0 : 8);
            rdsPogView.setEnabled(isEnabled());
        }
    }

    public final Drawable getPogPictogram() {
        if (this.pogViewStubHolder.isInflated()) {
            return ((RdsPogView) this.pogViewStubHolder.get()).getPictogram();
        }
        return null;
    }

    public final void setPogPictogram(Drawable drawable) {
        if (drawable != null || this.pogViewStubHolder.isInflated()) {
            RdsPogView rdsPogView = (RdsPogView) this.pogViewStubHolder.get();
            rdsPogView.setPictogram(drawable);
            rdsPogView.setVisibility(drawable != null ? 0 : 8);
            rdsPogView.setEnabled(isEnabled());
        }
    }

    public final boolean isChecked() {
        return this.switch.isChecked();
    }

    public final void setChecked(boolean z) throws Resources.NotFoundException {
        this.switch.setChecked(z);
    }

    public final boolean isLocked() {
        return this.switch.getIsLocked();
    }

    public final void setLocked(boolean z) {
        this.switch.setLocked(z);
    }

    public final boolean isLoading() {
        return this.progressBar.getVisibility() == 0;
    }

    public final void setLoading(boolean z) {
        setClickable(!z);
        this.progressBar.setVisibility(!z ? 4 : 0);
    }

    public final boolean getShowBottomDivider() {
        return this.divider.getVisibility() == 0;
    }

    public final void setShowBottomDivider(boolean z) {
        this.divider.setVisibility(z ? 0 : 8);
    }

    public final void onPrimaryTextClick(Function0<Unit> action) {
        this.textContainer.onPrimaryTextClick(action);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.textContainer.setEnabled(enabled);
        this.switch.setEnabled(enabled);
        if (this.leadingIconViewStubHolder.isInflated()) {
            ((ImageView) this.leadingIconViewStubHolder.get()).setEnabled(enabled);
        }
        if (this.numberPogViewStubHolder.isInflated()) {
            ((RdsPogView) this.numberPogViewStubHolder.get()).setEnabled(enabled);
        }
        if (this.pogViewStubHolder.isInflated()) {
            ((RdsPogView) this.pogViewStubHolder.get()).setEnabled(enabled);
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        this.switch.performClick();
        return super.performClick();
    }

    public final void onCheckedChanged(final Function1<? super Boolean, Unit> listener) {
        this.onCheckedChangedListener = listener;
        if (listener != null) {
            this.switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.robinhood.android.designsystem.selectioncontrol.RdsToggleView.onCheckedChanged.1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    listener.invoke(Boolean.valueOf(z));
                }
            });
        } else {
            this.switch.setOnCheckedChangeListener(null);
        }
    }

    public final void setCheckedProgrammatically(boolean checked) throws Resources.NotFoundException {
        this.switch.setOnCheckedChangeListener(null);
        setChecked(checked);
        onCheckedChanged(this.onCheckedChangedListener);
    }

    public final InitialValueObservable<Boolean> checkedChanges() {
        return new CheckedChangeObservable(this);
    }

    /* compiled from: RdsToggleView.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\nH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView$CheckedChangeObservable;", "Lcom/jakewharton/rxbinding3/InitialValueObservable;", "", "view", "Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;", "<init>", "(Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;)V", "subscribeListener", "", "observer", "Lio/reactivex/Observer;", "initialValue", "getInitialValue", "()Ljava/lang/Boolean;", "Listener", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    private static final class CheckedChangeObservable extends InitialValueObservable<Boolean> {
        private final RdsToggleView view;

        public CheckedChangeObservable(RdsToggleView view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
        }

        @Override // com.jakewharton.rxbinding3.InitialValueObservable
        protected void subscribeListener(Observer<? super Boolean> observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            if (mainThread.checkMainThread(observer)) {
                Listener listener = new Listener(this.view, observer);
                observer.onSubscribe(listener);
                this.view.onCheckedChanged(listener);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.jakewharton.rxbinding3.InitialValueObservable
        public Boolean getInitialValue() {
            return Boolean.valueOf(this.view.isChecked());
        }

        /* compiled from: RdsToggleView.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002J\b\u0010\r\u001a\u00020\u0004H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView$CheckedChangeObservable$Listener;", "Lio/reactivex/android/MainThreadDisposable;", "Lkotlin/Function1;", "", "", "view", "Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;", "observer", "Lio/reactivex/Observer;", "<init>", "(Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;Lio/reactivex/Observer;)V", "invoke", "isChecked", "onDispose", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        private static final class Listener extends MainThreadDisposable implements Function1<Boolean, Unit> {
            private final Observer<? super Boolean> observer;
            private final RdsToggleView view;

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public Listener(RdsToggleView view, Observer<? super Boolean> observer) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(observer, "observer");
                this.view = view;
                this.observer = observer;
            }

            public void invoke(boolean isChecked) {
                if (isDisposed()) {
                    return;
                }
                this.observer.onNext(Boolean.valueOf(isChecked));
            }

            @Override // io.reactivex.android.MainThreadDisposable
            protected void onDispose() {
                this.view.onCheckedChanged(null);
            }
        }
    }
}
