package com.withpersona.sdk2.inquiry.shared.p422ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.truelayer.payments.p419ui.utils.TestTags;
import com.withpersona.sdk2.inquiry.shared.R$dimen;
import com.withpersona.sdk2.inquiry.shared.R$drawable;
import com.withpersona.sdk2.inquiry.shared.R$styleable;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2NavigationBarBinding;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Pi2NavigationBar.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000b2\b\b\u0001\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010!\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "defStyleRes", "", "init", "(Landroid/util/AttributeSet;II)V", "onFinishInflate", "()V", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "state", "Lkotlin/Function0;", TestTags.BACK, "cancel", "setState$shared_release", "(Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "setState", "controlsColor", "setControlsColor", "(I)V", "Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2NavigationBarBinding;", "binding", "Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2NavigationBarBinding;", "Landroid/view/View;", "getBackButton", "()Landroid/view/View;", "backButton", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class Pi2NavigationBar extends ConstraintLayout {
    private final Pi2NavigationBarBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pi2NavigationBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Pi2NavigationBarBinding pi2NavigationBarBindingInflate = Pi2NavigationBarBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(pi2NavigationBarBindingInflate, "inflate(...)");
        this.binding = pi2NavigationBarBindingInflate;
        init(attributeSet, 0, 0);
    }

    public final View getBackButton() {
        ImageView navBarBackButton = this.binding.navBarBackButton;
        Intrinsics.checkNotNullExpressionValue(navBarBackButton, "navBarBackButton");
        return navBarBackButton;
    }

    private final void init(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R$styleable.Pi2NavigationBar, defStyleAttr, defStyleRes);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == R$styleable.Pi2NavigationBar_pi2BackButtonIcon) {
                    this.binding.navBarBackButton.setImageResource(typedArrayObtainStyledAttributes.getResourceId(index, R$drawable.pi2_shared_arrow_back_16));
                } else if (index == R$styleable.Pi2NavigationBar_pi2CancelButtonIcon) {
                    this.binding.navBarCancelButton.setImageResource(typedArrayObtainStyledAttributes.getResourceId(index, R$drawable.pi2_shared_close_icon));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() throws Resources.NotFoundException {
        super.onFinishInflate();
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R$dimen.pi2_navigation_bar_padding);
        setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
    }

    public final void setState$shared_release(NavigationState state, final Function0<Unit> back, final Function0<Unit> cancel) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(back, "back");
        Intrinsics.checkNotNullParameter(cancel, "cancel");
        if (!state.getShowNavBar()) {
            this.binding.navBarBackButton.setVisibility(8);
            this.binding.navBarCancelButton.setVisibility(8);
            return;
        }
        this.binding.navBarBackButton.setVisibility(state.getShowBackButton() ? 0 : 4);
        this.binding.navBarBackButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                back.invoke();
            }
        });
        this.binding.navBarCancelButton.setVisibility(state.getShowCancelButton() ? 0 : 4);
        this.binding.navBarCancelButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cancel.invoke();
            }
        });
        this.binding.navBarBackButton.setEnabled(state.getIsNavigationEnabled());
        this.binding.navBarCancelButton.setEnabled(state.getIsNavigationEnabled());
    }

    public final void setControlsColor(int controlsColor) {
        this.binding.navBarBackButton.setColorFilter(controlsColor);
        this.binding.navBarCancelButton.setColorFilter(controlsColor);
    }
}
