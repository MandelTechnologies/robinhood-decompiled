package com.withpersona.sdk2.inquiry.shared;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResTools.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u001a2\u0010\b\u001a\u00020\u0007*\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007\u001a1\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\r\u001a!\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"getColorFromAttr", "", "Landroid/content/Context;", "attrColor", "typedValue", "Landroid/util/TypedValue;", "resolveRefs", "", "boolFromAttr", "attrBool", "defaultValue", "resourceIdFromAttr", "attrImage", "(Landroid/content/Context;ILandroid/util/TypedValue;Z)Ljava/lang/Integer;", "resourceIdFromName", "resourceName", "", "resourceType", "Lcom/withpersona/sdk2/inquiry/shared/ResourceType;", "(Landroid/content/Context;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/ResourceType;)Ljava/lang/Integer;", "shared_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.shared.ResToolsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class ResTools {
    public static /* synthetic */ int getColorFromAttr$default(Context context, int i, TypedValue typedValue, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        return getColorFromAttr(context, i, typedValue, z);
    }

    public static final int getColorFromAttr(Context context, int i, TypedValue typedValue, boolean z) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(typedValue, "typedValue");
        context.getTheme().resolveAttribute(i, typedValue, z);
        return typedValue.data;
    }

    public static /* synthetic */ boolean boolFromAttr$default(Context context, int i, TypedValue typedValue, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        return boolFromAttr(context, i, typedValue, z, z2);
    }

    public static final boolean boolFromAttr(Context context, int i, TypedValue typedValue, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(typedValue, "typedValue");
        return (context.getTheme().resolveAttribute(i, typedValue, z) && typedValue.type == 18) ? typedValue.data != 0 : z2;
    }

    public static /* synthetic */ Integer resourceIdFromAttr$default(Context context, int i, TypedValue typedValue, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        return resourceIdFromAttr(context, i, typedValue, z);
    }

    public static final Integer resourceIdFromAttr(Context context, int i, TypedValue typedValue, boolean z) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(typedValue, "typedValue");
        context.getTheme().resolveAttribute(i, typedValue, z);
        if (typedValue.type == 0) {
            return null;
        }
        return Integer.valueOf(typedValue.resourceId);
    }

    public static final Integer resourceIdFromName(Context context, String resourceName, ResTools2 resourceType) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(resourceName, "resourceName");
        Intrinsics.checkNotNullParameter(resourceType, "resourceType");
        String formattedResourceName = ExtensionsKt.getFormattedResourceName(resourceName);
        String resourcePackageName = context.getResources().getResourcePackageName(R$id.pi2_dummy_package_resource);
        int identifier = context.getResources().getIdentifier(formattedResourceName, resourceType.name(), resourcePackageName);
        if (identifier <= 0) {
            Resources resources = context.getResources();
            String lowerCase = resourceType.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            identifier = resources.getIdentifier(formattedResourceName, lowerCase, resourcePackageName);
        }
        if (identifier > 0) {
            return Integer.valueOf(identifier);
        }
        return null;
    }
}
