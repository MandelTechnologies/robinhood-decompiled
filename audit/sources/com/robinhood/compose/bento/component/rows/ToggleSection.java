package com.robinhood.compose.bento.component.rows;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoToggleRow.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/ToggleSection;", "", "title", "", "models", "", "Lcom/robinhood/compose/bento/component/rows/ToggleModel;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getModels", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
final /* data */ class ToggleSection {
    private final List<ToggleModel> models;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ToggleSection copy$default(ToggleSection toggleSection, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toggleSection.title;
        }
        if ((i & 2) != 0) {
            list = toggleSection.models;
        }
        return toggleSection.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<ToggleModel> component2() {
        return this.models;
    }

    public final ToggleSection copy(String title, List<ToggleModel> models) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(models, "models");
        return new ToggleSection(title, models);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToggleSection)) {
            return false;
        }
        ToggleSection toggleSection = (ToggleSection) other;
        return Intrinsics.areEqual(this.title, toggleSection.title) && Intrinsics.areEqual(this.models, toggleSection.models);
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.models.hashCode();
    }

    public String toString() {
        return "ToggleSection(title=" + this.title + ", models=" + this.models + ")";
    }

    public ToggleSection(String title, List<ToggleModel> models) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(models, "models");
        this.title = title;
        this.models = models;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<ToggleModel> getModels() {
        return this.models;
    }
}
