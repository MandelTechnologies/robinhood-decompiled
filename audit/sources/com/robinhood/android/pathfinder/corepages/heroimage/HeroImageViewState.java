package com.robinhood.android.pathfinder.corepages.heroimage;

import com.robinhood.models.p355ui.pathfinder.contexts.HeroImageContext;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HeroImageViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageViewState;", "", "<init>", "()V", "Loaded", "Error", "Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageViewState$Error;", "Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageViewState$Loaded;", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class HeroImageViewState {
    public static final int $stable = 0;

    public /* synthetic */ HeroImageViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private HeroImageViewState() {
    }

    /* compiled from: HeroImageViewState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageViewState$Loaded;", "Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageViewState;", "context", "Lcom/robinhood/models/ui/pathfinder/contexts/HeroImageContext;", "inputUpdateSource", "Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageViewState$Loaded$InputUpdateSource;", "<init>", "(Lcom/robinhood/models/ui/pathfinder/contexts/HeroImageContext;Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageViewState$Loaded$InputUpdateSource;)V", "getContext", "()Lcom/robinhood/models/ui/pathfinder/contexts/HeroImageContext;", "getInputUpdateSource", "()Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageViewState$Loaded$InputUpdateSource;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "InputUpdateSource", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends HeroImageViewState {
        public static final int $stable = 8;
        private final HeroImageContext context;
        private final InputUpdateSource inputUpdateSource;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, HeroImageContext heroImageContext, InputUpdateSource inputUpdateSource, int i, Object obj) {
            if ((i & 1) != 0) {
                heroImageContext = loaded.context;
            }
            if ((i & 2) != 0) {
                inputUpdateSource = loaded.inputUpdateSource;
            }
            return loaded.copy(heroImageContext, inputUpdateSource);
        }

        /* renamed from: component1, reason: from getter */
        public final HeroImageContext getContext() {
            return this.context;
        }

        /* renamed from: component2, reason: from getter */
        public final InputUpdateSource getInputUpdateSource() {
            return this.inputUpdateSource;
        }

        public final Loaded copy(HeroImageContext context, InputUpdateSource inputUpdateSource) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(inputUpdateSource, "inputUpdateSource");
            return new Loaded(context, inputUpdateSource);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.context, loaded.context) && this.inputUpdateSource == loaded.inputUpdateSource;
        }

        public int hashCode() {
            return (this.context.hashCode() * 31) + this.inputUpdateSource.hashCode();
        }

        public String toString() {
            return "Loaded(context=" + this.context + ", inputUpdateSource=" + this.inputUpdateSource + ")";
        }

        public final HeroImageContext getContext() {
            return this.context;
        }

        public /* synthetic */ Loaded(HeroImageContext heroImageContext, InputUpdateSource inputUpdateSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(heroImageContext, (i & 2) != 0 ? InputUpdateSource.NONE : inputUpdateSource);
        }

        public final InputUpdateSource getInputUpdateSource() {
            return this.inputUpdateSource;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(HeroImageContext context, InputUpdateSource inputUpdateSource) {
            super(null);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(inputUpdateSource, "inputUpdateSource");
            this.context = context;
            this.inputUpdateSource = inputUpdateSource;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: HeroImageViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageViewState$Loaded$InputUpdateSource;", "", "<init>", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "NONE", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class InputUpdateSource {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ InputUpdateSource[] $VALUES;
            public static final InputUpdateSource PRIMARY = new InputUpdateSource("PRIMARY", 0);
            public static final InputUpdateSource SECONDARY = new InputUpdateSource("SECONDARY", 1);
            public static final InputUpdateSource NONE = new InputUpdateSource("NONE", 2);

            private static final /* synthetic */ InputUpdateSource[] $values() {
                return new InputUpdateSource[]{PRIMARY, SECONDARY, NONE};
            }

            public static EnumEntries<InputUpdateSource> getEntries() {
                return $ENTRIES;
            }

            private InputUpdateSource(String str, int i) {
            }

            static {
                InputUpdateSource[] inputUpdateSourceArr$values = $values();
                $VALUES = inputUpdateSourceArr$values;
                $ENTRIES = EnumEntries2.enumEntries(inputUpdateSourceArr$values);
            }

            public static InputUpdateSource valueOf(String str) {
                return (InputUpdateSource) Enum.valueOf(InputUpdateSource.class, str);
            }

            public static InputUpdateSource[] values() {
                return (InputUpdateSource[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: HeroImageViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageViewState$Error;", "Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageViewState;", "<init>", "()V", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error extends HeroImageViewState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }
}
