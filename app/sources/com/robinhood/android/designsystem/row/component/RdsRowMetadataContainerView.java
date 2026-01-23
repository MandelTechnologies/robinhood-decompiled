package com.robinhood.android.designsystem.row.component;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RdsRowMetadataContainerView.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0006\u0010\"\u001a\u00020\u001fJ\u0006\u0010#\u001a\u00020\u001fJ\u0016\u0010$\u001a\u00020\u001f2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010&J\u0016\u0010'\u001a\u00020\u001f2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)J\u0016\u0010+\u001a\u00020\u001f2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR(\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\b\u001a\u0004\u0018\u00010\u0012@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/designsystem/row/component/RdsRowMetadataContainerView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "primaryText", "getPrimaryText", "()Ljava/lang/CharSequence;", "setPrimaryText", "(Ljava/lang/CharSequence;)V", "secondaryText", "getSecondaryText", "setSecondaryText", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "metadataPrimaryEventData", "getMetadataPrimaryEventData", "()Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "setMetadataPrimaryEventData", "(Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;)V", "primaryTextView", "Lcom/robinhood/android/designsystem/text/RhTextView;", "secondaryTextView", "minHeightWhenSingleLine", "", "minHeightWhenMultiLine", "updateMinHeight", "", "hasSecondaryText", "", "animateMetadataIn", "animateMetadataOut", "onPrimaryMetadataClick", "listener", "Lkotlin/Function0;", "setPrimaryTextColor", ResourceTypes.COLOR, "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Landroid/content/res/ColorStateList;", "setSecondaryTextColor", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RdsRowMetadataContainerView extends LinearLayout {
    private static final long ANIMATION_DURATION = 200;
    private UserInteractionEventDescriptor metadataPrimaryEventData;
    private int minHeightWhenMultiLine;
    private int minHeightWhenSingleLine;
    private final RhTextView primaryTextView;
    private final RhTextView secondaryTextView;

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor _set_metadataPrimaryEventData_$lambda$0(UserInteractionEventDescriptor userInteractionEventDescriptor) {
        return userInteractionEventDescriptor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsRowMetadataContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        setGravity(16);
        View.inflate(context, C13997R.layout.merge_row_metadata_container, this);
        View viewFindViewById = findViewById(C13997R.id.row_metadata_primary_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.primaryTextView = (RhTextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C13997R.id.row_metadata_secondary_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.secondaryTextView = (RhTextView) viewFindViewById2;
        int[] RdsRowMetadataContainerView = C13997R.styleable.RdsRowMetadataContainerView;
        Intrinsics.checkNotNullExpressionValue(RdsRowMetadataContainerView, "RdsRowMetadataContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsRowMetadataContainerView, 0, 0);
        this.minHeightWhenSingleLine = typedArrayObtainStyledAttributes.getDimensionPixelSize(C13997R.styleable.RdsRowMetadataContainerView_minHeightWhenSingleLine, getMinimumHeight());
        this.minHeightWhenMultiLine = typedArrayObtainStyledAttributes.getDimensionPixelSize(C13997R.styleable.RdsRowMetadataContainerView_minHeightWhenMultiLine, getMinimumHeight());
        setPrimaryText(typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsRowMetadataContainerView_metadataPrimaryText));
        setSecondaryText(typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsRowMetadataContainerView_metadataSecondaryText));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final CharSequence getPrimaryText() {
        CharSequence text = this.primaryTextView.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final void setPrimaryText(CharSequence charSequence) {
        this.primaryTextView.setText(charSequence);
    }

    public final CharSequence getSecondaryText() {
        CharSequence text = this.secondaryTextView.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final void setSecondaryText(CharSequence charSequence) {
        this.secondaryTextView.setText(charSequence);
        CharSequence secondaryText = getSecondaryText();
        boolean z = secondaryText == null || secondaryText.length() == 0;
        boolean z2 = !z;
        this.secondaryTextView.setVisibility(z ? 8 : 0);
        updateMinHeight(z2);
    }

    public final UserInteractionEventDescriptor getMetadataPrimaryEventData() {
        return this.metadataPrimaryEventData;
    }

    public final void setMetadataPrimaryEventData(final UserInteractionEventDescriptor userInteractionEventDescriptor) {
        this.metadataPrimaryEventData = userInteractionEventDescriptor;
        ViewsKt.eventData$default(this.primaryTextView, false, new Function0() { // from class: com.robinhood.android.designsystem.row.component.RdsRowMetadataContainerView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RdsRowMetadataContainerView._set_metadataPrimaryEventData_$lambda$0(userInteractionEventDescriptor);
            }
        }, 1, null);
    }

    private final void updateMinHeight(boolean hasSecondaryText) {
        int i;
        if (hasSecondaryText) {
            i = this.minHeightWhenMultiLine;
        } else {
            i = this.minHeightWhenSingleLine;
        }
        setMinimumHeight(i);
    }

    public final void animateMetadataIn() {
        this.primaryTextView.animate().alpha(1.0f).setDuration(200L).withStartAction(new Runnable() { // from class: com.robinhood.android.designsystem.row.component.RdsRowMetadataContainerView.animateMetadataIn.1
            @Override // java.lang.Runnable
            public final void run() {
                RdsRowMetadataContainerView.this.setVisibility(0);
            }
        }).start();
    }

    public final void animateMetadataOut() {
        this.primaryTextView.animate().alpha(0.0f).setDuration(200L).withEndAction(new Runnable() { // from class: com.robinhood.android.designsystem.row.component.RdsRowMetadataContainerView.animateMetadataOut.1
            @Override // java.lang.Runnable
            public final void run() {
                RdsRowMetadataContainerView.this.setVisibility(8);
            }
        }).start();
    }

    public final void onPrimaryMetadataClick(Function0<Unit> listener) {
        OnClickListeners.onClick(this.primaryTextView, listener);
    }

    public final void setPrimaryTextColor(ResourceReferences4<? extends ColorStateList> color) {
        ScarletManager2.overrideAttribute(this.primaryTextView, R.attr.textColor, color);
    }

    public final void setSecondaryTextColor(ResourceReferences4<? extends ColorStateList> color) {
        ScarletManager2.overrideAttribute(this.secondaryTextView, R.attr.textColor, color);
    }
}
