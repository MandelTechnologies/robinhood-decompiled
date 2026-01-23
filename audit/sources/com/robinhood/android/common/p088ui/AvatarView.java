package com.robinhood.android.common.p088ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.utils.extensions.ViewGroups;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

/* compiled from: AvatarView.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/ui/AvatarView;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "avatarTxt", "Landroid/widget/TextView;", "avatarImg", "Landroid/widget/ImageView;", "bind", "", "avatarText", "", "avatarUrl", "Lokhttp3/HttpUrl;", "lib-common-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AvatarView extends Hammer_AvatarView {
    public static final int $stable = 8;
    private final ImageView avatarImg;
    private final TextView avatarTxt;
    public ImageLoader imageLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C11839R.layout.merge_avatar_view, true);
        View viewFindViewById = findViewById(C11839R.id.avatar_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.avatarTxt = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C11839R.id.avatar_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.avatarImg = (ImageView) viewFindViewById2;
    }

    public /* synthetic */ AvatarView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
    }

    public static /* synthetic */ void bind$default(AvatarView avatarView, String str, HttpUrl httpUrl, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        avatarView.bind(str, httpUrl);
    }

    public final void bind(final String avatarText, HttpUrl avatarUrl) {
        Intrinsics.checkNotNullParameter(avatarText, "avatarText");
        if (avatarUrl != null) {
            this.avatarTxt.setText((CharSequence) null);
            ImageLoader.ImageRequest.DefaultImpls.into$default(getImageLoader().load(avatarUrl), this.avatarImg, null, new Function0() { // from class: com.robinhood.android.common.ui.AvatarView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AvatarView.bind$lambda$0(this.f$0, avatarText);
                }
            }, 2, null);
        } else {
            this.avatarTxt.setText(avatarText);
            getImageLoader().cancelRequest(this.avatarImg);
            this.avatarImg.setImageDrawable(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(AvatarView avatarView, String str) {
        avatarView.avatarTxt.setText(str);
        return Unit.INSTANCE;
    }
}
