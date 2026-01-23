package com.robinhood.android.common.shareholder.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.robinhood.android.common.shareholder.C11820R;
import com.robinhood.android.designsystem.infotag.RdsInfoTag;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.models.serverdriven.experimental.api.InfoTagType;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.extensions.ViewsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LiveInfoTag.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007JA\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0002\u0010\u0015J\f\u0010\u0016\u001a\u00020\u0017*\u00020\u000bH\u0002¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/shareholder/view/LiveInfoTag;", "Lcom/robinhood/android/designsystem/infotag/RdsInfoTag;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "setInfoTagData", "", "tagType", "Lcom/robinhood/models/serverdriven/experimental/api/InfoTagType;", "tagDrawableId", "", "tagText", "", "callback", "Landroid/graphics/drawable/Drawable$Callback;", "isLive", "", "shouldAnimate", "(Lcom/robinhood/models/serverdriven/experimental/api/InfoTagType;Ljava/lang/Integer;Ljava/lang/String;Landroid/graphics/drawable/Drawable$Callback;ZZ)V", "toRdsType", "Lcom/robinhood/android/designsystem/infotag/RdsInfoTag$TagType;", "feature-lib-shareholderx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LiveInfoTag extends RdsInfoTag {

    /* compiled from: LiveInfoTag.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InfoTagType.values().length];
            try {
                iArr[InfoTagType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InfoTagType.ALERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InfoTagType.INFORM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InfoTagType.INLINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InfoTagType.GOLD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ LiveInfoTag(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveInfoTag(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setInfoTagData$default(LiveInfoTag liveInfoTag, InfoTagType infoTagType, Integer num, String str, Drawable.Callback callback, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        Integer num2 = num;
        if ((i & 32) != 0) {
            z2 = true;
        }
        liveInfoTag.setInfoTagData(infoTagType, num2, str, callback, z, z2);
    }

    public final void setInfoTagData(InfoTagType tagType, Integer tagDrawableId, String tagText, Drawable.Callback callback, boolean isLive, boolean shouldAnimate) {
        Intrinsics.checkNotNullParameter(tagType, "tagType");
        Intrinsics.checkNotNullParameter(tagText, "tagText");
        Intrinsics.checkNotNullParameter(callback, "callback");
        setText(tagText);
        if (isLive) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            LiveInfoTagPulseDrawable liveInfoTagPulseDrawable = new LiveInfoTagPulseDrawable(context);
            liveInfoTagPulseDrawable.setCallback(callback);
            liveInfoTagPulseDrawable.setShouldAnimate(shouldAnimate);
            setIconDrawable(liveInfoTagPulseDrawable);
            RhTextView infoTagText = getInfoTagText();
            ResourceType.STYLE style = ResourceType.STYLE.INSTANCE;
            ScarletManager2.overrideStyle$default(infoTagText, new ThemedResourceReference(style, C11820R.attr.liveInfoTagTextStyle), false, 2, null);
            ScarletManager2.overrideStyle$default(getInfoTagIcon(), new ThemedResourceReference(style, C11820R.attr.liveInfoTagIconStyle), false, 2, null);
            ScarletManager2.overrideStyle$default(this, new ThemedResourceReference(style, C11820R.attr.liveInfoTagStyle), false, 2, null);
            return;
        }
        if (tagDrawableId != null) {
            setIconDrawable(ViewsKt.getDrawable(this, tagDrawableId.intValue()));
        }
        setTagType(toRdsType(tagType));
    }

    private final RdsInfoTag.TagType toRdsType(InfoTagType infoTagType) {
        int i = WhenMappings.$EnumSwitchMapping$0[infoTagType.ordinal()];
        if (i == 1 || i == 2) {
            return RdsInfoTag.TagType.ALERT;
        }
        if (i == 3) {
            return RdsInfoTag.TagType.INFORM;
        }
        if (i == 4) {
            return RdsInfoTag.TagType.INLINE;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return RdsInfoTag.TagType.GOLD;
    }
}
