package com.codegrace.Saklo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0016J\"\u0010\u0019\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/codegrace/Saklo/RemediesSQLiteHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "preferences", "Landroid/content/SharedPreferences;", "getAllRemedies", "Ljava/util/ArrayList;", "Lcom/codegrace/Saklo/RemediesModel;", "Lkotlin/collections/ArrayList;", "getReadableDatabase", "Landroid/database/sqlite/SQLiteDatabase;", "getRemedies", "searchQuery", "", "installDatabaseFromAssets", "", "installOrUpdateIfNecessary", "installedDatabaseIsOutdated", "", "onCreate", "db", "onUpgrade", "oldVersion", "", "newVersion", "writeDatabaseVersionInPreferences", "Companion", "app_debug"})
public final class RemediesSQLiteHelper extends android.database.sqlite.SQLiteOpenHelper {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    private final android.content.SharedPreferences preferences = null;
    @org.jetbrains.annotations.NotNull
    public static final com.codegrace.Saklo.RemediesSQLiteHelper.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ASSETS_PATH = "database";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DATABASE_NAME = "remedies2";
    public static final int DATABASE_VERSION = 1;
    
    public RemediesSQLiteHelper(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, null, 0);
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    private final boolean installedDatabaseIsOutdated() {
        return false;
    }
    
    private final void writeDatabaseVersionInPreferences() {
    }
    
    private final void installDatabaseFromAssets() {
    }
    
    @kotlin.jvm.Synchronized
    private final synchronized void installOrUpdateIfNecessary() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.database.sqlite.SQLiteDatabase getReadableDatabase() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.database.sqlite.SQLiteDatabase db) {
    }
    
    @java.lang.Override
    public void onUpgrade(@org.jetbrains.annotations.Nullable
    android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.codegrace.Saklo.RemediesModel> getRemedies(@org.jetbrains.annotations.Nullable
    java.lang.String searchQuery) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.codegrace.Saklo.RemediesModel> getAllRemedies() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/codegrace/Saklo/RemediesSQLiteHelper$Companion;", "", "()V", "ASSETS_PATH", "", "DATABASE_NAME", "DATABASE_VERSION", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}