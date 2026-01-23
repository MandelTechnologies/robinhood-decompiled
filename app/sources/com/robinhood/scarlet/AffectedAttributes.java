package com.robinhood.scarlet;

import android.content.res.Resources;
import com.robinhood.scarlet.AffectedAttributes;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* compiled from: AffectedAttributes.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \b2\u00020\u0001:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/scarlet/AffectedAttributes;", "", "<init>", "()V", "toString", "", "NameSet", "Everything", "Companion", "Lcom/robinhood/scarlet/AffectedAttributes$Everything;", "Lcom/robinhood/scarlet/AffectedAttributes$NameSet;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public abstract class AffectedAttributes {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ AffectedAttributes(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String toString();

    private AffectedAttributes() {
    }

    /* compiled from: AffectedAttributes.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/scarlet/AffectedAttributes$NameSet;", "Lcom/robinhood/scarlet/AffectedAttributes;", "<init>", "()V", "attributeNames", "", "", "getAttributeNames", "()Ljava/util/Set;", "Allowlist", "Blocklist", "Lcom/robinhood/scarlet/AffectedAttributes$NameSet$Allowlist;", "Lcom/robinhood/scarlet/AffectedAttributes$NameSet$Blocklist;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class NameSet extends AffectedAttributes {
        public static final int $stable = 0;

        public /* synthetic */ NameSet(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract Set<String> getAttributeNames();

        private NameSet() {
            super(null);
        }

        /* compiled from: AffectedAttributes.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0007\"\u00020\u0004¢\u0006\u0004\b\u0005\u0010\bJ\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/scarlet/AffectedAttributes$NameSet$Allowlist;", "Lcom/robinhood/scarlet/AffectedAttributes$NameSet;", "attributeNames", "", "", "<init>", "(Ljava/util/Set;)V", "", "([Ljava/lang/String;)V", "getAttributeNames", "()Ljava/util/Set;", "toString", "component1", "copy", "equals", "", "other", "", "hashCode", "", "Companion", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Allowlist extends NameSet {
            private final Set<String> attributeNames;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Allowlist copy$default(Allowlist allowlist, Set set, int i, Object obj) {
                if ((i & 1) != 0) {
                    set = allowlist.attributeNames;
                }
                return allowlist.copy(set);
            }

            public final Set<String> component1() {
                return this.attributeNames;
            }

            public final Allowlist copy(Set<String> attributeNames) {
                Intrinsics.checkNotNullParameter(attributeNames, "attributeNames");
                return new Allowlist(attributeNames);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Allowlist) && Intrinsics.areEqual(this.attributeNames, ((Allowlist) other).attributeNames);
            }

            public int hashCode() {
                return this.attributeNames.hashCode();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Allowlist(Set<String> attributeNames) {
                super(null);
                Intrinsics.checkNotNullParameter(attributeNames, "attributeNames");
                this.attributeNames = attributeNames;
            }

            @Override // com.robinhood.scarlet.AffectedAttributes.NameSet
            public Set<String> getAttributeNames() {
                return this.attributeNames;
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public Allowlist(String... attributeNames) {
                this((Set<String>) ArraysKt.toSet(attributeNames));
                Intrinsics.checkNotNullParameter(attributeNames, "attributeNames");
            }

            @Override // com.robinhood.scarlet.AffectedAttributes
            public String toString() {
                return CollectionsKt.joinToString$default(getAttributeNames(), ",", null, null, 0, null, null, 62, null);
            }

            /* compiled from: AffectedAttributes.kt */
            @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\b\u0001\u0010\b\u001a\u00020\t\"\u00020\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/scarlet/AffectedAttributes$NameSet$Allowlist$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/scarlet/AffectedAttributes$NameSet$Allowlist;", "resources", "Landroid/content/res/Resources;", "attributeIds", "", "", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final Allowlist from(Resources resources, int... attributeIds) {
                    Intrinsics.checkNotNullParameter(resources, "resources");
                    Intrinsics.checkNotNullParameter(attributeIds, "attributeIds");
                    return new Allowlist(AffectedAttributes.INSTANCE.getAttributeNames(resources, attributeIds));
                }
            }
        }

        /* compiled from: AffectedAttributes.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0007\"\u00020\u0004¢\u0006\u0004\b\u0005\u0010\bJ\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/scarlet/AffectedAttributes$NameSet$Blocklist;", "Lcom/robinhood/scarlet/AffectedAttributes$NameSet;", "attributeNames", "", "", "<init>", "(Ljava/util/Set;)V", "", "([Ljava/lang/String;)V", "getAttributeNames", "()Ljava/util/Set;", "toString", "component1", "copy", "equals", "", "other", "", "hashCode", "", "Companion", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Blocklist extends NameSet {
            private final Set<String> attributeNames;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Blocklist copy$default(Blocklist blocklist, Set set, int i, Object obj) {
                if ((i & 1) != 0) {
                    set = blocklist.attributeNames;
                }
                return blocklist.copy(set);
            }

            public final Set<String> component1() {
                return this.attributeNames;
            }

            public final Blocklist copy(Set<String> attributeNames) {
                Intrinsics.checkNotNullParameter(attributeNames, "attributeNames");
                return new Blocklist(attributeNames);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Blocklist) && Intrinsics.areEqual(this.attributeNames, ((Blocklist) other).attributeNames);
            }

            public int hashCode() {
                return this.attributeNames.hashCode();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Blocklist(Set<String> attributeNames) {
                super(null);
                Intrinsics.checkNotNullParameter(attributeNames, "attributeNames");
                this.attributeNames = attributeNames;
            }

            @Override // com.robinhood.scarlet.AffectedAttributes.NameSet
            public Set<String> getAttributeNames() {
                return this.attributeNames;
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public Blocklist(String... attributeNames) {
                this((Set<String>) ArraysKt.toSet(attributeNames));
                Intrinsics.checkNotNullParameter(attributeNames, "attributeNames");
            }

            @Override // com.robinhood.scarlet.AffectedAttributes
            public String toString() {
                return CollectionsKt.joinToString$default(getAttributeNames(), ",", "!", null, 0, null, null, 60, null);
            }

            /* compiled from: AffectedAttributes.kt */
            @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\b\u0001\u0010\b\u001a\u00020\t\"\u00020\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/scarlet/AffectedAttributes$NameSet$Blocklist$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/scarlet/AffectedAttributes$NameSet$Allowlist;", "resources", "Landroid/content/res/Resources;", "attributeIds", "", "", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final Allowlist from(Resources resources, int... attributeIds) {
                    Intrinsics.checkNotNullParameter(resources, "resources");
                    Intrinsics.checkNotNullParameter(attributeIds, "attributeIds");
                    return new Allowlist(AffectedAttributes.INSTANCE.getAttributeNames(resources, attributeIds));
                }
            }
        }
    }

    /* compiled from: AffectedAttributes.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/scarlet/AffectedAttributes$Everything;", "Lcom/robinhood/scarlet/AffectedAttributes;", "<init>", "()V", "toString", "", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Everything extends AffectedAttributes {
        public static final int $stable = 0;
        public static final Everything INSTANCE = new Everything();

        private Everything() {
            super(null);
        }

        @Override // com.robinhood.scarlet.AffectedAttributes
        public String toString() {
            return "*";
        }
    }

    /* compiled from: AffectedAttributes.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0004¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/scarlet/AffectedAttributes$Companion;", "", "<init>", "()V", "parse", "Lcom/robinhood/scarlet/AffectedAttributes;", "input", "", "getAttributeNames", "", "Landroid/content/res/Resources;", "attributeIds", "", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AffectedAttributes parse(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            String string2 = StringsKt.trim(input).toString();
            if (Intrinsics.areEqual(string2, "*")) {
                return Everything.INSTANCE;
            }
            boolean zStartsWith$default = StringsKt.startsWith$default((CharSequence) string2, '!', false, 2, (Object) null);
            if (zStartsWith$default) {
                string2 = string2.substring(1);
                Intrinsics.checkNotNullExpressionValue(string2, "substring(...)");
            }
            Set set = SequencesKt.toSet(SequencesKt.mapNotNull(StringsKt.splitToSequence$default(string2, new char[]{','}, false, 0, 6, null), new Function1() { // from class: com.robinhood.scarlet.AffectedAttributes$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AffectedAttributes.Companion.parse$lambda$0((String) obj);
                }
            }));
            return zStartsWith$default ? new NameSet.Blocklist((Set<String>) set) : new NameSet.Allowlist((Set<String>) set);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parse$lambda$0(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return com.robinhood.utils.extensions.StringsKt.nullIfEmpty(StringsKt.trim(it).toString());
        }

        protected final Set<String> getAttributeNames(Resources resources, int[] attributeIds) {
            Intrinsics.checkNotNullParameter(resources, "<this>");
            Intrinsics.checkNotNullParameter(attributeIds, "attributeIds");
            LinkedHashSet linkedHashSet = new LinkedHashSet(attributeIds.length);
            for (int i : attributeIds) {
                linkedHashSet.add(resources.getResourceEntryName(i));
            }
            Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
            Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
            return setUnmodifiableSet;
        }
    }
}
