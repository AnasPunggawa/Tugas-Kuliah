extends Area

export(String, FILE, "*.tscn") var NEXT_LEVEL = ""

func _on_VictoryZone_body_entered(body):
	if body.name == "Ball":
		get_tree().change_scene(NEXT_LEVEL)


func _on_backToMenu_pressed():
	get_tree().change_scene("res://menu/mainMenu.tscn")


func _on_playAgain_pressed():
	get_tree().change_scene("res://environment/Level01.tscn")
