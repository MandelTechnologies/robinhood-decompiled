package com.robinhood.scarlet.util.resource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResourceReferences.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/UnresolvedResourceException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "reference", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "description", "", "theme", "<init>", "(Lcom/robinhood/scarlet/util/resource/ResourceReference;Ljava/lang/String;Ljava/lang/String;)V", "getReference", "()Lcom/robinhood/scarlet/util/resource/ResourceReference;", "getDescription", "()Ljava/lang/String;", "getTheme", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.scarlet.util.resource.UnresolvedResourceException, reason: use source file name */
/* loaded from: classes26.dex */
public final class ResourceReferences9 extends Exception {
    public static final int $stable = 8;
    private final String description;
    private final ResourceReferences4<?> reference;
    private final String theme;

    public final ResourceReferences4<?> getReference() {
        return this.reference;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTheme() {
        return this.theme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourceReferences9(ResourceReferences4<?> reference, String description, String theme) {
        super(description + " could not be resolved (" + reference + ") in theme " + theme);
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.reference = reference;
        this.description = description;
        this.theme = theme;
    }
}
