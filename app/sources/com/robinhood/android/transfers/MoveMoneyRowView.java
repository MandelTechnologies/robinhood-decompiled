package com.robinhood.android.transfers;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.transfers.transferhub.C30556R;
import com.robinhood.utils.extensions.ViewGroups;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MoveMoneyRowView.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/transfers/MoveMoneyRowView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "iconImg", "Landroid/widget/ImageView;", "titleTxt", "Landroid/widget/TextView;", "descriptionTxt", "value", "Landroid/graphics/drawable/Drawable;", "icon", "getIcon", "()Landroid/graphics/drawable/Drawable;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "", "title", "getTitle", "()Ljava/lang/CharSequence;", "setTitle", "(Ljava/lang/CharSequence;)V", "description", "getDescription", "setDescription", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class MoveMoneyRowView extends ConstraintLayout {
    public static final int $stable = 8;
    private final TextView descriptionTxt;
    private final ImageView iconImg;
    private final TextView titleTxt;

    public /* synthetic */ MoveMoneyRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoveMoneyRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C30556R.layout.view_move_money_row, true);
        View viewFindViewById = findViewById(C30556R.id.move_money_row_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.iconImg = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(C30556R.id.move_money_row_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.titleTxt = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C30556R.id.move_money_row_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.descriptionTxt = (TextView) viewFindViewById3;
        int[] MoveMoneyRowView = C30556R.styleable.MoveMoneyRowView;
        Intrinsics.checkNotNullExpressionValue(MoveMoneyRowView, "MoveMoneyRowView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, MoveMoneyRowView, 0, 0);
        setIcon(typedArrayObtainStyledAttributes.getDrawable(C30556R.styleable.MoveMoneyRowView_iconSrc));
        setTitle(typedArrayObtainStyledAttributes.getText(C30556R.styleable.MoveMoneyRowView_titleText));
        setDescription(typedArrayObtainStyledAttributes.getText(C30556R.styleable.MoveMoneyRowView_descriptionText));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final Drawable getIcon() {
        return this.iconImg.getDrawable();
    }

    public final void setIcon(Drawable drawable) {
        this.iconImg.setImageDrawable(drawable);
    }

    public final CharSequence getTitle() {
        return this.titleTxt.getText();
    }

    public final void setTitle(CharSequence charSequence) {
        this.titleTxt.setText(charSequence);
    }

    public final CharSequence getDescription() {
        return this.descriptionTxt.getText();
    }

    public final void setDescription(CharSequence charSequence) {
        this.descriptionTxt.setText(charSequence);
    }
}
