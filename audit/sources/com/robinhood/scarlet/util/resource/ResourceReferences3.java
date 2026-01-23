package com.robinhood.scarlet.util.resource;

import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ResourceReferences.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0006\u001a\u0004\u0018\u00018\u00002\n\u0010\u0007\u001a\u00060\bR\u00020\tH&¢\u0006\u0002\u0010\nJ2\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\f0\u0000\"\b\b\u0001\u0010\f*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\n\u0010\u0007\u001a\u00060\bR\u00020\tH&\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/Resource;", "T", "", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "<init>", "()V", "get", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources$Theme;)Ljava/lang/Object;", "convertTo", "R", "targetType", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "Lcom/robinhood/scarlet/util/resource/ResourceValue;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.scarlet.util.resource.Resource, reason: use source file name */
/* loaded from: classes21.dex */
public abstract class ResourceReferences3<T> extends ResourceReferences4<T> {
    public static final int $stable = 0;

    public /* synthetic */ ResourceReferences3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract <R> ResourceReferences3<R> convertTo(ResourceType<R> targetType, Resources.Theme theme);

    public abstract T get(Resources.Theme theme);

    private ResourceReferences3() {
        super(null);
    }
}
